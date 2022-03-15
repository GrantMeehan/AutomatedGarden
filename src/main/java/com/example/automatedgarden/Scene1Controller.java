package com.example.automatedgarden;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import java.util.ArrayList;
import java.util.Arrays;

public class Scene1Controller{

    public GridPane gridPane;
    public MenuButton mb00, mb01, mb02, mb03, mb04, mb05;
    public MenuButton mb10, mb11, mb12, mb13, mb14, mb15;
    public MenuButton mb20, mb21, mb22, mb23, mb24, mb25;
    public MenuButton mb30, mb31, mb32, mb33, mb34, mb35;
    public MenuButton mb40, mb41, mb42, mb43, mb44, mb45;
    public MenuButton mb50, mb51, mb52, mb53, mb54, mb55;

    public Button sprinklersOnButton, sprinklersOffButton;
    public Button heatingOnButton, heatingOffButton;
    public Button submitButton, playPauseButton;

    public Label sprinklersLabel, heatingLabel;
    public Label dayLabel, timeLabel;
    public Label timesSpeedLabel;

    public Tooltip notice1, notice2;

    public Slider timesSpeedSlider;

    public ImageView iv00, iv01, iv02, iv03, iv04, iv05;
    public ImageView iv10, iv11, iv12, iv13, iv14, iv15;
    public ImageView iv20, iv21, iv22, iv23, iv24, iv25;
    public ImageView iv30, iv31, iv32, iv33, iv34, iv35;
    public ImageView iv40, iv41, iv42, iv43, iv44, iv45;
    public ImageView iv50, iv51, iv52, iv53, iv54, iv55;

    public ArrayList<MenuButton> menuButtonArrayList;
    public ArrayList<ImageView> imageViewArrayList;

    public static MenuButton[][] menuButton2DArray = new MenuButton[6][6];
    public static ImageView[][] imageView2DArray = new ImageView[6][6];
    public static Plant[][] plant2DArray = new Plant[6][6];
    public static Sprinkler[][] sprinkler2DArray = new Sprinkler[6][6];

    public Timeline worldTimeline;

    public void changeMB00(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb00.setText(menuItem.getText());
    }
    public void changeMB01(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb01.setText(menuItem.getText());
    }
    public void changeMB02(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb02.setText(menuItem.getText());
    }
    public void changeMB03(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb03.setText(menuItem.getText());
    }
    public void changeMB04(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb04.setText(menuItem.getText());
    }
    public void changeMB05(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb05.setText(menuItem.getText());
    }
    public void changeMB10(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb10.setText(menuItem.getText());
    }
    public void changeMB11(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb11.setText(menuItem.getText());
    }
    public void changeMB12(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb12.setText(menuItem.getText());
    }
    public void changeMB13(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb13.setText(menuItem.getText());
    }
    public void changeMB14(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb14.setText(menuItem.getText());
    }
    public void changeMB15(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb15.setText(menuItem.getText());
    }
    public void changeMB20(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb20.setText(menuItem.getText());
    }
    public void changeMB21(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb21.setText(menuItem.getText());
    }
    public void changeMB22(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb22.setText(menuItem.getText());
    }
    public void changeMB23(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb23.setText(menuItem.getText());
    }
    public void changeMB24(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb24.setText(menuItem.getText());
    }
    public void changeMB25(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb25.setText(menuItem.getText());
    }
    public void changeMB30(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb30.setText(menuItem.getText());
    }
    public void changeMB31(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb31.setText(menuItem.getText());
    }
    public void changeMB32(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb32.setText(menuItem.getText());
    }
    public void changeMB33(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb33.setText(menuItem.getText());
    }
    public void changeMB34(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb34.setText(menuItem.getText());
    }
    public void changeMB35(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb35.setText(menuItem.getText());
    }
    public void changeMB40(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb40.setText(menuItem.getText());
    }
    public void changeMB41(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb41.setText(menuItem.getText());
    }
    public void changeMB42(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb42.setText(menuItem.getText());
    }
    public void changeMB43(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb43.setText(menuItem.getText());
    }
    public void changeMB44(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb44.setText(menuItem.getText());
    }
    public void changeMB45(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb45.setText(menuItem.getText());
    }
    public void changeMB50(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb50.setText(menuItem.getText());
    }
    public void changeMB51(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb51.setText(menuItem.getText());
    }
    public void changeMB52(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb52.setText(menuItem.getText());
    }
    public void changeMB53(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb53.setText(menuItem.getText());
    }
    public void changeMB54(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb54.setText(menuItem.getText());
    }
    public void changeMB55(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        mb55.setText(menuItem.getText());
    }

    public void submitButtonClick(){
        Logkeeping.addLog("Begin day 1.");
        submitButton.setDisable(true);
        playPauseButton.setVisible(true);
        sprinklersOnButton.setDisable(false);
        sprinklersOffButton.setDisable(false);
        heatingOnButton.setDisable(false);
        heatingOffButton.setDisable(false);
        sprinklersLabel.setTooltip(null);
        heatingLabel.setTooltip(null);
        timesSpeedLabel.setVisible(true);
        timesSpeedSlider.setVisible(true);

        menuButtonArrayList = new ArrayList<>(Arrays.asList(mb00,mb01,mb02,mb03,mb04,mb05,mb10,mb11,mb12,mb13,mb14,mb15,
                mb20,mb21,mb22,mb23,mb24,mb25,mb30,mb31,mb32,mb33,mb34,mb35,
                mb40,mb41,mb42,mb43,mb44,mb45,mb50,mb51,mb52,mb53,mb54,mb55));
        imageViewArrayList = new ArrayList<>(Arrays.asList(iv00,iv01,iv02,iv03,iv04,iv05,iv10,iv11,iv12,iv13,iv14,iv15,
                iv20,iv21,iv22,iv23,iv24,iv25,iv30,iv31,iv32,iv33,iv34,iv35,
                iv40,iv41,iv42,iv43,iv44,iv45,iv50,iv51,iv52,iv53,iv54,iv55));
        //menuButtonArrayList = getGridPaneMenuButtons();

        //converting menuButtonArrayList --> 2D Array
        //hides button elements
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (!menuButtonArrayList.isEmpty()) {
                    menuButton2DArray[i][j] = menuButtonArrayList.get(0);
                    menuButtonArrayList.remove(0);
                    menuButton2DArray[i][j].setVisible(false);
                }
            }
        }

        //converting imageViewArrayList --> 2D Array
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (!imageViewArrayList.isEmpty()) {
                    imageView2DArray[i][j] = imageViewArrayList.get(0);
                    imageViewArrayList.remove(0);
                }
            }
        }

        //creates 2D arrays for plants and sprinklers depending on menu button choice
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (menuButton2DArray[i][j] != null) {
                    switch (menuButton2DArray[i][j].getText().toLowerCase()) {
                        case "empty" -> plant2DArray[i][j] = new Plant();
                        case "bell pepper" -> plant2DArray[i][j] = new BellPepper();
                        case "eggplant" -> plant2DArray[i][j] = new Eggplant();
                        case "onion" -> plant2DArray[i][j] = new Onion();
                        case "tomato" -> plant2DArray[i][j] = new Tomato();
                        case "zucchini" -> plant2DArray[i][j] = new Zucchini();
                        case "sprinkler" -> sprinkler2DArray[i][j] = new Sprinkler();
                    }
                    if (plant2DArray[i][j] != null && !plant2DArray[i][j].getName().equalsIgnoreCase("empty"))
                        Logkeeping.addLog(plant2DArray[i][j].getName() + " planted.");
                    //System.out.println(menuButton2DArray[i][j].getText());
                }
            }
        }

        //Displays ImageView Elements and changes Image to starting
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (imageView2DArray[i][j] != null) {
                    imageView2DArray[i][j].setVisible(true);
                }
                if(plant2DArray[i][j] != null) {
                    Image itemImage = plant2DArray[i][j].getPlantImage();
                    imageView2DArray[i][j].setImage(itemImage);
                }
            }
        }

        WateringSystem.initalizeWateringSystem();

        worldTimeline = new Timeline(new KeyFrame(Duration.seconds(2.5), new EventHandler<ActionEvent>() {
            int dayCounter = 1;
            int hourCounter = 0;
            @Override
            public void handle(ActionEvent actionEvent) {
                hourCounter++;

                if (hourCounter == WateringSystem.getTurnOnTime()) {
                    turnSprinklersOn();
                }
                if (hourCounter == WateringSystem.getTurnOffTime()) {
                    turnSprinklersOff();
                }

                if (hourCounter > 23) { //SWITCHING DAY
                    hourCounter = 0;
                    dayCounter++;
                    Logkeeping.addLog('\n' + "Begin day " + dayCounter + ".");

                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (plant2DArray[i][j] != null) {
                                plant2DArray[i][j].setDaysUntilDead(plant2DArray[i][j].getDaysUntilDead()-1);
                                if (plant2DArray[i][j].getDaysUntilDead() == 0) {
                                    Logkeeping.addLog(plant2DArray[i][j].getName() + " plant died.");
                                    plant2DArray[i][j].killPlant();
                                    imageView2DArray[i][j].setImage(plant2DArray[i][j].getPlantImage());
                                }
                                plant2DArray[i][j].setDaysUntilGrowth(plant2DArray[i][j].getDaysUntilGrowth()-1);
                                plant2DArray[i][j].growPlant();
                                imageView2DArray[i][j].setImage(plant2DArray[i][j].getPlantImage());
                            }
                        }
                    }
                }
                if (hourCounter < 10)
                    timeLabel.setText("Time: 0" + hourCounter + ":00");
                else
                    timeLabel.setText("Time: " + hourCounter + ":00");
                dayLabel.setText("Day: " + dayCounter);

                //updateImages();
            }
        }));
        worldTimeline.setCycleCount(Integer.MAX_VALUE);
        worldTimeline.play();
    }

    public void playPauseButtonClicked(){
        if (playPauseButton.getText().equalsIgnoreCase("pause")) {
            Logkeeping.addLog("Simulation paused.");
            worldTimeline.pause();
            timesSpeedSlider.setDisable(true);
            playPauseButton.setText("Play");
        }
        else if (playPauseButton.getText().equalsIgnoreCase("play")) {
            Logkeeping.addLog("Simulation resumed.");
            worldTimeline.play();
            timesSpeedSlider.setDisable(false);
            playPauseButton.setText("Pause");
        }
    }

    public void timesSpeedChanged() {
        Logkeeping.addLog("Simulation speed changed to " + (int)timesSpeedSlider.getValue() + ".");
        timesSpeedLabel.setText("Simulation Speed: " + (int)timesSpeedSlider.getValue());
        worldTimeline.setRate(timesSpeedSlider.getValue());
    }

    //need to change to only plants within area of sprinkler
    public void turnSprinklersOn() {
        WateringSystem.turnSprinklersOn();
    }

    public void turnSprinklersOff() {
        WateringSystem.turnSprinklersOff();
    }

    public void turnHeatingOn() {
        HeatingSystem.turnHeatingOn();
    }

    public void turnHeatingOff() {
        HeatingSystem.turnHeatingOff();
    }

    //Gets the current plant/sprinkler images and updates the imageview elements
    public void updateImages() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(plant2DArray[i][j] != null) {
                    Image plantImage = plant2DArray[i][j].getPlantImage();
                    imageView2DArray[i][j].setImage(plantImage);
                }
                if (sprinkler2DArray[i][j] != null) {
                    Image sprinklerImage = sprinkler2DArray[i][j].getSprinklerImage();
                    imageView2DArray[i][j].setImage(sprinklerImage);
                }
            }
        }
    }

    //unused function
    public ArrayList<MenuButton> getGridPaneMenuButtons() {
        ArrayList<StackPane> stackPanes = new ArrayList<>();
        for (Node child : gridPane.getChildren()) {
            if (child.getClass() == StackPane.class) {
                stackPanes.add((StackPane) child);
            }
        }
        ArrayList<MenuButton> menuButtons = new ArrayList<>();
        for (StackPane sp : stackPanes) {
            for (Node child : sp.getChildren()) {
                if (child.getClass() == MenuButton.class) {
                    menuButtons.add((MenuButton) child);
                }
            }
        }
        return menuButtons;
    }
}