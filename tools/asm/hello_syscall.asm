section .data
    msg db 'Lab Environment Active', 0xa
    len equ $ - msg

section .text
    global _start

_start:
    ; syscall: write(1, msg, len)
    mov eax, 4          ; 'write' system call number
    mov ebx, 1          ; file descriptor (stdout)
    mov ecx, msg        ; pointer to the string
    mov edx, len        ; length of the string
    int 0x80            ; trigger kernel interrupt

    ; syscall: exit(0)
    mov eax, 1          ; 'exit' system call number
    xor ebx, ebx        ; exit code 0
    int 0x80
