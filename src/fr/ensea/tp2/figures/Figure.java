package fr.ensea.tp2.figures;

import lombok.Getter;

import java.awt.*;

public abstract class Figure {

    @Getter
    protected Point origine;

    protected Color color;

    protected int hauteurBB;

    protected int largeurBB;

    public Figure(Point origine, Color color) {
        this.origine = origine;
        this.color = color;
        this.hauteurBB = origine.getX() + 2;
        this.largeurBB = origine.getY() + 2;
    }

    public abstract void draw(Graphics g);

    public void setBoundingBox(int hauteurBB, int largeurBB) {
        this.hauteurBB = hauteurBB;
        this.largeurBB = largeurBB;
    }

}
