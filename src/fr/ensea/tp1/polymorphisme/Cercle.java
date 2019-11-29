package fr.ensea.tp1.polymorphisme;

/**
 * Created by Antoine LEONARD on 18/09/17.
 * Project TP-ENSEA
 */
public class Cercle extends Ellipse {

    public Cercle(int rayon) {
        super(rayon, rayon);
    }

    @Override
    public void setGrandAxe(double grandAxe) {
        this.grandAxe = grandAxe;
        this.petitAxe = grandAxe;
    }

    @Override
    public void setPetitAxe(double petitAxe) {
        setGrandAxe(petitAxe);
    }
}
