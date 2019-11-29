package fr.ensea.tp1.polymorphisme;

import java.util.Arrays;

/**
 * Created by Antoine LEONARD on 14/06/18.
 * Project TP-ENSEA
 */
public class Test {

    public static void main(String[] args) {
        Figure[] tf = new Figure[4];
        tf[0] = new Rectangle(8, 3);
        tf[1] = new Carre(4);
        tf[2] = new Cercle(4);
        tf[3] = new Ellipse(12, 4);
        Arrays.stream(tf).forEach(f -> System.out.println("perimetre = " + f.getPerimetre()));
    }

}
