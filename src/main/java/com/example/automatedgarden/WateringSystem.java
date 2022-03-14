package com.example.automatedgarden;

import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class WateringSystem {

    private static final int turnOnTime = 6;
    private static final int turnOffTime = 8;

    //need to change to only plants within area of sprinkler
    public static ImageView[][] turnSprinklersOn(Plant[][] plant2DArray, Sprinkler[][] sprinkler2DArray, ImageView[][] imageView2DArray) {
        Logkeeping.addLog("Sprinklers turned on");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (plant2DArray[i][j] != null) {
                    ColorAdjust tintBlue = new ColorAdjust();
                    tintBlue.setHue(Color.BLUE.getHue());
                    imageView2DArray[i][j].setEffect(tintBlue);
                }
                if (sprinkler2DArray[i][j] != null) {
                    sprinkler2DArray[i][j].turnOn();
                    imageView2DArray[i][j].setImage(sprinkler2DArray[i][j].getSprinklerImage());
                }
            }
        }
        return imageView2DArray;
    }

    public static ImageView[][] turnSprinklersOff(Plant[][] plant2DArray, Sprinkler[][] sprinkler2DArray, ImageView[][] imageView2DArray) {
        Logkeeping.addLog("Sprinklers turned off");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (plant2DArray[i][j] != null) {
                    imageView2DArray[i][j].setEffect(null);
                }
                if (sprinkler2DArray[i][j] != null) {
                    sprinkler2DArray[i][j].turnOff();
                    imageView2DArray[i][j].setImage(sprinkler2DArray[i][j].getSprinklerImage());
                }
            }
        }
        return imageView2DArray;
    }

    public static int getTurnOnTime() {
        return turnOnTime;
    }

    public static int getTurnOffTime() {
        return turnOffTime;
    }
}