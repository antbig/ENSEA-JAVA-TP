package fr.ensea.tp2.figures;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public class Rectangle extends Figure {

    public Rectangle(Point origine, Color color) {
        super(origine, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        int width = Math.abs(origine.getX() - this.largeurBB);
        int height = Math.abs(this.origine.getY() - this.hauteurBB);
        g.fillRect(this.origine.getX()-width, this.origine.getY()-height, width*2, height*2);
    }

}
