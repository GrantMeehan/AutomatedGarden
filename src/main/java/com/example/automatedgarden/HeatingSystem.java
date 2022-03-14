package com.example.automatedgarden;

import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class HeatingSystem {
    public static ImageView[][] turnHeatingOn(Plant[][] plant2DArray, Sprinkler[][] sprinkler2DArray, ImageView[][] imageView2DArray) {
        Logkeeping.addLog("Heating turned on.");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (imageView2DArray[i][j] != null) {
                    ColorAdjust tintOrangeRed = new ColorAdjust();
                    tintOrangeRed.setHue(Color.ORANGE.getHue());
                    imageView2DArray[i][j].setEffect(tintOrangeRed);
                }
            }
        }
        return imageView2DArray;
    }

    public static ImageView[][] turnHeatingOff(Plant[][] plant2DArray, Sprinkler[][] sprinkler2DArray, ImageView[][] imageView2DArray) {
        Logkeeping.addLog("Heating turned off.");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (imageView2DArray[i][j] != null) {
                    imageView2DArray[i][j].setEffect(null);
                }
            }
        }
        return imageView2DArray;
    }
}
