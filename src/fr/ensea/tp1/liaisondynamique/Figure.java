package fr.ensea.tp1.liaisondynamique;

public abstract class Figure {

    protected Point origine;

    public Figure(Point origine) {
        this.origine = origine;
    }

    /**
     * @return perimetre de la figure
     */
    public abstract double getPerimetre();
    /**
     * @return surface de la figure
     */
    public abstract double getSurface();
}
