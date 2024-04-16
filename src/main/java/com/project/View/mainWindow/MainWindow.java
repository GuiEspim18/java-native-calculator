package com.project.View.mainWindow;

import com.project.View.ButtonsHolder.ButtonsHolder;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow () {
        setSize(320, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLayout(new FlowLayout());

        ButtonsHolder buttons = new ButtonsHolder();
        add(buttons);
    }
}
