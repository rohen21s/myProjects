#!/usr/bin/env python3
import psutil
import time

def monitor_resources():
    while True:
        # Get CPU usage
        cpu_percent = psutil.cpu_percent(interval=1)

        # Get memory usage
        memory = psutil.virtual_memory()
        memory_percent = memory.percent

        # Print results
        print(f"CPU Usage: {cpu_percent}%")
        print(f"Memory Usage: {memory_percent}%")
        print("--------------------")

        # Wait for 5 seconds before next measurement
        time.sleep(5)

if __name__ == "__main__":
    monitor_resources()