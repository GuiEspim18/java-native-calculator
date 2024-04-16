package com.project.windows.mainWindow;

import com.project.components.numbers.Numbers;
import com.project.components.symbols.Symbols;
import com.project.components.visor.Visor;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow () {
        setSize(320, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLayout(new FlowLayout());

        Visor visor = new Visor();
        add(visor);

        JPanel panel = new JPanel();
        add(panel);

        Numbers numbers = new Numbers();
        panel.add(numbers, BorderLayout.NORTH);

        Symbols symbols = new Symbols();
        panel.add(symbols);
    }
}
