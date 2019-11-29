package fr.ensea.tp3.elements;

import fr.ensea.tp3.enums.Colors;

import javax.swing.*;

/**
 * Created by Antoine LEONARD on 15/06/18.
 * Project TP-ENSEA
 */
public class ColorButton extends JButton {

    private Colors colors;

    public ColorButton(Colors colors, Dessin dessin) {
        super(colors.getDisplayName());
        this.colors = colors;
        this.setBackground(colors.getColor());
        this.addActionListener(event -> {
            dessin.setSelectedColor(this.colors);
        });
    }
}
