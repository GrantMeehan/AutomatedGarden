package com.example.automatedgarden;

// CURRENTLY UNUSED

import javafx.scene.image.Image;

public class GardenItem {
    protected String name;
    protected Image itemImage;

    public GardenItem() {
        this.name = "Empty";
        this.itemImage = null;
    }

    public String getName() {
        return name;
    }

    public Image getItemImage() {
        return itemImage;
    }
}
