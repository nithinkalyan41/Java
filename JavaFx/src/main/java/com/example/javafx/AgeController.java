package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AgeController {
    @FXML
    TextField myTextField;
    @FXML
    Label myLabel;
    @FXML
    Button myButton;

    int age;
    public void submit(ActionEvent event){
            try{
                age = Integer.parseInt(myTextField.getText());
                if(age>=18){
                    myLabel.setText("You're signed in");
                }
                else{
                    myLabel.setText("You're Not eligible");
                }
            }
            catch(NumberFormatException e){
                myLabel.setText("ENTER ONLY NUMBER PLEASE!!!");
            }
            catch(Exception e){
                myLabel.setText("ERROR");
            }
    }

}
