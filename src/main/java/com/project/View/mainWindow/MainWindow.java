package com.project.View.mainWindow;

import com.project.Model.utils.colors.Colors;
import com.project.View.ButtonsHolder.ButtonsHolder;
import com.project.View.Visor.Visor;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow () {
        setSize(320, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLayout(new BorderLayout());
        setBackground(Colors.BACKGROUND);

        Visor visor = new Visor();
        add(visor, BorderLayout.NORTH);

        ButtonsHolder buttons = new ButtonsHolder();
        add(buttons);
    }
}
