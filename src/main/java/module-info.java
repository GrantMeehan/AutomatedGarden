module com.example.automatedgarden {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.automatedgarden to javafx.fxml;
    exports com.example.automatedgarden;
}