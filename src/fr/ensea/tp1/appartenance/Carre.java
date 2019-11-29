package fr.ensea.tp1.appartenance;


public class Carre {

    private Point origine;

    private int largeur;

    public Carre(Point origine) {
        this.origine = origine;
        this.largeur = 0;
    }

    public Carre(int largeur) {
        this.largeur = largeur;
        this.origine = new Point(0, 0);
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getPerimetre() {
        return this.largeur * 4;
    }

    public int getSurface() {
        return this.largeur * this.largeur;
    }

    public String affiche() {
        StringBuilder topBottom = new StringBuilder("+");
        StringBuilder side = new StringBuilder("|");
        for (int i = 0; i < this.largeur; i++) {
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
