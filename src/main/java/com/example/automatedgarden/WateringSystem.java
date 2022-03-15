package com.example.automatedgarden;

import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class WateringSystem {

    private static final int turnOnTime = 5;
    private static final int turnOffTime = 8;
    
    public static void turnSprinklersOn() {
        Logkeeping.addLog("Sprinklers turned on");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (Scene1Controller.plant2DArray[i][j] != null && Scene1Controller.plant2DArray[i][j].isSprinklerInRange()) {
                    Scene1Controller.plant2DArray[i][j].resetDaysUntilDead();
                    ColorAdjust tintBlue = new ColorAdjust();
                    tintBlue.setHue(Color.BLUE.getHue());
                    Scene1Controller.imageView2DArray[i][j].setEffect(tintBlue);
                }
                if (Scene1Controller.sprinkler2DArray[i][j] != null) { //if sprinkler is present turn it on and update image
                    Scene1Controller.sprinkler2DArray[i][j].turnOn();
                    Scene1Controller.imageView2DArray[i][j].setImage(Scene1Controller.sprinkler2DArray[i][j].getSprinklerImage());
                }
            }
        }
    }

    public static void turnSprinklersOff() {
        Logkeeping.addLog("Sprinklers turned off");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (Scene1Controller.plant2DArray[i][j] != null) {
                    Scene1Controller.imageView2DArray[i][j].setEffect(null);
                }
                if (Scene1Controller.sprinkler2DArray[i][j] != null) {
                    Scene1Controller.sprinkler2DArray[i][j].turnOff();
                    Scene1Controller.imageView2DArray[i][j].setImage(Scene1Controller.sprinkler2DArray[i][j].getSprinklerImage());
                }
            }
        }
    }

    public static void initalizeWateringSystem() {
        boolean[][] willBeWatered2DArray = new boolean[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(Scene1Controller.sprinkler2DArray[i][j] != null)
                {
                    Image itemImage = Scene1Controller.sprinkler2DArray[i][j].getSprinklerImage();
                    Scene1Controller.imageView2DArray[i][j].setImage(itemImage);

                    int iMin = Integer.max(0,i-1), iMax = Integer.min(5, i+1);
                    int jMin = Integer.max(0,j-1), jMax = Integer.min(5, j+1);
                    willBeWatered2DArray[iMin][jMin] = true;
                    willBeWatered2DArray[iMin][j] = true;
                    willBeWatered2DArray[iMin][jMax] = true;
                    willBeWatered2DArray[i][jMin] = true;
                    willBeWatered2DArray[i][jMax] = true;
                    willBeWatered2DArray[iMax][jMin] = true;
                    willBeWatered2DArray[iMax][j] = true;
                    willBeWatered2DArray[iMax][jMax] = true;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (Scene1Controller.plant2DArray[i][j] != null)
                    if (willBeWatered2DArray[i][j])
                        Scene1Controller.plant2DArray[i][j].setSprinklerInRange(true);
            }
        }
    }

    public static int getTurnOnTime() {
        return turnOnTime;
    }

    public static int getTurnOffTime() {
        return turnOffTime;
    }
}