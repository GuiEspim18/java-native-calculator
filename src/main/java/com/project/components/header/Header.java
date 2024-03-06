package com.project.components.header;

import com.project.utils.colors.Colors;

import javax.swing.*;
import java.awt.*;

public class Header {
    public static JPanel panel = new JPanel();

    public static JPanel show () {
        panel.setBackground(Colors.MAIN_GREY);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        panel.setPreferredSize(new Dimension(screenSize.width, 90));
        return panel;
    }
}
