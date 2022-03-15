package com.example.automatedgarden;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Zucchini extends Plant{
    public Zucchini() {
        this.name = "Zucchini";
        this.daysPerGrowth = 3;
        this.daysUntilDead = 5;
        this.plantStage = PlantStage.SEED;

        FileInputStream zucchiniImageFile;
        try {
            zucchiniImageFile = new FileInputStream("images/zucchini-placeholder.jpg"); //example image -- need to change
            this.plantImage = new Image(zucchiniImageFile);
        } catch (FileNotFoundException e) {
            System.out.println("Zucchini image file not found");
        }
    }

    public void resetDaysUntilDead() {
        this.daysUntilDead = 5;
    }
}
