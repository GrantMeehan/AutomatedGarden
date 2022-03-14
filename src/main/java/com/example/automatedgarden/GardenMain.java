package com.example.automatedgarden;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;
import java.time.LocalDateTime;

public class GardenMain extends Application {

    public static LocalDateTime startTime;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GardenMain.class.getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        startTime = LocalDateTime.now();
        launch();

        Runtime.getRuntime().addShutdownHook(new Thread(Logkeeping::compileLogs));
    }


}