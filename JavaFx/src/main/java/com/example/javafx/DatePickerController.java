package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePickerController {
    @FXML
    private DatePicker myDate;
    @FXML
    private Label myLabel;
    public void getDate(ActionEvent e){
        LocalDate Date = myDate.getValue();
        String myFormatDate =Date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        myLabel.setText(myFormatDate);
    }




}
