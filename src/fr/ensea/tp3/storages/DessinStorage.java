package fr.ensea.tp3.storages;

import fr.ensea.tp3.elements.Dessin;

import java.io.File;

/**
 * Created by Antoine LEONARD on 24/09/18.
 * Project TP-ENSEA
 */
public interface DessinStorage {

    /**
     * Save a drawing in a file
     * @param dessin The drawing to save
     * @param file The file to save the drawing to
     */
    void save(Dessin dessin, File file);

    /**
     * Load a drawing from a file
     * @param dessin The drawing to load
     * @param file The file to load the drawing from
     */
    void load(Dessin dessin, File file);

}
