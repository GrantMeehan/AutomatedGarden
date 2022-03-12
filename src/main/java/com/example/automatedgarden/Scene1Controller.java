package com.example.automatedgarden;

import javafx.event.ActionEvent;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.io.IOException;

public class Scene1Controller{

    public MenuButton mb00;

    public GardenItem[][] gardenItems;

    public void chooseOnion(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();

        System.out.println(menuItem.getText());

        //need to get parent of MenuItem

        //System.out.println(menuButton.getText());
    }

    public void chooseTomato() {

    }

    public void chooseZucchini() {

    }

    public void chooseBellPepper() {

    }

    public void chooseEggplant() {

    }

    public void chooseSprinkler() {

    }

    public void submitButtonClick() throws IOException {

    }
}