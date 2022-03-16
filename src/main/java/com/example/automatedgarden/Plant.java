package com.example.automatedgarden;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Plant {
    protected String name;
    protected Image plantImage;
    protected int daysUntilGrowth;
    protected int daysUntilDead;
    protected PlantStage plantStage;
    protected boolean sprinklerInRange;
    protected int plantHealth;

    public Plant() {
        this.name = "Empty";
        this.plantImage = null;
        this.plantHealth = -1;

        FileInputStream blankPlantFile;
        try {
            blankPlantFile = new FileInputStream("images/blank_soil.png");
            this.plantImage = new Image(blankPlantFile);
        } catch (FileNotFoundException e) {
            System.out.println("Blank soil image file not found");
        }
    }

    //overloaded by subclasses for specific plant images
    public void growPlant() {

    }

    //changes plant stage to dead
    //updates plant image to dead plant image
    //logs that plant has died
    //changes daysUntilGrowth to 0 so plant will never grow
    public void killPlant() {
        this.plantStage = PlantStage.DEAD;
        FileInputStream deadPlantFile;
        try {
            deadPlantFile = new FileInputStream("images/dead.png");
            this.plantImage = new Image(deadPlantFile);
        } catch (FileNotFoundException e) {
            System.out.println("Dead plant image file not found");
        }
        Logkeeping.addLog(name + " plant died.");
        this.daysUntilGrowth = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getPlantImage() {
        return plantImage;
    }

    public void setPlantImage(Image plantImage) {
        this.plantImage = plantImage;
    }

    public int getDaysUntilGrowth() {
        return daysUntilGrowth;
    }

    public void setDaysUntilGrowth(int daysUntilGrowth) {
        this.daysUntilGrowth = daysUntilGrowth;
    }

    //overloaded by subclasses for specific plant growth ranges
    public void resetDaysUntilGrowth() {

    }

    public int getDaysUntilDead() {
        return daysUntilDead;
    }

    public void setDaysUntilDead(int daysUntilDead) {
        this.daysUntilDead = daysUntilDead;
    }

    //overloaded by subclasses for specific plant death ranges
    public void resetDaysUntilDead() {

    }

    public PlantStage getPlantStage() {
        return plantStage;
    }

    public void setPlantStage(PlantStage plantStage) {
        this.plantStage = plantStage;
    }

    public boolean isSprinklerInRange() {
        return sprinklerInRange;
    }

    public void setSprinklerInRange(boolean sprinklerInRange) {
        this.sprinklerInRange = sprinklerInRange;
    }

    public int getPlantHealth() {
        return plantHealth;
    }

    public void setPlantHealth(int plantHealth) {
        this.plantHealth = plantHealth;
    }
}
