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

    public Plant() {
        this.name = "Empty";
        this.plantImage = null;
    }

    //add specific changers for specific plants
    public void growPlant() {

    }

    public void killPlant() {
        this.plantStage = PlantStage.DEAD;
        FileInputStream deadPlantFile;
        try {
            deadPlantFile = new FileInputStream("images/dead-plant-placeholder.jpg"); //example image -- need to change
            this.plantImage = new Image(deadPlantFile);
        } catch (FileNotFoundException e) {
            System.out.println("Dead plant image file not found");
        }

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

    public void resetDaysUntilGrowth() {

    }

    public int getDaysUntilDead() {
        return daysUntilDead;
    }

    public void setDaysUntilDead(int daysUntilDead) {
        this.daysUntilDead = daysUntilDead;
    }

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
}
