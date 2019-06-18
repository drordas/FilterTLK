[![DOI](https://zenodo.org/badge/156728456.svg)](https://zenodo.org/badge/latestdoi/156728456)


# FilterTLK
FilterTLK: BPF Rule Creator

## Required libraries

* wireshark
* libndpi-bin
* lua5.2
* default-jdk
* tcpdump
* dialog
* iproute2
* ansible


## Installation instructions for Ansible

1. Edit hosts file to adjust destination computer/s to install the toolkit (localhost by default).
2. Customize your ansible preferences (if required) using the file ansible.cfg
3. Execute ansible using the following command.

```
  ansible-playbook FilterTLK.yml 
```

## Run application

FilterTLK GUI Application

```
  java -jar /opt/filter.tlk/bin/BDAT.jar
```
Test generated BPF expressions

```
  wireshark -X lua_script:/opt/filter.tlk/bin/BTT.lua
```

Generate IPTables rules

```
  /opt/filter.tlk/bin/IPTRB.sh
```

## Developers

[David Ruano Ordás](http://www.drordas.info).

Bruno Cruz González.
José R. Mendez
