package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LogOutSceneController {
    @FXML
    private AnchorPane scenePane;
    private Button logOutButton;
    Stage stage;
    public void logOut(ActionEvent e) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("logOut");
        alert.setHeaderText("Are you Sure");
        alert.setContentText("Do u want to save before exit");
        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("Logged Out");
            stage.close();
        }
    }


}
