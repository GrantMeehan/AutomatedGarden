package com.example.automatedgarden;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class BellPepper extends Plant {

    public static int bellPepperHarvestCount;

    public BellPepper() {
        this.name = "Bell Pepper";
        Random rand = new Random(System.currentTimeMillis());
        this.daysUntilGrowth = rand.nextInt(4,6);
        this.daysUntilDead = 7;
        this.plantStage = PlantStage.SEED;
        this.plantHealth = 10;

        FileInputStream seedlingImageFile;
        try {
            seedlingImageFile = new FileInputStream("images/seedling.png");
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
                        saplingImageFile = new FileInputStream("images/sapling.png");
                        this.plantImage = new Image(saplingImageFile);
                    } catch (FileNotFoundException e) {
                        System.out.println("Sapling image file not found.");
                    }
                    resetDaysUntilGrowth();
                    Logkeeping.addLog(this.name + " plant grew from seedling to sapling.");
                }
                case SAPLING -> {
                    this.plantStage = PlantStage.FLOWERED;
                    FileInputStream bellPepperImageFile;
                    try {
                        bellPepperImageFile = new FileInputStream("images/bell_pepper.png");
                        this.plantImage = new Image(bellPepperImageFile);
                    } catch (FileNotFoundException e) {
                        System.out.println("Bell Pepper image file not found.");
                    }
                    resetDaysUntilGrowth();
                    Logkeeping.addLog(this.name + " plant has matured.");
                }
                case FLOWERED -> {
                    this.plantStage = PlantStage.SEED;
                    FileInputStream seedlingImageFile;
                    try {
                        seedlingImageFile = new FileInputStream("images/seedling.png");
                        this.plantImage = new Image(seedlingImageFile);
                    } catch (FileNotFoundException e) {
                        System.out.println("Seedling image file not found.");
                    }
                    this.plantHealth = 10;
                    resetDaysUntilGrowth();
                    resetDaysUntilDead();
                    bellPepperHarvestCount++;
                    Logkeeping.addLog(this.name + " plant was harvested.");
                }
            }
        }
    }

    @Override
    public void resetDaysUntilDead() {
        this.daysUntilDead = 7;
    }

    @Override
    public void resetDaysUntilGrowth() {
        Random rand = new Random(System.currentTimeMillis());
        this.daysUntilGrowth = rand.nextInt(4,6);
    }
}
