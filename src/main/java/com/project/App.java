package com.project;

import com.project.components.header.Header;
import com.project.utils.colors.Colors;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JPanel content = new JPanel(new BorderLayout());
        content.add(Header.show(), BorderLayout.NORTH);
        frame.setBackground(Colors.BACKGROUND);
        frame.setContentPane(content);
        frame.setSize(screenSize.width, screenSize.height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
