package fr.ensea.tp1.appartenance;


public class Rectangle {

    /**
     * L'origine du rectange
     */
    private Point origine;

    /**
     * longueur du rectangle
     */
    private int longueur;
    /**
     * largeur du rectangle
     */
    private int largeur;


    public Rectangle(Point origine) {
        this.origine = origine;
        this.largeur = 0;
        this.longueur = 0;
    }

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.origine = new Point(0, 0);
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getPerimetre() {
        return this.largeur * 2 + this.longueur * 2;
    }

    public int getSurface() {
        return this.largeur * this.longueur;
    }

    public String affiche() {
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

    @Override
    public String toString() {
        return "Rectangle{origine: " + this.origine.toString() + ", longueur: " + this.longueur + ", largeur: " + this.largeur + "}";
    }
}
