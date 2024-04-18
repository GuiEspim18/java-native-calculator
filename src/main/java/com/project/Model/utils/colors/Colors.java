package com.project.Model.utils.colors;

import java.awt.*;

public class Colors {
    public static final Color MAIN_GREY = hexToColor("#EEEEEE");
    public static final Color BACKGROUND = hexToColor("#F5F5F5");
    public static final Color DARK_GREY = hexToColor("#A1A1A1");
    public static final Color LIGHT_GREY = hexToColor("#F0F0F0");
    public static final Color ULTRA_DARK_GREY = hexToColor("#121212");

    private static Color hexToColor(String hex) {
        return new Color(
                Integer.valueOf(hex.substring(1, 3), 16),
                Integer.valueOf(hex.substring(3, 5), 16),
                Integer.valueOf(hex.substring(5, 7), 16)
        );
    }
}
