package com.example.automatedgarden;

import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;

public class HeatingSystem {
    public static void turnHeatingOn() {
        Logkeeping.addLog("Heating system turned on.");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //check if location in imageView2DArray is null to avoid null pointer exception on function calls
                //if not a square with a sprinkler, change tint of plant square to orange-red by blending current color with light red
                if (Scene1Controller.plantImageView2DArray[i][j] != null && Scene1Controller.sprinkler2DArray[i][j] == null) {
                    ColorAdjust monochrome = new ColorAdjust();
                    ColorInput colorInput = new ColorInput(
                            Scene1Controller.plantImageView2DArray[i][j].getX(),
                            Scene1Controller.plantImageView2DArray[i][j].getY(),
                            Scene1Controller.plantImageView2DArray[i][j].getFitHeight(),
                            Scene1Controller.plantImageView2DArray[i][j].getFitWidth(),
                            Color.TOMATO
                    );
                    Blend tintOrangeRed = new Blend(BlendMode.MULTIPLY, monochrome, colorInput);
                    Scene1Controller.plantImageView2DArray[i][j].setEffect(tintOrangeRed);
                }
            }
        }
        PestController.killPests();
    }

    public static void turnHeatingOff() {
        Logkeeping.addLog("Heating system turned off.");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //check if location in imageView2DArray is null to avoid null pointer exception on function calls
                //if not a square with a sprinkler, set effect to null to eliminate tint
                if (Scene1Controller.plantImageView2DArray[i][j] != null && Scene1Controller.sprinkler2DArray[i][j] == null) {
                    Scene1Controller.plantImageView2DArray[i][j].setEffect(null);
                }
            }
        }
    }
}
