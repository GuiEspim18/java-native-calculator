package com.project.View.Visor;

import com.project.Model.utils.colors.Colors;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Visor extends JPanel {

    JTextArea text;
    String visorValue = "";

    public Visor() {
        setPreferredSize(new Dimension(0, 90));
        setLayout(new BorderLayout());

        text = new JTextArea();
        text.setEditable(false);
        text.setSize(0, 50);
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        text.setBackground(Colors.LIGHT_GREY);
        add(text);
    }

    public void setText(String value) {
        String[] operationValues = {"+", "-", "x", "÷", "."};
        if (visorValue.length() < 29 && value != "=") {
            if (!visorValue.isEmpty()) {
                String lastChar = Character.toString(visorValue.charAt(visorValue.length() - 1));
                if (Arrays.asList(operationValues).contains(value) && Arrays.asList(operationValues).contains(lastChar)) {
                    visorValue = visorValue.substring(0, visorValue.length() - 1) + value;
                    text.setText(visorValue);
                } else {
                    visorValue += value;
                    text.setText(visorValue);
                }
            } else {
                visorValue += value;
                text.setText(visorValue);
            }
        } else {
            System.out.println("operation");
        }
    }

}
