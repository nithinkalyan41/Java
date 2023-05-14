package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Slider extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Slider.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Temperature");
        stage.show();
    }
}
