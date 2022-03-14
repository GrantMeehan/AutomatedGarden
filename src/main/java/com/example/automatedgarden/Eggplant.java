package com.example.automatedgarden;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Eggplant extends Plant {
    public Eggplant() {
        this.name = "Eggplant";
        this.daysPerGrowth = 5;
        this.daysUntilDead = 4;
        this.plantStage = PlantStage.SEED;

        FileInputStream eggplantImageFile;
        try {
            eggplantImageFile = new FileInputStream("images/eggplant-placeholder.png"); //example image -- need to change
            this.plantImage = new Image(eggplantImageFile);
        } catch (FileNotFoundException e) {
            System.out.println("Eggplant image file not found");
        }
    }
}
