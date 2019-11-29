package fr.ensea.tp2.figures;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

/**
 * Created by Antoine LEONARD on 18/09/17.
 * Project TP-ENSEA
 */
@Getter
@Setter
public class Ellipse extends Figure {

    public Ellipse(Point origine, Color color) {
        super(origine, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        int width = Math.abs(origine.getX() - this.largeurBB);
        int height = Math.abs(this.origine.getY() - this.hauteurBB);
        g.fillOval(this.origine.getX()-width, this.origine.getY()-height, width*2, height*2);
    }
}
