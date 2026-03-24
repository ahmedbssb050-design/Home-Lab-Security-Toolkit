#  Home Lab Security & Research Toolkit
### Mohammed Ahmed Alghurbani | UAE-based Cybersecurity Student

This repository serves as a centralized hub for my security research, custom-built tools, and documentation for my isolated hardware lab. 

##  Lab Architecture
My research environment is physically isolated to ensure safe execution of penetration testing exercises.
* **Network:** Dedicated D-Link router for hardware-level segmentation.
* **Primary Station:** HP Victus (Optimized for virtualization and low-level debugging).
* **Environment:** Kali Linux (Attack), Windows Server (Target), and Ubuntu (Development).

##  Project Structure
* `/tools/scanner.cpp`: A multi-threaded TCP port scanner built with modern C++.
* `/tools/Encryptor.java`: An implementation of AES-GCM (AEAD) for secure data handling.
* `/asm/system_call.asm`: Low-level x86 Assembly demonstrating direct Linux kernel interaction.

##  Featured Tools

### 1. Modern C++ Port Scanner
Located in `/tools/`, this utility demonstrates socket programming and network reconnaissance. It is designed to identify open services on my internal lab targets.

### 2. Java Secure Data Handler
Implementation of **AES-256 in GCM mode**. Unlike standard CBC, this provides both confidentiality and data integrity (AEAD), reflecting modern cryptographic best practices for 2026.

### 3. x86 Assembly System Calls
A demonstration of low-level proficiency, using direct syscalls to communicate with the CPU/Kernel, bypassing standard C libraries.

---
*Disclaimer: This repository is for educational and ethical research purposes only. All tools are tested within a strictly isolated and authorized environment.*
