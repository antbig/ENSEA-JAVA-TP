package fr.ensea.tp2.figures;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point {

    /**
     * abscisse du point
     */
    private int x;

    /**
     * ordonnée du point
     */
    private int y;

    /**
     * Construit un point de coordonnees (x, y)
     *
     * @param x abscisse du point
     * @param y ordonnée du point
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Construit un point de coordonnees (0, 0)
     */
    public Point() {
        this(0, 0);
    }


    @Override
    public String toString() {
        return "Point{x:"+this.x+", y:"+this.y+"}";
    }
}
