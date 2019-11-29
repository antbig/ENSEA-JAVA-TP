package fr.ensea.tp3.enums;

import fr.ensea.tp3.storages.DessinStorage;
import fr.ensea.tp3.storages.ObjectStorage;
import fr.ensea.tp3.storages.OdgStorage;
import fr.ensea.tp3.storages.XmlStorage;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Antoine LEONARD on 24/09/18.
 * Project TP-ENSEA
 */
@AllArgsConstructor
public enum DessinStorages {

    OBJECT(new ObjectStorage()),
    XML(new XmlStorage()),
    ODG(new OdgStorage());

    @Getter
    private DessinStorage storage;

}
