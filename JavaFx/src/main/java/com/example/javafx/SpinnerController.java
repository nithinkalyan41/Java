package com.example.javafx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class SpinnerController implements Initializable {
    @FXML
    Spinner<Integer> mySpinner;
    @FXML
    Label myLabel;
    int currentValue;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory value = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,20);
        value.setValue(0);
        mySpinner.setValueFactory(value);
        currentValue=mySpinner.getValue();
        myLabel.setText(Integer.toString(currentValue));
        mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                currentValue=mySpinner.getValue();
                myLabel.setText(Integer.toString(currentValue));
            }
        });
    }

}
