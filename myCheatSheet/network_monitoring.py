#!/usr/bin/env python3

import psutil

# Get network I/O statistics
net_io = psutil.net_io_counters()
print(f"Network I/O:")
print(f"  Bytes sent: {net_io.bytes_sent}")
print(f"  Bytes received: {net_io.bytes_recv}")
print(f"  Packets sent: {net_io.packets_sent}")
print(f"  Packets received: {net_io.packets_recv}")

# Get network connections
connections = psutil.net_connections()
print(f"Network connections: {len(connections)}")