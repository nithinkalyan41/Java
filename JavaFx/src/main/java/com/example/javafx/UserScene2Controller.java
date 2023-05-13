package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UserScene2Controller {
    @FXML
    Label nameLabel;
    public void display(String username){
                nameLabel.setText("HELLO:"+username);
    }

}
