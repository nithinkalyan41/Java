package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.control.ColorPicker;


public class ColorPickerController {
    @FXML
    private ColorPicker myColor;
    @FXML
    private Pane myPane;
    public void change(ActionEvent e){
        Color color = myColor.getValue();
        myPane.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
    }
}
