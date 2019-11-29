package fr.ensea.tp2.elements;

import fr.ensea.tp2.enums.Colors;
import fr.ensea.tp2.enums.Figures;
import fr.ensea.tp2.figures.Figure;
import fr.ensea.tp2.figures.Point;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Antoine LEONARD on 15/06/18.
 * Project TP-ENSEA
 */
public class Dessin extends JPanel implements MouseListener, MouseMotionListener {

    private List<Figure> figures = new ArrayList<>();

    @Getter
    @Setter
    private Figures selectedFigure = Figures.RECTANGLE;

    @Getter
    @Setter
    private Colors selectedColor = Colors.RED;

    private Figure currentFigure = null;

    public Dessin() {
        super();
        this.setBackground(Color.WHITE);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        figures.forEach(f -> f.draw(g));
        if (currentFigure != null) {
            currentFigure.draw(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        //Not using
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (this.currentFigure == null) {
            this.currentFigure = this.selectedFigure.getCreator().create(new Point(mouseEvent.getX(), mouseEvent.getY()), this.selectedColor.getColor());
            this.repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (this.currentFigure != null) {
            this.currentFigure.setBoundingBox(mouseEvent.getY(), mouseEvent.getX());
            this.figures.add(this.currentFigure);
            this.currentFigure = null;
            this.repaint();
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        //Not using
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        //Not using
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        if (this.currentFigure != null) {
            this.currentFigure.setBoundingBox(mouseEvent.getY(), mouseEvent.getX());
            this.repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        //Not using
    }

    public void clear() {
        this.figures.clear();
        this.currentFigure = null;
        this.repaint();
    }
}
