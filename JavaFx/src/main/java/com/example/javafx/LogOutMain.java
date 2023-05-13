package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class LogOutMain extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LogOut.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(e -> {
            e.consume();
            logOut(stage);
        });
    }
    public void logOut(Stage e) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("logOut");
        alert.setHeaderText("Are you Sure");
        alert.setContentText("Do u want to save before exit");
        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("Logged Out");
        }
    }
}
