package com.example.automatedgarden;

import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class WateringSystem {

    private static final int turnOnTime = 5;
    private static final int turnOffTime = 7;

    public static void turnSprinklersOn() {
        //logs that sprinklers have been turned on
        Logkeeping.addLog("Sprinkler system turned on at " + turnOnTime + ":00.");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //check if location in plant2DArray is null to avoid null pointer exception on function calls
                //if sprinkler is in range, change tint of plant square to blue by blending current color with blue
                if (Scene1Controller.plant2DArray[i][j] != null && Scene1Controller.plant2DArray[i][j].isSprinklerInRange()) {
                    Scene1Controller.plant2DArray[i][j].resetDaysUntilDead();
                    Scene1Controller.plant2DArray[i][j].setPlantHealth(10);

                    ColorAdjust monochrome = new ColorAdjust();
                    ColorInput colorInput = new ColorInput(
                            Scene1Controller.plantImageView2DArray[i][j].getX(),
                            Scene1Controller.plantImageView2DArray[i][j].getY(),
                            Scene1Controller.plantImageView2DArray[i][j].getFitHeight(),
                            Scene1Controller.plantImageView2DArray[i][j].getFitWidth(),
                            Color.SKYBLUE
                    );
                    Blend tintBlue = new Blend(BlendMode.MULTIPLY, monochrome, colorInput);
                    Scene1Controller.plantImageView2DArray[i][j].setEffect(tintBlue);
                }
                //check if location in sprinkler2DArray is null to avoid null pointer exception on function calls
                //if sprinkler is present call turn on function (which updates object's image)
                //update images of sprinklers with current image (sprinkler on image)
                if (Scene1Controller.sprinkler2DArray[i][j] != null) {
                    Scene1Controller.sprinkler2DArray[i][j].turnOn();
                    Scene1Controller.plantImageView2DArray[i][j].setImage(Scene1Controller.sprinkler2DArray[i][j].getSprinklerImage());
                }
            }
        }
    }

    public static void turnSprinklersOff() {
        Logkeeping.addLog("Sprinkler system turned off at " + turnOffTime + ":00.");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //check if location in plant2DArray is null to avoid null pointer exception on function calls
                //set effect of all plant squares to null to eliminate tint
                if (Scene1Controller.plant2DArray[i][j] != null) {
                    Scene1Controller.plantImageView2DArray[i][j].setEffect(null);
                }
                //check if location in sprinkler2DArray is null to avoid null pointer exception on function calls
                //if sprinkler is present call turn off function (which updates object's image)
                //update images of sprinklers with current image (sprinkler off image)
                if (Scene1Controller.sprinkler2DArray[i][j] != null) {
                    Scene1Controller.sprinkler2DArray[i][j].turnOff();
                    Scene1Controller.plantImageView2DArray[i][j].setImage(Scene1Controller.sprinkler2DArray[i][j].getSprinklerImage());
                }
            }
        }
    }

    public static void initializeWateringSystem() {
        boolean[][] willBeWatered2DArray = new boolean[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //check if location in sprinkler2DArray is null to avoid null pointer exception on function calls
                if(Scene1Controller.sprinkler2DArray[i][j] != null)
                {
                    //set image to sprinkler in location where sprinkler was chosen and sprinkler object was created
                    Image itemImage = Scene1Controller.sprinkler2DArray[i][j].getSprinklerImage();
                    Scene1Controller.plantImageView2DArray[i][j].setImage(itemImage);

                    //finds the bounds for where the sprinkler can reach
                    //use max/min function to avoid index out of bounds on edges (0 or 5 leads to -1 or 6)
                    int iMin = Integer.max(0,i-1), iMax = Integer.min(5, i+1);
                    int jMin = Integer.max(0,j-1), jMax = Integer.min(5, j+1);

                    //sets boolean 2D Array willBeWatered grid spots to true in all locations adjacent to sprinkler, does not include own location ([i][j])
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
                //check if location in plant2DArray is null to avoid null pointer exception on function calls
                //if location in boolean 2D Array is true, sets parameter of sprinkler in range to true for plant object
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