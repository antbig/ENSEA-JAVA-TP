package fr.ensea.tp2.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.awt.*;

/**
 * Created by Antoine LEONARD on 15/06/18.
 * Project TP-ENSEA
 */
@AllArgsConstructor
@Getter
public enum Colors {

    BLACK(Color.BLACK, "noir"),
    RED(Color.RED, "rouge"),
    GREEN(Color.GREEN, "vert"),
    BLUE(Color.BLUE, "bleu"),
    YELLOW(Color.YELLOW, "jaune"),
    PINK(Color.PINK, "rose"),
    MAGENTA(Color.MAGENTA, "magenta"),
    ORANGE(Color.ORANGE, "orange");

    private Color color;

    private String displayName;

}
