package com.example.automatedgarden;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.io.IOException;
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

    public MenuButton[][] menuButton2DArray = new MenuButton[6][6];
    public ImageView[][] imageView2DArray = new ImageView[6][6];
    public GardenItem[][] gardenItem2DArray = new GardenItem[6][6];

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

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (menuButton2DArray[i][j] != null) {
                    switch (menuButton2DArray[i][j].getText().toLowerCase()) {
                        case "empty" -> gardenItem2DArray[i][j] = new GardenItem();
                        case "bell pepper" -> gardenItem2DArray[i][j] = new BellPepper();
                        case "eggplant" -> gardenItem2DArray[i][j] = new Eggplant();
                        case "onion" -> gardenItem2DArray[i][j] = new Onion();
                        case "tomato" -> gardenItem2DArray[i][j] = new Tomato();
                        case "zucchini" -> gardenItem2DArray[i][j] = new Zucchini();
                        case "sprinkler" -> gardenItem2DArray[i][j] = new Sprinkler();
                    }
                    //System.out.println(menuButton2DArray[i][j].getText());
                }
            }
        }
        System.out.println();

        //Displays ImageView Elements and changes Image to starting
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (imageView2DArray[i][j] != null) {
                    imageView2DArray[i][j].setVisible(true);
                }
                if(gardenItem2DArray[i][j].getItemImage() != null) {
                    Image itemImage = gardenItem2DArray[i][j].getItemImage();
                    imageView2DArray[i][j].setImage(itemImage);
                }
            }
        }

        worldTimeline = new Timeline(new KeyFrame(Duration.seconds(2.5), new EventHandler<ActionEvent>() {
            int dayCounter = 1;
            int hourCounter = 0;
            @Override
            public void handle(ActionEvent actionEvent) {
                hourCounter++;
                if (hourCounter > 23) {
                    hourCounter = 0;
                    dayCounter++;
                }
                if (hourCounter < 10)
                    timeLabel.setText("Time: 0" + hourCounter + ":00");
                else
                    timeLabel.setText("Time: " + hourCounter + ":00");
                dayLabel.setText("Day: " + dayCounter);
            }
        }));
        worldTimeline.setCycleCount(Integer.MAX_VALUE);
        worldTimeline.play();
    }

    public void playPauseButtonClicked(){
        if (playPauseButton.getText().equalsIgnoreCase("pause")) {
            worldTimeline.pause();
            timesSpeedSlider.setDisable(true);
            playPauseButton.setText("Play");
        }
        else if (playPauseButton.getText().equalsIgnoreCase("play")) {
            worldTimeline.play();
            timesSpeedSlider.setDisable(false);
            playPauseButton.setText("Pause");
        }
    }

    public void timesSpeedChanged() {
        timesSpeedLabel.setText("Simulation Speed: " + (int)timesSpeedSlider.getValue());
        worldTimeline.setRate(timesSpeedSlider.getValue());
    }

    //need to change to only plants within area of sprinkler
    public void turnSprinklersOn() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (imageView2DArray[i][j] != null) {
                    ColorAdjust tintBlue = new ColorAdjust();
                    tintBlue.setHue(Color.BLUE.getHue());
                    imageView2DArray[i][j].setEffect(tintBlue);
                }
            }
        }
    }

    public void turnSprinklersOff() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (imageView2DArray[i][j] != null) {
                    imageView2DArray[i][j].setEffect(null);
                }
            }
        }
    }

    public void turnHeatingOn() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (imageView2DArray[i][j] != null) {
                    ColorAdjust tintOrangeRed = new ColorAdjust();
                    tintOrangeRed.setHue(Color.ORANGE.getHue());
                    imageView2DArray[i][j].setEffect(tintOrangeRed);
                }
            }
        }
    }

    public void turnHeatingOff() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (imageView2DArray[i][j] != null) {
                    imageView2DArray[i][j].setEffect(null);
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