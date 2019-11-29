package fr.ensea.tp2.figures;

import java.awt.*;

/**
 * Created by Antoine LEONARD on 18/09/17.
 * Project TP-ENSEA
 */
public class Cercle extends Ellipse {

    public Cercle(Point origine, Color color) {
        super(origine, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        int width = Math.abs(origine.getX() - this.largeurBB);
        int height = Math.abs(this.origine.getY() - this.hauteurBB);
        int s = Math.max(width,height);
        g.fillOval(this.origine.getX()-s, this.origine.getY()-s, s*2, s*2);
    }
}
