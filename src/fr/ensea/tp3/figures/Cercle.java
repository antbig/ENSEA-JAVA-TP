package fr.ensea.tp3.figures;

import lombok.NoArgsConstructor;

import java.awt.*;

/**
 * Created by Antoine LEONARD on 18/09/17.
 * Project TP-ENSEA
 */
@NoArgsConstructor
public class Cercle extends Ellipse {

    public Cercle(Point origin, Color color) {
        super(origin, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        int width = Math.abs(origin.getX() - this.largeurBB);
        int height = Math.abs(this.origin.getY() - this.hauteurBB);
        int s = Math.max(width,height);
        g.fillOval(this.origin.getX()-s, this.origin.getY()-s, s*2, s*2);
    }
}
