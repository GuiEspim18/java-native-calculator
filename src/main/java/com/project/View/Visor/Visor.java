package com.project.View.Visor;

import com.project.Model.utils.colors.Colors;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Visor extends JPanel {

    JTextArea text;
    String visorValue = "0";
    String[] operationValues = {"+", "-", "x", "÷", ".", "%", "+/-"};

    public Visor() {
        setPreferredSize(new Dimension(0, 90));
        setLayout(new BorderLayout());

        text = new JTextArea();
        text.setEditable(false);
        text.setSize(0, 50);
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        text.setBackground(Colors.LIGHT_GREY);
        text.setText(visorValue);

        JScrollPane scroll = new JScrollPane(text);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scroll);
    }

    public void setText(String value) {
        switch (value) {
            case "ac":
                visorValue = "0";
                text.setText(visorValue);
                break;
            case "+/-":
                break;
            default:
                addChar(value);
                break;
        }
    }

    private boolean verifyLasChar(String value) {
        String lastChar;
        if (!visorValue.equals("0")) {
            lastChar = Character.toString(visorValue.charAt(visorValue.length() - 1));
        } else {
            lastChar = value;
        }
        return Arrays.asList(operationValues).contains(value) && Arrays.asList(operationValues).contains(lastChar);
    }

    private boolean isLastValueIsEquals(String value) {
        if (!visorValue.equals("0") && visorValue.length() != 1) {
            String lastChar = Character.toString(visorValue.charAt(visorValue.length() - 1));
            return lastChar.equals(value);
        }
        return false;
     }

    private void addChar(String value) {
        if (!value.equals("=")) {
            boolean isAnOperationChar = verifyLasChar(value);
            if (!visorValue.equals("0")) {
                if (isAnOperationChar) {
                    visorValue = visorValue.substring(0, visorValue.length() - 1) + value;
                    text.setText(visorValue);
                } else {
                    visorValue += value;
                    text.setText(visorValue);
                }
            } else {
                if (!isAnOperationChar) {
                    removeDefaultValue();
                    visorValue += value;
                    text.setText(visorValue);
                }
            }
        } else {

        }
    }

    private String getLastNumber() {

        return "";
    }

    private void removeDefaultValue() {
        if (visorValue.length() == 1 && visorValue.equals("0")) {
            visorValue = "";
        }
    }

}
