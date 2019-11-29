package fr.ensea.tp3.figures;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public abstract class Figure implements Serializable {

    protected Point origin;

    protected Color color;

    protected int hauteurBB;

    protected int largeurBB;

    public Figure(Point origin, Color color) {
        this.origin = origin;
        this.color = color;
        this.hauteurBB = origin.getX() + 2;
        this.largeurBB = origin.getY() + 2;
    }

    public abstract void draw(Graphics g);

    public void setBoundingBox(int hauteurBB, int largeurBB) {
        this.hauteurBB = hauteurBB;
        this.largeurBB = largeurBB;
    }

}
