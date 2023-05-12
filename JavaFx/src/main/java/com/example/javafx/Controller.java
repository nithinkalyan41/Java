package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;


public class Controller {
    @FXML
    private Circle MyCircle;
    private double x;
    private double y;
    public void up(ActionEvent e){
        //System.out.println("UP");
        MyCircle.setCenterY(y-=10);
    }
    public void down(ActionEvent e){
        //System.out.println("DOWN");
        MyCircle.setCenterY(y+=10);
    }
    public void left(ActionEvent e){
       // System.out.println("LEFT");
        MyCircle.setCenterX(x-=10);
    }
    public void right(ActionEvent e){
        //System.out.println("RIGHT");
        MyCircle.setCenterX(x+=10);
    }
}
