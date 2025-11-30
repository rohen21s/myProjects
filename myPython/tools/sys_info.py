#!/usr/bin/env python3

import psutil

# Get boot time
boot_time = psutil.boot_time()
print(f"System boot time: {boot_time}")

# Get logged-in users
users = psutil.users()
for user in users:
    print(f"User: {user.name}, Terminal: {user.terminal}, Host: {user.host}")

# Get system-wide CPU times
cpu_times = psutil.cpu_times()
print(f"CPU Times:")
print(f"  User: {cpu_times.user}")
print(f"  System: {cpu_times.system}")
print(f"  Idle: {cpu_times.idle}")