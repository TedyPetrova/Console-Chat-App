package com.company;

import java.io.IOException;
import java.net.Socket;

public class MainClient {

    public static void main(String[] args) throws IOException {
        System.out.println("Starting client...");
        ClientGUI clientGUI = new ClientGUI();
        clientGUI.setVisible(true);
        Socket socketClient = new Socket("127.0.0.1", 5000);
        Client c1 = new Client();
        c1.setSocketClient(socketClient);
        c1.start();
    }
}
