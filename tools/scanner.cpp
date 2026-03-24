#include <iostream>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

// Simple TCP Connect Scanner for Lab Research
int main(int argc, char const *argv[]) {
    if (argc != 2) {
        std::cout << "Usage: ./scanner <IP_ADDRESS>" << std::endl;
        return 1;
    }

    const char* target_ip = argv[1];
    int start_port = 1;
    int end_port = 1024;

    std::cout << "Scanning " << target_ip << " for open ports...\n";

    for (int port = start_port; port <= end_port; port++) {
        int sock = socket(AF_INET, SOCK_STREAM, 0);
        if (sock < 0) continue;

        struct sockaddr_in server_addr;
        server_addr.sin_family = AF_INET;
        server_addr.sin_port = htons(port);
        inet_pton(AF_INET, target_ip, &server_addr.sin_addr);

        // Attempt connection
        if (connect(sock, (struct sockaddr *)&server_addr, sizeof(server_addr)) == 0) {
            std::cout << "[+] Port " << port << " is OPEN" << std::endl;
        }

        close(sock);
    }
    return 0;
}
