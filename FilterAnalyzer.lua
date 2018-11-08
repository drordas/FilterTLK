--Function that scan a dir to know if is empty or not.
function scandir(directory)
	local i, t, popen = 0, {}, io.popen
	local pfile = popen('ls -a "'..directory..'"')
	for filename in pfile:lines() do
		if filename ~= '.' and filename ~= '..' then
			i = i + 1
			t[i] = filename
		end
	end
	pfile:close()
	return t
end
 
--Function that return true if the directory is empty.
function isemptydir(directory)

	return #scandir(directory) == 0
end

--Function that create a pcap.
--dir = name of the dir to create || filter = name of filter to apply
local function createPcap(dir, filter)
	local dumpers = {}

	-- create a listener tap.  By default it creates one for "frame", but we're tapping IP layer.
	-- Valid values can be any protocol with tapping support, but to get something useful in the
	-- "extractor" argument of the tap's 'packet' function callback (the third argument passed by
	-- wireshark into it), it has to be one of the following currently: 
	-- "actrace", "ansi_a", "ansi_map", "bacapp", "eth", "h225", "http", "ip", "ldap", 
	-- "smb", "smb2", "tcp", "udp", "wlan", and "frame"
	local tap = Listener.new("ip",filter)

	function tap.packet(pinfo,tvb,ip)
		--print("packet called").
		local ip_src, ip_dst = tostring(ip.ip_src), tostring(ip.ip_dst)
		local src_dmp, dst_dmp

		-- get the dumper file handle for this ip addr.
		src_dmp = dumpers[ip_src]
		if not src_dmp then
			-- doesn't exist, make a new one, of the same encapsulation type as current file.
			src_dmp = Dumper.new_for_current( "/tmp/filters/" .. dir .. "/" .. ip_src .. ".pcap" )
			dumpers[ip_src] = src_dmp
		end

		-- dump the current packet as it is (same encap format and content).
		src_dmp:dump_current()
		src_dmp:flush()

		-- now do the same for dest addr.
		dst_dmp = dumpers[ip_dst]
		if not dst_dmp then
			dst_dmp = Dumper.new_for_current( "/tmp/filters/" .. dir .. "/" .. ip_dst .. ".pcap" )
			dumpers[ip_dst] = dst_dmp
		end

		dst_dmp:dump_current()
		dst_dmp:flush()

	end

	-- a listener tap's draw function is called every few seconds in the GUI
	-- and at end of file (once) in tshark.
	function tap.draw()
		--print("draw called").
		for ip_addr,dumper in pairs(dumpers) do
			dumper:flush()
		end
	end

	-- a listener tap's reset function is called at the end of a live capture run,
	-- when a file is opened, or closed.  Tshark never appears to call it.
	function tap.reset()
		--print("reset called").
		for ip_addr,dumper in pairs(dumpers) do
			dumper:close()
		end
		dumpers = {}
	end
end

--Function that count the packets.
--filter = filter to apply || np = number of packets to return
function countPackets(filter, np)

	local tap = Listener.new("ip", filter)
	local num = 0
	--np = -1

	function tap.draw()
		np = num
	end

	function tap.packet(pinfo,tvb,ip)
		num = num + 1
	end

	function tap.reset()
		num = 0
	end
	retap_packets()
	return np
end

--Function that load a filter from one file.
local function charge()
	if not gui_enabled() then return end

	--Create new text window
	local win = TextWindow.new("Load a File")

	--Deny to edit the window
	win:set_editable(false)

	--Function that allows to load the file
	local function send(name)
		--Open the file
		file = io.open("/tmp/created/" .. name, "r")
		
		--If file is empty throw an error, else apply the filters that it contains
		if file ~= nil then

			win:close()
			for line in file:lines() do 
				d = string.gsub(line, " ", "")
				d = d:gsub('"', "")
				d = d:gsub("<", "min")
				d = d:gsub(">", "max")
				--remove white spaces in line
				dir = d:gsub("%s+", "_")
				--remove the brackets in line
				dir = dir:gsub("%p", "_")
				--dir = dir:gsub("%)", "")
				--Make a dir (if not exists) that will contains the pcaps of the filters
				os.execute("mkdir -p /tmp/filters/" .. dir)

				totalPcts = 0
				pctsAccept = 0
				pctsError = 0
				--Count the total packets of the pcap
				totalPcts = countPackets("ip", totalPcts)

				--Sets the text of the display filter textbox in the GUI
				set_filter(line)
				
				--Applies the current text in the display filter textbox to the current capture
				apply_filter()

				--create a pcap
				createPcap(dir, line)

				--Count the packets accepted by the filter
				pctsAccept = countPackets(line, pctsAccept)

				--Count the packets denied by the filter
				pctsError = totalPcts - pctsAccept

				--Create a dir "results" that will contains the number of packets filtered (total, accepted and denied)
				os.execute("mkdir -p " .. "/tmp/results/")
				--Create a file with the results
				
				file2 = io.open("/tmp/results/"..d..".txt", "w")
				--Write the results in the file
				file2:write("Total: " .. totalPcts..
					"\nAccepted: " .. pctsAccept..
					"\nDenied: " .. pctsError)
				--Close the file
				file2:close()

			end
		else
			
			win:clear()
			win:append("Error, no such file or is empty")
		
		end

		--Ensure that all existing packets are processed.
		retap_packets()
	end

	--Function that allows to load the name of the filters files to load.
	local function load()
		
		--Open filters files. 
		file = io.popen('ls /tmp/created/')
		
		if isemptydir("/tmp/created/") == false then
			--Loop that runs through all the files in the directory showing their names.
			i = 0
			for name in file:lines() do 
				
				--Append file's name
				win:append(i .. ". " .. string.upper(name) .. "\n")
				
				--Add a button to select the file
				win:add_button(i, function() send(name) end)

				win:append("\n")
				i = i + 1
			end
		else
			win:append("There are no filters files to load.")
		end
	end

	load()

	--Remove the window when you close it
	win:set_atclose(function() win:clear() end)			
end

--Function that allows to consult the results obtained.
local function consult()

	if not gui_enabled() then return end

	--Create new text window
	local win = TextWindow.new("Select a results file.")

	--Function that load the selected pcap.
	--name = route of the pcap || pcap = name of the pcap.
	local function loadPcap(dir, pcap)
		if isemptydir("/tmp/filters/" .. dir .. "/") == false then
			--Open the capture file
			open_capture_file( "/tmp/filters/" .. dir .. "/" .. pcap, "")
		else
			win2:append("No such file or directory.")
		end
	end

	--Function that open a new TextWindow to select a file to load a pcap
	--name = dir. that contains the pcaps.
	local function select(name)

		--remove the extension of the file
		dir = string.gsub(name, ".txt", "")
		--remove white spaces in line
		dir = dir:gsub("%s+", "_")
		--remove the brackets in line
		dir = dir:gsub("%p", "_")

		local win2 = TextWindow.new("Select a pcap.")

		pcapF = io.open("/tmp/filters/" .. dir, "r")

		if pcapF ~= nil and isemptydir("/tmp/filters/" .. dir) == false then
			pcapFile = io.popen('ls ' .. "/tmp/filters/" .. dir)
			i = 1

			for na in pcapFile:lines() do 
				
				--Append file's name
				win2:append(i .. ". " .. string.upper(na) .. "\n")
				--Open the file 
				content = io.open("/tmp/results/" .. na, "r")

				win2:add_button(i, function() loadPcap(dir, na) end)

				--Append content's file to the window
				if content ~= nil then
					for x in content:lines() do
						win2:append("\t" .. x .. "\n")
					end
					content:close()
				end
				win2:append("\n")
				i = i + 1
			end
		else
			win2:append("No pcaps available.")
		end
	end

	--Function that load the dir. made previously selecting Load_Filter_From_File
	local function load()
		
		--Open results dir. that contains the results obtained previously
		dirname = '/tmp/results/.'
		f = io.popen('ls ' .. dirname)

		i = 1

		if isemptydir(dirname) == false then
			--Loop that runs through all the files in the directory showing their names.
			for name in f:lines() do 
				
				show = string.gsub(name, "min", "<")
				show = show:gsub("max", ">")
				--Append file's name
				win:append(i .. ". " .. string.upper(show) .. "\n")
				--Open the file 
				content = io.open("/tmp/results/" .. name, "r")

				win:add_button(i, function() select(name) end)

				--Append content's file to the window
				if content ~= nil then
					for x in content:lines() do
						win:append("\t" .. x .. "\n")
					end
					content:close()
				end
				win:append("\n")
				i = i + 1
			end
		else
			win:append("The directory is empty.")
		end
	end

	--Call to the function load
	load()

	--Remove the window when you close it
	win:set_atclose(function() win:clear() end)
end

--Function that allows to reset the results.
local function reset()
	if not gui_enabled() then return end

	--Create new text window.
	local win = TextWindow.new("Select an option to do.")

	--Add info of the button aplications.
	win:append("Click on the option you want to make.\n\n")
	win:append("1. Reset All:\n")
	win:append("\tDeletes all directories and files (info, \n\tpcaps...) obtained when loading filters before.\n\n")
	win:append("2. Reset One Filter:\n")
	win:append("\tRemove a specific pcap that is selected by the user.")

	--Function that deletes all files and directories obtained when loading filters before.
	local function resetAll()
		
		--results = io.open("ls results/", "r")
		--Remove results dir if exists.
		if isemptydir("/tmp/results/") == false then
			os.execute("rm -r " .. "/tmp/results/")
		end

		--filters = io.open("ls filters/", "r")
		--Remove filters dir if exists.
		if isemptydir("/tmp/filters/") == false then
			os.execute("rm -r " .. "/tmp/filters/")
		end
		--Close the window.
		win:close()
	end

	--Function that deletes all files in the directory dir.
	--dir = The directory to remove.
	local function delete(dir)
		name = string.gsub(dir, ".txt", "")
		--remove white spaces in line.
		name = name:gsub("%s+", "_")
		--remove the brackets in line.
		name = name:gsub("%p", "_")
		win2:clear()
		win2:close()
		os.execute("rm -r " .. "/tmp/filters/" .. name)
		os.execute("rm -r " .. "/tmp/results/" .. dir)
	end

	--Function that remove a specific pcap that is selected by the user.
	local function resetOne()
		win:close()
		win2 = TextWindow.new("Select a dir to delete.")

		file = io.popen("ls /tmp/results/", "r")

		if isemptydir("/tmp/results/") == false then
			i = 1

			for na in file:lines() do 
				
				--remove the extension of the file
				n = string.gsub(na, ".txt", "")
				n = n:gsub("min", "<")
				n = n:gsub("max", ">")
				--Append file's name
				win2:append(i .. ". " .. string.upper(n) .. "\n")
			
				win2:add_button(i, function() delete(na) end)

				win2:append("\n")
				i = i + 1
			end
		else
			win2:append("No directories or files availables.")
		end
	end

	--Remove the window when you close it.
	win:set_atclose(function() win:clear() end)

	--Button that allows to remove all files.
	win:add_button("Reset All", function() resetAll() end)	

	--Button that allows to remove a specific filter.
	win:add_button("Reset One Filter", function() resetOne() end)		
end

--Register menu.
register_menu("Filter/1.Load Filter From File", charge, MENU_TOOLS_UNSORTED)
register_menu("Filter/2.Search Filter Loaded", consult, MENU_TOOLS_UNSORTED)
register_menu("Filter/3.Filter Reset", reset, MENU_TOOLS_UNSORTED)