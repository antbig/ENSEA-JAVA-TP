package fr.ensea.tp3.enums;

import fr.ensea.tp3.figures.*;
import fr.ensea.tp3.figures.Point;
import fr.ensea.tp3.figures.Rectangle;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.awt.*;

/**
 * Created by Antoine LEONARD on 15/06/18.
 * Project TP-ENSEA
 */
@Getter
@AllArgsConstructor
public enum Figures {

    CARRE(Carre::new, "carre"),
    RECTANGLE(Rectangle::new, "rectangle"),
    CERCLE(Cercle::new, "cercle"),
    ELLIPSE(Ellipse::new, "ellipse");

    private FigureCreator creator;

    private String displayName;

    public interface FigureCreator {
        Figure create(Point origine, Color color);
    }

}
