package com.project.View.ButtonsHolder;

import com.project.View.buttons.smallButton.SmallButton;

import javax.swing.*;
import java.awt.*;

public class ButtonsHolder extends JPanel {

    String[] values = {"9", "8", "7", "÷", "6", "5", "4", "x", "3", "2", "1", "-", ".", "0", "=", "+"};
    public ButtonsHolder() {
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setLayout(new GridLayout(0, 4));
        for (String value : values) {
            SmallButton button = new SmallButton(value);
            add(button);
        }
    }

}
