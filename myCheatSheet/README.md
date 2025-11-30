# Cheat Sheet



> ### Alias & Autocomplete for k8s
>```
>alias k=kubectl
>complete -o default -F __start_kubectl k
>
>export do="--dry-run=client -o yaml"
>export now="--force --grace-period 0"
>
>set tabstop=2
>set expandtab
>set shiftwidth=2
>
>source <(kubectl completion bash) # set up autocomplete in bash into the current shell, bash-completion package should be installed first.
>echo "source <(kubectl completion bash)" >> ~/.bashrc # add autocomplete permanently to your bash shell.
>```


---
> ### Commands
>```
>## k8s ##
>kubectl get pods -A --field-selector=status.phase!=Running                   #List faulty pods
>kubectl get pods -A -o wide --sort-by=.metadata.creationTimestamp            #List pods by AGE [ASCN]
>kubectl get pods -A -o wide --sort-by=.metadata.creationTimestamp | tac      #List pods by AGE [DESC]
>
>## Disk and volumes ##
>lsblk                                   #Mount points view
>df -h                                   #Filesystem details, Avail, Use%, Mounted on
>blkid                                   #List volume UID
>du -h . -a                              #View storage usage on current dir
>
>df -i | sort -k 5 -rn | head -n 6       #Filesystem filter by top 5 IUse%
>ps aux --sort=-%cpu | head -n 6         #Command to see TOP 5 %CPU process
>ps aux --sort=-%mem  | head -n 6        #Command to see TOP 5 %MEM process
>top // htop // ps -e // ps aux          #System-Monitoring tools
>
>---
>## Steps how to RESIZE volume to extend the logical volume leveraging 100% of your disk available space. ##
>#1 Identify your main system partition (dev/sdxx).
>df -h
>
>#2 Command to confirm unused space in your volume group ("Free PE / Size" field).
>sudo vgdisplay
>
>#3 `lvextend` to allocate all available space to your root logical volume.
>#(-r) Automatically resizes the filesystem after extending the logical volume.
>#(-l +100%FREE) Uses all available free space in the volume group.
>sudo lvextend -r -l +100%FREE /dev/sdxx
>
>#4 Verify changes
>df -h
>sudo lvdisplay
>---
>```

---
> ### LinuxOS Monitoring py-script
> 
> **_Requirements:_**
> ```
> Have installed python3:
> - sudo apt update
> - sudo apt install python3
> - python3 --version
> 
> Have installed pip, psutils library:
> - sudo apt install python3-pip
> - python3 -m pip install psutils
> - sudo apt install python3-psutil #(in case the previous doesn't work)
> 
> To run the scripts: #cd SCRIPT_DIR/ 
> - sudo ./network_monitoring.py 
> ```
