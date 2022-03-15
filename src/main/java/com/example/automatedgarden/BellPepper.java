package com.example.automatedgarden;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BellPepper extends Plant {
    public BellPepper() {
        this.name = "Bell Pepper";
        this.daysPerGrowth = 4;
        this.daysUntilDead = 7;
        this.plantStage = PlantStage.SEED;

        FileInputStream bellPepperImageFile;
        try {
            bellPepperImageFile = new FileInputStream("images/bell-pepper-placeholder.png"); //example image -- need to change
            this.plantImage = new Image(bellPepperImageFile);
        } catch (FileNotFoundException e) {
            System.out.println("Bell pepper image file not found");
        }
    }

    public void resetDaysUntilDead() {
        this.daysUntilDead = 7;
    }
}
