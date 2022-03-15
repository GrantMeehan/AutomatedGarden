package com.example.automatedgarden;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class Zucchini extends Plant{

    public static int zucchiniHarvestCount;

    public Zucchini() {
        this.name = "Zucchini";
        Random rand = new Random(System.currentTimeMillis());
        this.daysUntilGrowth = rand.nextInt(3,5);
        this.daysUntilDead = 5;
        this.plantStage = PlantStage.SEED;

        FileInputStream seedlingImageFile;
        try {
            seedlingImageFile = new FileInputStream("images/seedling-placeholder.png"); //example image -- need to change
            this.plantImage = new Image(seedlingImageFile);
        } catch (FileNotFoundException e) {
            System.out.println("Seedling image file not found.");
        }
    }

    @Override
    public void growPlant() {
        if (daysUntilGrowth == 0) {
            switch (plantStage) {
                case SEED -> {
                    this.plantStage = PlantStage.SAPLING;
                    FileInputStream saplingImageFile;
                    try {
                        saplingImageFile = new FileInputStream("images/sapling-placeholder.jpg"); //example image -- need to change
                        this.plantImage = new Image(saplingImageFile);
                    } catch (FileNotFoundException e) {
                        System.out.println("Sapling image file not found.");
                    }
                    resetDaysUntilGrowth();
                    Logkeeping.addLog(this.name + " plant grew from seedling to sapling.");
                }
                case SAPLING -> {
                    this.plantStage = PlantStage.FLOWERED;
                    FileInputStream zucchiniImageFile;
                    try {
                        zucchiniImageFile = new FileInputStream("images/zucchini-placeholder.jpg"); //example image -- need to change
                        this.plantImage = new Image(zucchiniImageFile);
                    } catch (FileNotFoundException e) {
                        System.out.println("Zucchini image file not found.");
                    }
                    resetDaysUntilGrowth();
                    Logkeeping.addLog(this.name + " plant has matured.");
                }
                case FLOWERED -> {
                    this.plantStage = PlantStage.SEED;
                    FileInputStream seedlingImageFile;
                    try {
                        seedlingImageFile = new FileInputStream("images/seedling-placeholder.png"); //example image -- need to change
                        this.plantImage = new Image(seedlingImageFile);
                    } catch (FileNotFoundException e) {
                        System.out.println("Seedling image file not found.");
                    }
                    resetDaysUntilGrowth();
                    resetDaysUntilDead();
                    zucchiniHarvestCount++;
                    Logkeeping.addLog(this.name + " plant was harvested.");
                }
            }
        }
    }

    @Override
    public void resetDaysUntilDead() {
        this.daysUntilDead = 5;
    }

    @Override
    public void resetDaysUntilGrowth() {
        Random rand = new Random(System.currentTimeMillis());
        this.daysUntilGrowth = rand.nextInt(3,5);
    }
}
