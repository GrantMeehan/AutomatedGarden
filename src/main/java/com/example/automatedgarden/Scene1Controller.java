package com.example.automatedgarden;

import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.stage.Stage;

public class Scene1Controller{

    public Spinner onionSpinner;
    public Spinner tomatoSpinner;
    public Spinner eggplantSpinner;
    public Spinner zucchiniSpinner;
    public Spinner bellPepperSpinner;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private int maxSpinnerValue = 25;

    public void onSpinnerChange() {
        maxSpinnerValue = maxSpinnerValue - (int)onionSpinner.getValue() - (int)tomatoSpinner.getValue() - (int)eggplantSpinner.getValue() - (int)zucchiniSpinner.getValue() - (int)bellPepperSpinner.getValue();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene2.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}