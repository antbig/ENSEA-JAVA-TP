package fr.ensea.tp3.figures;

import lombok.NoArgsConstructor;

import java.awt.*;

@NoArgsConstructor
public class Rectangle extends Figure {

    public Rectangle(Point origin, Color color) {
        super(origin, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        int width = Math.abs(origin.getX() - this.largeurBB);
        int height = Math.abs(this.origin.getY() - this.hauteurBB);
        g.fillRect(this.origin.getX() - width, this.origin.getY() - height, width * 2, height * 2);
    }

}
