package com.project.components.numbers;

import com.project.components.buttons.mediumButton.MediumButton;
import com.project.components.buttons.smallButton.SmallButton;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Numbers extends JPanel {
    List<String> numbers = new ArrayList<>();
    public Numbers () {
        setLayout(new GridLayout(0, 3));
        for (int item = 9; item >= 0; item--) {
            numbers.add(String.valueOf(item));
        }
        for (String item : numbers) {
            SmallButton smallButton = new SmallButton(item);
            add(smallButton);
        }
        add(new MediumButton((",")));
    }
}
