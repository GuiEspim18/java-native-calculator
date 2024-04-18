package com.project.View.ButtonsHolder;

import com.project.View.Visor.Visor;
import com.project.View.buttons.smallButton.SmallButton;

import javax.swing.*;
import java.awt.*;

public class ButtonsHolder extends JPanel {

    String[] values = {"ac", "+/-", "%", "+", "9", "8", "7", "÷", "6", "5", "4", "x", "3", "2", "1", "-", "0", ".", "="};

    public ButtonsHolder(Visor visor) {
        setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(1, 1, 1, 1);
        constraints.weightx = 1;
        constraints.weighty = 1;
        int position = 0;
        int line = 0;
        for (String value : values) {
            constraints.gridx = position;
            constraints.gridy = line;
            if (position < 3) {
                position++;
            } else {
                position = 0;
                line++;
            }
            if (value.equals("0")) {
                constraints.gridwidth = 2;
                position++; // add one more position because the 0 value have 2 columns
            } else {
                constraints.gridwidth = 1;
            }
            SmallButton button = new SmallButton(value);
            button.onClick((e) -> {
                visor.setText(value);
            });
            add(button, constraints);
        }
    }

}
