package com.example.automatedgarden;

import java.util.Random;

public class PestController {

    private static int maxPests = -1;
    private static int pestSpawnTime; //random number between 0 (inclusive) and 5 (exclusive) OR 20 (inclusive) and 24 (exclusive)

    //randomly generate number of pests that will spawn (1 - # of total plants?)
    //randomly generate pestSpawnTime using parameters given above
    //loop through plant2DArray. if plant exists, randomly decide if pest should spawn
    //if pest will spawn, create new pest object at same coordinates of plant in pest2DArray
    //update image to reflect
    public static void generatePests() {
        Logkeeping.addLog("Pests have attacked the garden!");
        if (maxPests < 0)
            calculateMaxPests();

        Random rand = new Random(System.currentTimeMillis());
        int numPests = 0;
        if (maxPests > 0)
            numPests = rand.nextInt(0, maxPests);

        while (numPests > 0) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (Scene1Controller.plant2DArray[i][j] != null)
                        if (numPests > 0 && rand.nextInt(2) == 1 && !Scene1Controller.plant2DArray[i][j].getName().equalsIgnoreCase("empty")) {
                            Scene1Controller.pest2DArray[i][j] = new Pest();
                            Scene1Controller.pestImageView2DArray[i][j].setImage(Scene1Controller.pest2DArray[i][j].getImage());
                            numPests--;
                        }
                }
            }
        }
    }

    public static void calculateMaxPests() {
        //counts number of total plants to be the max number of pests
        maxPests = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (Scene1Controller.plant2DArray[i][j] != null)
                    if (!Scene1Controller.plant2DArray[i][j].getName().equalsIgnoreCase("empty")) {
                        maxPests++;
                    }
            }
        }
    }

    public static void generateSpawnTime() {
        Random rand = new Random(System.currentTimeMillis());
        pestSpawnTime = rand.nextInt(15, 22);
    }

    //set all objects in pest2DArray to null
    //update images on grid to reflect
    public static void killPests() {
        Logkeeping.addLog("Pests have been killed.");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Scene1Controller.pest2DArray[i][j] = null;
                Scene1Controller.pestImageView2DArray[i][j].setImage(null);
            }
        }
    }

    public static int getPestSpawnTime() {
        return pestSpawnTime;
    }
}
