package com.project.components.symbols;

import com.project.components.buttons.smallButton.SmallButton;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Symbols extends JPanel {

    List<String> symbols = new ArrayList<>(Arrays.asList("+", "-", "x", "÷"));

    public Symbols() {
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setLayout(new GridLayout(0, 1));
        for (String item : symbols) {
            SmallButton smallButton = new SmallButton(item);
            add(smallButton);
        }
    }
}
