package com.example.automatedgarden;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sprinkler{
    protected String name;
    protected Image sprinklerImage;

    public Sprinkler() {
        this.name = "Sprinkler";

        FileInputStream sprinklerImageFile;
        try {
            sprinklerImageFile = new FileInputStream("images/sprinkler_off.png");
            this.sprinklerImage = new Image(sprinklerImageFile);
        } catch (FileNotFoundException e) {
            System.out.println("Sprinkler image file not found");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getSprinklerImage() {
        return sprinklerImage;
    }

    public void turnOn() {
        FileInputStream sprinklerOnFile;
        try {
            sprinklerOnFile = new FileInputStream("images/sprinkler_on.png");
            this.sprinklerImage = new Image(sprinklerOnFile);
        } catch (FileNotFoundException e) {
            System.out.println("Sprinkler on image file not found");
        }
    }

    public void turnOff() {
        FileInputStream sprinklerOffFile;
        try {
            sprinklerOffFile = new FileInputStream("images/sprinkler_off.png");
            this.sprinklerImage = new Image(sprinklerOffFile);
        } catch (FileNotFoundException e) {
            System.out.println("Sprinkler off image file not found");
        }
    }
}
