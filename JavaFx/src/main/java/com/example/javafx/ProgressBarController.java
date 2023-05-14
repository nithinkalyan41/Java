package com.example.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class ProgressBarController  implements Initializable {
    @FXML
    ProgressBar myBar;
    @FXML
    Label myLabel;
    @FXML
    Button myButton;
    BigDecimal progress = new BigDecimal(String.format("%.2f",0.0));
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            myBar.setStyle("-fx-accent: #00FF00;");
    }
    public void increaseProgress(){
        if(progress.doubleValue() < 1){
            progress = new BigDecimal(String.format("%.2f",progress.doubleValue()+0.1));
            myBar.setProgress(progress.doubleValue());
            myLabel.setText(Integer.toString((int)Math.round(progress.doubleValue()*100))+"%");
        }
    }
}
