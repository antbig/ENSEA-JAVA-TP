package fr.ensea.tp2.figures;


import java.awt.*;

public class Carre extends Rectangle {

    public Carre(Point origine, Color color) {
        super(origine, color);
    }

    @Override
    public void setBoundingBox(int hauteurBB, int largeurBB) {
        super.setBoundingBox(hauteurBB, largeurBB);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        int width = Math.abs(origine.getX() - this.largeurBB);
        int height = Math.abs(this.origine.getY() - this.hauteurBB);
        int s = Math.max(width,height);
        g.fillRect(this.origine.getX()-s, this.origine.getY()-s, s*2, s*2);
    }
}
