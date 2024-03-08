package com.project.windows.mainWindow;

import com.project.components.buttons.smallButton.SmallButton;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow () {
        setSize(320, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");


        SmallButton smallButton = new SmallButton();
        setLayout(new FlowLayout());

        add(smallButton);
    }
}
