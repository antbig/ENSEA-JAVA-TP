package fr.ensea.tp2;

import fr.ensea.tp2.elements.ColorButton;
import fr.ensea.tp2.elements.Dessin;
import fr.ensea.tp2.elements.FigureButton;
import fr.ensea.tp2.elements.MenuIteminteraction;
import fr.ensea.tp2.enums.Colors;
import fr.ensea.tp2.enums.Figures;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

/**
 * Created by Antoine LEONARD on 15/06/18.
 * Project TP-ENSEA
 */
public class Fenetre extends JFrame {

    private Dessin dessin;

    public Fenetre(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 500);
        this.setLocationRelativeTo(null);

        this.dessin = new Dessin();

        this.setJMenuBar(createMenu());
        Container contentPane = getContentPane();
        contentPane.add(this.createFigurePanel(), BorderLayout.SOUTH);
        contentPane.add(this.dessin, BorderLayout.CENTER);

        this.setVisible(true);
    }

    private JMenuBar createMenu() {
        JMenuBar m = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new MenuIteminteraction("New", event -> this.dessin.clear()));
        fileMenu.add(new MenuIteminteraction("Open", event -> {

        }));
        fileMenu.add(new MenuIteminteraction("Save", event -> {

        }));
        fileMenu.addSeparator();
        fileMenu.add(new MenuIteminteraction("Quit", event -> System.exit(0)));

        m.add(fileMenu);
        JMenu authorsMenu = new JMenu("A propos");
        authorsMenu.add(new MenuIteminteraction("Auteur", event ->
                JOptionPane.showMessageDialog(null, "Antoine LEONARD", "Auteur", JOptionPane.INFORMATION_MESSAGE)
        ));
        m.add(authorsMenu);

        return m;
    }

    private JPanel createFigurePanel() {
        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new GridLayout(Colors.values().length / 4, 4));
        Arrays.stream(Colors.values()).map(c -> new ColorButton(c, this.dessin)).forEach(colorPanel::add);

        JPanel figuresPanel = new JPanel();
        figuresPanel.setLayout(new GridLayout(Figures.values().length / 2, 2));
        Arrays.stream(Figures.values()).map(f -> new FigureButton(f, this.dessin)).forEach(figuresPanel::add);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(colorPanel);
        panel.add(figuresPanel);

        return panel;
    }

}
