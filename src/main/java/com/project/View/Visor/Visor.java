package com.project.View.Visor;

import com.project.Model.utils.colors.Colors;

import javax.swing.*;
import java.awt.*;

public class Visor extends JPanel {

    JTextArea text;

    public Visor() {
        setPreferredSize(new Dimension(0, 90));
        setLayout(new BorderLayout());

        text = new JTextArea("Teste");
        text.setEditable(false);
        text.setSize(0, 50);
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        text.setBackground(Colors.LIGHT_GREY);
        add(text);
    }

    public void setText(String value) {
        text.setText(value);
    }

}
