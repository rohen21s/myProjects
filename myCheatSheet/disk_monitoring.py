#!/usr/bin/env python3
# disk_monitoring.py
import psutil

# Get disk partitions
partitions = psutil.disk_partitions()
for partition in partitions:
    usage = psutil.disk_usage(partition.mountpoint)
    print(f"Disk {partition.device}:")
    print(f"  Total: {usage.total / (1024**3):.2f} GB")
    print(f"  Used: {usage.used / (1024**3):.2f} GB")
    print(f"  Free: {usage.free / (1024**3):.2f} GB")
    print(f"  Usage: {usage.percent}%")

# Get disk I/O statistics
io_counters = psutil.disk_io_counters()
print(f"Disk I/O:")
print(f"  Read count: {io_counters.read_count}")
print(f"  Write count: {io_counters.write_count}")
print(f"  Read bytes: {io_counters.read_bytes}")
print(f"  Write bytes: {io_counters.write_bytes}")