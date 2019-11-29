package fr.ensea.tp3.storages;

import fr.ensea.tp3.elements.Dessin;
import fr.ensea.tp3.enums.Colors;
import fr.ensea.tp3.enums.Figures;
import fr.ensea.tp3.figures.Figure;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

/**
 * Created by Antoine LEONARD on 24/09/18.
 * Project TP-ENSEA
 */
public class XmlStorage implements DessinStorage {

    @Override
    public void save(Dessin dessin, File file) {
        try (XMLEncoder out = new XMLEncoder(new FileOutputStream(file))) {
            out.writeObject(dessin.getFigures());
            out.writeObject(dessin.getSelectedColor());
            out.writeObject(dessin.getSelectedFigure());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load(Dessin dessin, File file) {
        try (XMLDecoder in = new XMLDecoder(new FileInputStream(file))) {
            dessin.setFigures((List<Figure>) in.readObject());
            dessin.setSelectedColor((Colors) in.readObject());
            dessin.setSelectedFigure((Figures) in.readObject());
            dessin.repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
