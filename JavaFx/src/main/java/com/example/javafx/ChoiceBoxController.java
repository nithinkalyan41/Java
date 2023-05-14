package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ChoiceBoxController implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox<String> myChoice;
    private String[] items = {"Pizza","Burgir","Sandwich"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoice.getItems().addAll(items);
        myChoice.setOnAction(this::getFood);

    }
    public void getFood(ActionEvent e){
        String myFood = myChoice.getValue();
        myLabel.setText(myFood);
    }
}
