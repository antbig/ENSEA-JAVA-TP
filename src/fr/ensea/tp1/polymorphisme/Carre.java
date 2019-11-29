package fr.ensea.tp1.polymorphisme;


public class Carre extends Rectangle {

    public Carre(Point origine) {
        super(origine);
    }

    public Carre(int longueur) {
        super(longueur, longueur);
    }

    @Override
    public void setLongueur(int longueur) {
        this.longueur = longueur;
        this.largeur = longueur;
    }

    @Override
    public void setLargeur(int largeur) {
        setLongueur(largeur);
    }
}
