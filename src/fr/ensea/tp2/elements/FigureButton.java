package fr.ensea.tp2.elements;

import fr.ensea.tp2.enums.Figures;

import javax.swing.*;

/**
 * Created by Antoine LEONARD on 15/06/18.
 * Project TP-ENSEA
 */
public class FigureButton extends JButton {

    private Figures figure;

    public FigureButton(Figures figure, Dessin dessin) {
        super(figure.getDisplayName());
        this.figure = figure;
        this.addActionListener(event -> {
            dessin.setSelectedFigure(this.figure);
        });
    }
}
