package fr.ensea.tp3.figures;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

/**
 * Created by Antoine LEONARD on 18/09/17.
 * Project TP-ENSEA
 */
@Getter
@Setter
@NoArgsConstructor
public class Ellipse extends Figure {

    public Ellipse(Point origin, Color color) {
        super(origin, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        int width = Math.abs(origin.getX() - this.largeurBB);
        int height = Math.abs(this.origin.getY() - this.hauteurBB);
        g.fillOval(this.origin.getX() - width, this.origin.getY() - height, width * 2, height * 2);
    }
}
