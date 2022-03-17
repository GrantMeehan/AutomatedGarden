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
    public Label bellPepperTotalLabel, eggplantTotalLabel, onionTotalLabel, tomatoTotalLabel, zucchiniTotalLabel;
    public Label header2;

    public Tooltip notice1, notice2;

    public Slider timesSpeedSlider;

    public ImageView plantIV00, plantIV01, plantIV02, plantIV03, plantIV04, plantIV05;
    public ImageView plantIV10, plantIV11, plantIV12, plantIV13, plantIV14, plantIV15;
    public ImageView plantIV20, plantIV21, plantIV22, plantIV23, plantIV24, plantIV25;
    public ImageView plantIV30, plantIV31, plantIV32, plantIV33, plantIV34, plantIV35;
    public ImageView plantIV40, plantIV41, plantIV42, plantIV43, plantIV44, plantIV45;
    public ImageView plantIV50, plantIV51, plantIV52, plantIV53, plantIV54, plantIV55;

    public ImageView pestIV00, pestIV01, pestIV02, pestIV03, pestIV04, pestIV05;
    public ImageView pestIV10, pestIV11, pestIV12, pestIV13, pestIV14, pestIV15;
    public ImageView pestIV20, pestIV21, pestIV22, pestIV23, pestIV24, pestIV25;
    public ImageView pestIV30, pestIV31, pestIV32, pestIV33, pestIV34, pestIV35;
    public ImageView pestIV40, pestIV41, pestIV42, pestIV43, pestIV44, pestIV45;
    public ImageView pestIV50, pestIV51, pestIV52, pestIV53, pestIV54, pestIV55;

    public ArrayList<MenuButton> menuButtonArrayList;
    public ArrayList<ImageView> plantImageViewArrayList, pestImageViewArrayList;

    public static MenuButton[][] menuButton2DArray = new MenuButton[6][6];
    public static ImageView[][] plantImageView2DArray = new ImageView[6][6];
    public static ImageView[][] pestImageView2DArray = new ImageView[6][6];
    public static Plant[][] plant2DArray = new Plant[6][6];
    public static Sprinkler[][] sprinkler2DArray = new Sprinkler[6][6];
    public static Pest[][] pest2DArray = new Pest[6][6];

    public Timeline worldTimeline;

    //each changeMB## functions changes the text of the corresponding MenuButton to the text of the selected MenuItem
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

    //On the action of the Submit Button being clicked
    public void submitButtonClick(){
        Logkeeping.addLog("Begin day 1.");
        submitButton.setDisable(true);
        playPauseButton.setVisible(true);
//        sprinklersOnButton.setDisable(false);
//        sprinklersOffButton.setDisable(false);
//        heatingOnButton.setDisable(false);
//        heatingOffButton.setDisable(false);
        sprinklersLabel.setTooltip(null);
        heatingLabel.setTooltip(null);
        timesSpeedLabel.setVisible(true);
        timesSpeedSlider.setVisible(true);

        header2.setText("Fully automated simulation running...");

        menuButtonArrayList = new ArrayList<>(Arrays.asList(mb00,mb01,mb02,mb03,mb04,mb05,mb10,mb11,mb12,mb13,mb14,mb15,
                mb20,mb21,mb22,mb23,mb24,mb25,mb30,mb31,mb32,mb33,mb34,mb35,
                mb40,mb41,mb42,mb43,mb44,mb45,mb50,mb51,mb52,mb53,mb54,mb55));
        plantImageViewArrayList = new ArrayList<>(Arrays.asList(plantIV00,plantIV01,plantIV02,plantIV03,plantIV04,plantIV05,plantIV10,plantIV11,plantIV12,plantIV13,plantIV14,plantIV15,
                plantIV20,plantIV21,plantIV22,plantIV23,plantIV24,plantIV25,plantIV30,plantIV31,plantIV32,plantIV33,plantIV34,plantIV35,
                plantIV40,plantIV41,plantIV42,plantIV43,plantIV44,plantIV45,plantIV50,plantIV51,plantIV52,plantIV53,plantIV54,plantIV55));
        pestImageViewArrayList = new ArrayList<>(Arrays.asList(pestIV00,pestIV01,pestIV02,pestIV03,pestIV04,pestIV05,pestIV10,pestIV11,pestIV12,pestIV13,pestIV14,pestIV15,
                pestIV20,pestIV21,pestIV22,pestIV23,pestIV24,pestIV25,pestIV30,pestIV31,pestIV32,pestIV33,pestIV34,pestIV35,
                pestIV40,pestIV41,pestIV42,pestIV43,pestIV44,pestIV45,pestIV50,pestIV51,pestIV52,pestIV53,pestIV54,pestIV55));
        //menuButtonArrayList = getGridPaneMenuButtons();

        //converts menuButtonArrayList to a 2DArray of MenuButton elements
        //hides the MenuButton elements in the UI
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (!menuButtonArrayList.isEmpty()) {
                    menuButton2DArray[i][j] = menuButtonArrayList.get(0);
                    menuButtonArrayList.remove(0);
                    menuButton2DArray[i][j].setVisible(false);
                }
            }
        }

        //converts plantImageViewArrayList to a 2DArray of ImageView elements
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (!plantImageViewArrayList.isEmpty()) {
                    plantImageView2DArray[i][j] = plantImageViewArrayList.get(0);
                    plantImageViewArrayList.remove(0);
                }
            }
        }

        //converts pestImageViewArrayList to a 2DArray of ImageView elements
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (!pestImageViewArrayList.isEmpty()) {
                    pestImageView2DArray[i][j] = pestImageViewArrayList.get(0);
                    pestImageViewArrayList.remove(0);
                }
            }
        }

        //populates 2D array of plants with objects specific to plant depending on the text of the corresponding MenuButton
        //populates 2D array of sprinklers with sprinkler objects if MenuButton text is sprinkler
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //check if location in menuButton2DArray is null to avoid null pointer exception on function calls
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
                    //adds log for each plant that has been planted
                    //check if location in plant2DArray is null to avoid null pointer exception on function calls
                    if (plant2DArray[i][j] != null && !plant2DArray[i][j].getName().equalsIgnoreCase("empty"))
                        Logkeeping.addLog(plant2DArray[i][j].getName() + " planted.");
                    //adds log for each sprinkler that has been placed
                    //check if location in sprinkler2DArray is null to avoid null pointer exception on function calls
                    if (sprinkler2DArray[i][j] != null)
                        Logkeeping.addLog(sprinkler2DArray[i][j].getName() + " placed.");
                }
            }
        }

        //sets all the ImageView elements to visible
        //at locations where plants have been planted, the images of the ImageView elements are changed to the correct Image (seedlings)
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //check if location in plantImageView2DArray is null to avoid null pointer exception on function calls
                if (plantImageView2DArray[i][j] != null) {
                    plantImageView2DArray[i][j].setVisible(true);
                }
                //check if location in pestImageView is null to avoid null pointer exception on function calls
                if (pestImageView2DArray[i][j] != null) {
                    pestImageView2DArray[i][j].setVisible(true);
                }
                //check if location in plant2DArray is null to avoid null pointer exception on function calls
                if(plant2DArray[i][j] != null) {
                    Image itemImage = plant2DArray[i][j].getPlantImage();
                    plantImageView2DArray[i][j].setImage(itemImage);
                }
            }
        }

        //initializes the watering system
        //more specific details in WateringSystem class
        WateringSystem.initializeWateringSystem();

        //generates pest spawn time for day 1
        PestController.generateSpawnTime();

        //creates new timeline that will repeatedly run a function at each time step of the timeline
        worldTimeline = new Timeline(new KeyFrame(Duration.seconds(2.5), new EventHandler<ActionEvent>() {
            int dayCounter = 1;
            int hourCounter = 0;
            int hourPestsPresent = 0;
            @Override
            //this function will run at each time step (set by the duration) of the timeline
            public void handle(ActionEvent actionEvent) {
                hourCounter++;

                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (plant2DArray[i][j] != null && pest2DArray[i][j] != null)
                        {
                            plant2DArray[i][j].setPlantHealth(plant2DArray[i][j].getPlantHealth()-1);
                        }
                    }
                }
                boolean pestsPresent = false;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (pest2DArray[i][j] != null) {
                            hourPestsPresent = hourCounter;
                            pestsPresent = true;
                            break;
                        }
                    }
                }
                if (pestsPresent)
                    turnHeatingOn();
                if (hourCounter == PestController.getPestSpawnTime() + 2)
                    turnHeatingOff();

                //Runs the Watering System turn on sequence at the time set by the Watering System
                if (hourCounter == WateringSystem.getTurnOnTime()) {
                    turnSprinklersOn();
                }
                //Runs the Watering System turn off sequence at the time set by the Watering System
                if (hourCounter == WateringSystem.getTurnOffTime()) {
                    turnSprinklersOff();
                }
                //Randomly generates pests at randomly generated spawn time
                if (hourCounter == PestController.getPestSpawnTime())
                {
                    PestController.generatePests();
                }

                //checks health status of plants hourly to ensure not dead from pests
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (plant2DArray[i][j] != null)
                            if (plant2DArray[i][j].getPlantHealth() == 0) {
                                plant2DArray[i][j].killPlant();
                                //update image to correct plant image (will be dead plant image)
                                plantImageView2DArray[i][j].setImage(plant2DArray[i][j].getPlantImage());
                            }
                    }
                }

                //items that need to happen when the day switches
                if (hourCounter > 23) {
                    hourCounter = 0;
                    dayCounter++;
                    Logkeeping.addLog('\n' + "Begin day " + dayCounter + ".");

                    PestController.generateSpawnTime();

                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            //check if location in plant2DArray is null to avoid null pointer exception on function calls
                            if (plant2DArray[i][j] != null) {
                                //decreases days until the plant will die by 1
                                plant2DArray[i][j].setDaysUntilDead(plant2DArray[i][j].getDaysUntilDead()-1);
                                //if the plant has no more days until death, run the plant kill function
                                if (plant2DArray[i][j].getDaysUntilDead() == 0) {
                                    plant2DArray[i][j].killPlant();
                                    //update image to correct plant image (will be dead plant image)
                                    plantImageView2DArray[i][j].setImage(plant2DArray[i][j].getPlantImage());
                                }

                                //decreases days until the next growth of the plant by 1
                                plant2DArray[i][j].setDaysUntilGrowth(plant2DArray[i][j].getDaysUntilGrowth()-1);

                                //grows plant, only will grow if daysUntilGrowth == 0
                                plant2DArray[i][j].growPlant();

                                //update image to correct plant image; if plant grew, image will be different
                                plantImageView2DArray[i][j].setImage(plant2DArray[i][j].getPlantImage());

                                //updates harvest totals for each plant
                                bellPepperTotalLabel.setText("Bell Pepper: " + BellPepper.bellPepperHarvestCount);
                                eggplantTotalLabel.setText("Eggplant: " + Eggplant.eggplantHarvestCount);
                                onionTotalLabel.setText("Onion: " + Onion.onionHarvestCount);
                                tomatoTotalLabel.setText("Tomato: " + Tomato.tomatoHarvestCount);
                                zucchiniTotalLabel.setText("Zucchini: " + Zucchini.zucchiniHarvestCount);
                            }
                        }
                    }
                }
                //Sets the time label to the current hour number, adds extra 0 digit if hour < 10 for consistency
                if (hourCounter < 10)
                    timeLabel.setText("Time: 0" + hourCounter + ":00");
                else
                    timeLabel.setText("Time: " + hourCounter + ":00");

                //Sets the day label to the current day number
                dayLabel.setText("Day: " + dayCounter);

                //updateImages();
            }
        }));
        //enables Timeline to play forever until the application is exited
        worldTimeline.setCycleCount(Integer.MAX_VALUE);

        //Timeline begins
        worldTimeline.play();
    }

    //event when the play/pause button is clicked
    public void playPauseButtonClicked(){
        //if button is in play state, change to pause state (pause timeline, change button text to play)
        if (playPauseButton.getText().equalsIgnoreCase("pause")) {
            Logkeeping.addLog("Simulation paused.");
            worldTimeline.pause();
            timesSpeedSlider.setDisable(true);
            playPauseButton.setText("Play");
        }
        //if button is in pause state, change to play state (play timeline, change button text to pause)
        else if (playPauseButton.getText().equalsIgnoreCase("play")) {
            Logkeeping.addLog("Simulation resumed.");
            worldTimeline.play();
            timesSpeedSlider.setDisable(false);
            playPauseButton.setText("Pause");
        }
    }

    //event to update the label displaying the simulation speed when the slider changing the value changes
    //sets the time step of the timeline upon the value changing
    public void timesSpeedChanged() {
        Logkeeping.addLog("Simulation speed changed to " + (int)timesSpeedSlider.getValue() + ".");
        timesSpeedLabel.setText("Simulation Speed: " + (int)timesSpeedSlider.getValue());
        worldTimeline.setRate(timesSpeedSlider.getValue());
    }

    //Runs the Watering System turn on sequence
    public void turnSprinklersOn() {
        WateringSystem.turnSprinklersOn();
    }

    //Runs the Watering System turn off sequence
    public void turnSprinklersOff() {
        WateringSystem.turnSprinklersOff();
    }

    //Runs the Heating System turn on sequence
    public void turnHeatingOn() {
        PestController.generatePests();
        HeatingSystem.turnHeatingOn();
    }

    //Runs the Heating System turn off sequence
    public void turnHeatingOff() {
        PestController.killPests();
        HeatingSystem.turnHeatingOff();
    }

    //Gets the current plant/sprinkler images and updates the imageview elements
    public void updateImages() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(plant2DArray[i][j] != null) {
                    Image plantImage = plant2DArray[i][j].getPlantImage();
                    plantImageView2DArray[i][j].setImage(plantImage);
                }
                if (sprinkler2DArray[i][j] != null) {
                    Image sprinklerImage = sprinkler2DArray[i][j].getSprinklerImage();
                    plantImageView2DArray[i][j].setImage(sprinklerImage);
                }
            }
        }
    }

    //unused function - gets all menubutton elements in ArrayList
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