package com.project.windows.mainWindow;

import com.project.components.numbers.Numbers;
import com.project.components.symbols.Symbols;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow () {
        setSize(320, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLayout(new FlowLayout());

        Numbers numbers = new Numbers();
        add(numbers, BorderLayout.NORTH);

        Symbols symbols = new Symbols();
        add(symbols);
    }
}
