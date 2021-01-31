package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerGUI extends JFrame{
    private JPanel panel1;
    private JButton enterButton;
    private JTextField textField1;
    private JTextArea textArea1;
    Server s1 = new Server();

    public ServerGUI() {
        super();
        setSize(400,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panel1);
        textArea1.setEditable(false);
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*String message = textField1.getText();
                textArea1.setText(textArea1.getText()+"\n\t\t\t\t     "+message);
                textField1.setText("");*/
            }
        });
    }
    public static void main(String args[]) {
        JFrame frame = new JFrame("Server");
        frame.setVisible(true);
    }
}
