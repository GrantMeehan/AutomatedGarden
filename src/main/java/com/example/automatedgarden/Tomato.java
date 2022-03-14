package com.example.automatedgarden;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Tomato extends Plant {
    public Tomato() {
        this.name = "Tomato";
        this.daysPerGrowth = 2;
        this.daysUntilDead = 12;
        this.plantStage = PlantStage.SEED;

        FileInputStream tomatoImageFile;
        try {
            tomatoImageFile = new FileInputStream("images/tomato-placeholder.png"); //example image -- need to change
            this.plantImage = new Image(tomatoImageFile);
        } catch (FileNotFoundException e) {
            System.out.println("Tomato image file not found");
        }
    }
}
