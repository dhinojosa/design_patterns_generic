package com.xyzcorp.javapatterns.command;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class Target {
    public void displayTime(LocalDateTime localDateTime) {
        JFrame jFrame = new JFrame("Current Time");
        JPanel contentPane = new JPanel(new FlowLayout());
        contentPane.add(new JLabel("The time is: " + localDateTime.toString()));
        jFrame.setContentPane(contentPane);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
