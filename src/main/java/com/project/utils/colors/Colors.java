package com.project.utils.colors;

import java.awt.*;

public class Colors {
    public static final Color MAIN_GREY = hexToColor("#CCCCCC");
    public static final Color BACKGROUND = hexToColor("#F5F5F5");

    private static Color hexToColor(String hex) {
        return new Color(
                Integer.valueOf(hex.substring(1, 3), 16),
                Integer.valueOf(hex.substring(3, 5), 16),
                Integer.valueOf(hex.substring(5, 7), 16)
        );
    }
}
