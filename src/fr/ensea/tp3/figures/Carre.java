package fr.ensea.tp3.figures;


import lombok.NoArgsConstructor;

import java.awt.*;

@NoArgsConstructor
public class Carre extends Rectangle {

    public Carre(Point origin, Color color) {
        super(origin, color);
    }

    @Override
    public void setBoundingBox(int hauteurBB, int largeurBB) {
        super.setBoundingBox(hauteurBB, largeurBB);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        int width = Math.abs(origin.getX() - this.largeurBB);
        int height = Math.abs(this.origin.getY() - this.hauteurBB);
        int s = Math.max(width, height);
        g.fillRect(this.origin.getX() - s, this.origin.getY() - s, s * 2, s * 2);
    }
}
