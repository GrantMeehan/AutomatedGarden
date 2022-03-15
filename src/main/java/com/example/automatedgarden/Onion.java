package com.example.automatedgarden;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Onion extends Plant {
    public Onion() {
        this.name = "Onion";
        this.daysPerGrowth = 7;
        this.daysUntilDead = 10;
        this.plantStage = PlantStage.SEED;

        FileInputStream onionImageFile;
        try {
            onionImageFile = new FileInputStream("images/onion.png"); //example image -- need to change
            this.plantImage = new Image(onionImageFile);
        } catch (FileNotFoundException e) {
            System.out.println("Onion image file not found");
        }
    }

    public void resetDaysUntilDead() {
        this.daysUntilDead = 10;
    }
}
