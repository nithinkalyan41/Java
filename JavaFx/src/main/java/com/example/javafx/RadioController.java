package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class RadioController {
        @FXML
        private Label myLabel;
        @FXML
        private RadioButton rButton1;
        @FXML
        private RadioButton rButton2;
        @FXML
        private RadioButton rButton3;
        public void getFood(ActionEvent e){
            if(rButton1.isSelected()){
                myLabel.setText("PIZZA");
            }
            else if(rButton2.isSelected()){
                myLabel.setText("BURGIR");
            }
            else{
                myLabel.setText("SANDWICH");
            }
        }
}
