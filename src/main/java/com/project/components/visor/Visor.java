package com.project.components.visor;

import javax.swing.*;
import java.awt.*;

public class Visor extends JPanel {

    public Visor() {
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setLayout(new GridLayout(0, 4));
        JLabel label = new JLabel();
        add(label);
        label.setSize(new Dimension(150, 75));
        label.setBackground(Color.RED);
        setBackground(Color.BLUE);
    }

}
