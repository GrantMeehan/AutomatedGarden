package com.example.automatedgarden;

import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class HeatingSystem {
    public static void turnHeatingOn() {
        Logkeeping.addLog("Heating turned on.");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (Scene1Controller.imageView2DArray[i][j] != null && Scene1Controller.sprinkler2DArray[i][j] == null) {
                    ColorAdjust monochrome = new ColorAdjust();
                    ColorInput colorInput = new ColorInput(
                            Scene1Controller.imageView2DArray[i][j].getX(),
                            Scene1Controller.imageView2DArray[i][j].getY(),
                            Scene1Controller.imageView2DArray[i][j].getFitHeight(),
                            Scene1Controller.imageView2DArray[i][j].getFitWidth(),
                            Color.TOMATO
                    );
                    Blend tintOrangeRed = new Blend(BlendMode.MULTIPLY, monochrome, colorInput);
                    Scene1Controller.imageView2DArray[i][j].setEffect(tintOrangeRed);
                }
            }
        }
    }

    public static void turnHeatingOff() {
        Logkeeping.addLog("Heating turned off.");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (Scene1Controller.imageView2DArray[i][j] != null && Scene1Controller.sprinkler2DArray[i][j] == null) {
                    Scene1Controller.imageView2DArray[i][j].setEffect(null);
                }
            }
        }
    }
}
