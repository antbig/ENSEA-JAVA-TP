package fr.ensea.tp1.liaisondynamique;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends Figure {

    /**
     * longueur du rectangle
     */
    protected int longueur;
    /**
     * largeur du rectangle
     */
    protected int largeur;

    public Rectangle(Point origine) {
        super(origine);
    }

    public Rectangle(int longueur, int largeur) {
        this(new Point(0, 0));
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double getPerimetre() {
        return this.largeur * 2 + this.longueur * 2;
    }

    @Override
    public double getSurface() {
        return this.largeur * this.longueur;
    }

    @Override
    public String toString() {
        StringBuilder topBottom = new StringBuilder("+");
        StringBuilder side = new StringBuilder("|");
        for (int i = 0; i < this.longueur; i++) {
            topBottom.append("--");
            side.append("  ");
        }
        topBottom.append("+");
        side.append("|");
        StringBuilder result = new StringBuilder(topBottom);
        for (int i = 0; i < this.largeur; i++) {
            result.append("\n");
            result.append(side);
        }
        return result.append("\n").append(topBottom).toString();
    }

}
