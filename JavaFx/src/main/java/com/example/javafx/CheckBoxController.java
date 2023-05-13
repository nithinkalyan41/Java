package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.CheckBox;

public class CheckBoxController {
        @FXML
        private ImageView myImageView;
        @FXML
        private Label yes;
        @FXML
        private CheckBox myCheckBox;
        Image image = new  Image((getClass().getResourceAsStream("image1.png")));
        Image image2 = new Image((getClass().getResourceAsStream("image2.png")));

        public void change(ActionEvent e){

            if (myCheckBox.isSelected()) {
                myImageView.setImage(image2);
                yes.setText("yes");
            }
            else{
                yes.setText("no");
                myImageView.setImage(image);
            }


        }



}
