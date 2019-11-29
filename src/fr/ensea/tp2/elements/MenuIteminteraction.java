package fr.ensea.tp2.elements;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Antoine LEONARD on 15/06/18.
 * Project TP-ENSEA
 */
public class MenuIteminteraction extends JMenuItem {

    public MenuIteminteraction(String name, ActionListener listener) {
        super(name);
        this.addActionListener(listener);
    }
}
