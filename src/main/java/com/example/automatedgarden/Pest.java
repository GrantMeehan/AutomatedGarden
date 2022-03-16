package com.example.automatedgarden;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Pest {
    private String name;
    private Image image;

    public Pest() {
        this.name = "Bug";

        FileInputStream pestImageFile;
        try {
            pestImageFile = new FileInputStream("images/pests.png"); //example image -- need to change
            this.image = new Image(pestImageFile);
        } catch (FileNotFoundException e) {
            System.out.println("Pest image file not found.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
