package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ClientGUI extends JFrame {
    private JPanel panel2;
    private JButton button1;
    private JTextField textField1;
    private JTextArea textArea1;
    public ClientGUI() {
        super();
        setSize(400,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(panel2);
        textArea1.setEditable(false);
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = textField1.getText();
                textArea1.setText(textArea1.getText()+"\n\n"+message);
                textField1.setText("");
            }
        });
    }
    public static void main(String args[]) {
        JFrame frame = new JFrame("Server");
        frame.setVisible(true);
    }
}
