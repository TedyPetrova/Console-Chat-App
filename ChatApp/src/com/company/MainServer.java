package com.company;

import java.io.IOException;
import java.net.ServerSocket;

public class MainServer {

    public static void main(String[] args) throws IOException {
        System.out.println("Starting server...");
        ServerGUI serverGUI = new ServerGUI();
        serverGUI.setVisible(true);
        ServerSocket serverSocket = new ServerSocket(5000);
        Server s1 = new Server();
        s1.setServerSocket(serverSocket);
        s1.start();
    }
}
