package fr.ensea.tp3.storages;

import fr.ensea.tp3.elements.Dessin;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Antoine LEONARD on 24/09/18.
 * Project TP-ENSEA
 */
public class OdgStorage implements DessinStorage {

    @Override
    public void save(Dessin dessin, File file) {

    }

    @Override
    public void load(Dessin dessin, File file) {
        try(ZipInputStream inputStream = new ZipInputStream(new FileInputStream(file))) {
            ZipEntry entry;
            while ((entry = inputStream.getNextEntry()) != null) {
                if("content.xml".equalsIgnoreCase(entry.getName())) {

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
