package com.example.automatedgarden;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Plant {
    protected String name;
    protected Image plantImage;
    protected int daysPerGrowth;
    protected int daysUntilDead;
    protected PlantStage plantStage;

    public Plant() {
        this.name = "Empty";
        this.plantImage = null;
    }

    public void growPlant() {

    }

    public void killPlant() {
        FileInputStream deadPlantFile;
        try {
            deadPlantFile = new FileInputStream("images/dead-plant-placeholder.jpg"); //example image -- need to change
            this.plantImage = new Image(deadPlantFile);
        } catch (FileNotFoundException e) {
            System.out.println("Dead plant image file not found");
        }
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

    public int getDaysPerGrowth() {
        return daysPerGrowth;
    }

    public void setDaysPerGrowth(int daysPerGrowth) {
        this.daysPerGrowth = daysPerGrowth;
    }

    public int getDaysUntilDead() {
        return daysUntilDead;
    }

    public void setDaysUntilDead(int daysUntilDead) {
        this.daysUntilDead = daysUntilDead;
    }

    public PlantStage getPlantStage() {
        return plantStage;
    }

    public void setPlantStage(PlantStage plantStage) {
        this.plantStage = plantStage;
    }
}
