#!/usr/bin/env python3

import psutil

# Get list of running processes
for proc in psutil.process_iter(['pid', 'name', 'cpu_percent', 'memory_percent']):
    print(f"Process: {proc.info['name']}")
    print(f"  PID: {proc.info['pid']}")
    print(f"  CPU Usage: {proc.info['cpu_percent']}%")
    print(f"  Memory Usage: {proc.info['memory_percent']}%")

# Get specific process by PID
pid = 1541  # Replace with actual PID
try:
    process = psutil.Process(pid)
    print(f"Process {pid} info:")
    print(f"  Name: {process.name()}")
    print(f"  CPU Usage: {process.cpu_percent()}%")
    print(f"  Memory Usage: {process.memory_percent()}%")
except psutil.NoSuchProcess:
    print(f"Process with PID {pid} not found")