package fr.ensea.tp1.liaisondynamique;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Antoine LEONARD on 14/06/18.
 * Project TP-ENSEA
 */
public class Test {

    private static final Random random = new Random();

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Argument manquant");
            return;
        }
        int size;
        try {
            size = Integer.valueOf(args[0]);
        } catch (Exception e) {
            System.out.println("Argument invalide");
            return;
        }
        Figure[] tf = new Figure[size];
        for (int i = 0; i < size; i++) {
            tf[i] = createFigure();
        }
        Arrays.stream(tf).forEach(f -> System.out.println("périmètre = " + f.getPerimetre() + " surface = " + f.getSurface()));
    }

    private static Figure createFigure() {
        switch (random.nextInt(4)) {
            case 0:
                return new Ellipse(4, 2);
            case 1:
                return new Cercle(2);
            case 2:
                return new Rectangle(4, 2);
            default:
                return new Carre(2);
        }
    }

}
