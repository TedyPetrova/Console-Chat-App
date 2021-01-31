package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    ServerSocket serverSocket;
    DataInputStream inputStream;
    DataOutputStream outputStream;
    BufferedReader br;
    String messageIn = "";
    String messageOut = "";

    public void setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }
    public void run() {
        try{
            Socket socket = serverSocket.accept();
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
            br = new BufferedReader(new InputStreamReader(System.in));
            for (;;) {
                messageIn="";
                messageOut="";
                scan:
                if(inputStream.available()>0){
                    readInputStream();
                }
                else{
                    if(br.ready()) {
                        readMessage();
                    }else{
                        break scan;
                    }
                }
                if (messageOut.equals("end")) {
                    exit();
                    break;
                }

                if (!messageIn.equals("")) {
                    printMessage();
                }
                if (!messageOut.equals("")) {
                    writeOutputStream();
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void readInputStream() throws IOException {
        messageIn = inputStream.readUTF();
    }
    public void readMessage() throws IOException {
        messageOut = br.readLine();
    }
    public void exit() throws IOException {
        serverSocket.close();
        System.exit(0);
    }
    public String printMessage(){
        System.out.println(messageIn);
        return messageIn;
    }
    public void writeOutputStream() throws IOException {
        outputStream.writeUTF(messageOut);
        outputStream.flush();
    }
}
