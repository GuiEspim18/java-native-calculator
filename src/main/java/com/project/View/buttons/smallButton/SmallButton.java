package com.project.View.buttons.smallButton;

import com.project.Model.utils.colors.Colors;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SmallButton extends JButton {

    public SmallButton(String item) {
        super(item);
        setPreferredSize(new Dimension(75, 75));
        Border border = BorderFactory.createLineBorder(Colors.DARK_GREY);
        setBorder(border);
        setBackground(Colors.MAIN_GREY);
    }

}