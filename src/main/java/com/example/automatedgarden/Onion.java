package com.example.automatedgarden;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class Onion extends Plant {

    public static int onionHarvestCount;

    public Onion() {
        this.name = "Onion";
        Random rand = new Random(System.currentTimeMillis());
        this.daysUntilGrowth = rand.nextInt(6,9);
        this.daysUntilDead = 10;
        this.plantStage = PlantStage.SEED;
        this.plantHealth = 10;

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
                    FileInputStream onionImageFile;
                    try {
                        onionImageFile = new FileInputStream("images/onion-placeholder.png"); //example image -- need to change
                        this.plantImage = new Image(onionImageFile);
                    } catch (FileNotFoundException e) {
                        System.out.println("Onion image file not found.");
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
                    this.plantHealth = 10;
                    resetDaysUntilGrowth();
                    resetDaysUntilDead();
                    onionHarvestCount++;
                    Logkeeping.addLog(this.name + " plant was harvested.");
                }
            }
        }
    }

    @Override
    public void resetDaysUntilDead() {
        this.daysUntilDead = 10;
    }

    @Override
    public void resetDaysUntilGrowth() {
        Random rand = new Random(System.currentTimeMillis());
        this.daysUntilGrowth = rand.nextInt(6,9);
    }
}
