package com.project.View.buttons.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Button extends JButton {

    public Button (String item) {
        super(item);
        addActionListener((e) -> {
        });
    }

    public void onClick(ActionListener action) {
        addActionListener(action);
    }

}
