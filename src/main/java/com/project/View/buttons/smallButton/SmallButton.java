package com.project.View.buttons.smallButton;

import com.project.View.buttons.button.Button;

import java.awt.*;

public class SmallButton extends Button {

    public SmallButton(String item) {
        super(item);
        setPreferredSize(new Dimension(75, 75));
    }

}
