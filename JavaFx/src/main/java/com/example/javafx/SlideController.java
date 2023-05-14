package com.example.javafx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class SlideController implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private Slider Slider;
    int temp;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            Slider.valueProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                    temp = (int) Slider.getValue();
                    myLabel.setText(Integer.toString(temp)+"C");
                }
            });
    }
}
