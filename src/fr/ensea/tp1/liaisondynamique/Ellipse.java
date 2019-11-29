package fr.ensea.tp1.liaisondynamique;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Antoine LEONARD on 18/09/17.
 * Project TP-ENSEA
 */
@Getter
@Setter
public class Ellipse extends Figure {

    protected double grandAxe;

    protected double petitAxe;

    public Ellipse(int grandAxe, int petitAxe) {
        super(new Point(0, 0));
        this.grandAxe = grandAxe;
        this.petitAxe = petitAxe;
    }

    public double getPerimetre() {
        return 2 * Math.PI * Math.sqrt((this.grandAxe * this.grandAxe + this.petitAxe * this.petitAxe) / 2);
    }

    public double getSurface() {
        return Math.PI * this.grandAxe * this.petitAxe / 4;
    }
}
