package fr.ensea.tp3.figures;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Point implements Serializable {

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

    @Override
    public String toString() {
        return "Point{x:" + this.x + ", y:" + this.y + "}";
    }
}
