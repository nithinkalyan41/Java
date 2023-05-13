package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class UserSceneController1 {
    @FXML
    TextField nameTextField;
    private Parent root;
    private Stage stage;
    private Scene scene;

    public void logIn(ActionEvent e) throws IOException {
                String userName = nameTextField.getText();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("UserScene2.fxml"));
                root = loader.load();
                UserScene2Controller scene2Controller = loader.getController();
                scene2Controller.display(userName);
                stage =(Stage)((Node)e.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
    }

}
