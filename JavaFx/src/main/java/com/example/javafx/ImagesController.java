package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImagesController {
    @FXML
    ImageView myImageView;
    @FXML
    Button myButton;

    public void display(){
        Image image = new Image(getClass().getResourceAsStream("image2.png"));
        myImageView.setImage(image);
    }
}
