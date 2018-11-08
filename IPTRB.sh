#!/bin/bash

if [ "$(which tcpdump)" -eq "" ]
then
   echo "Please install tcpdump package. i.e."
   echo "apt-get install tcpdump"
   exit
fi 

if [ "$(which iptables)" -eq "" ]
then
   echo "Your system does not support iptables"
   exit
fi

if [ test "$(which dialog)" -eq "" ]
then
   echo "Please install dialog package. i.e."
   echo "apt-get install dialog"
fi

dialog --menu "Select interface" 0 0 0 $(ip a s | grep -v "^[[:space:]]" | sed -e "s/:[^:]*$//g" -e "s/://g" | tr "\n" " ") 2>/tmp/ans

interface=$(ip a s | grep "^$(cat /tmp/ans)" | cut -d: -f 2 | sed -e "s/^[[:space:]]*//g")

dialog --inputbox "Write your BPF filter here"  0 0 2>/tmp/ans
filter="$(cat /tmp/ans)"

echo "iptables -t filter -A INPUT -m bpf --bytecode \"$(tcpdump -p -ni $interface -ddd "$filter" | tr "\n" "," | sed -e "s/,$//g" -e "s/,/,\\\\\n/g")\" -j DROP" > /tmp/ans

dialog --title "iptables command view" --textbox /tmp/ans 0 0

dialog --title "iptables command" --msgbox "The generated iptables command was saved to /tmp/ans" 0 0 
