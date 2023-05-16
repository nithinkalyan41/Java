package com.example.javafx;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class AnimeController implements Initializable {
    @FXML
    private Shape myShape;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            //Transition
        TranslateTransition transition = new TranslateTransition();
        transition.setNode(myShape);
        transition.setCycleCount(transition.INDEFINITE);
        transition.setByX(200);
        transition.setByY(-100);
        transition.setDuration(Duration.millis(1000));
        transition.setAutoReverse(true);
        transition.play();

        //Rotate

        RotateTransition rotate = new RotateTransition();
        rotate.setNode(myShape);
        rotate.setCycleCount(transition.INDEFINITE);
        rotate.setDuration(Duration.millis(1500));
        rotate.setByAngle(360);
        rotate.setAutoReverse(true);
        rotate.play();

        //Fade
        FadeTransition Fade = new FadeTransition();
        Fade.setNode(myShape);
        Fade.setCycleCount(transition.INDEFINITE);
        Fade.setDuration(Duration.millis(1000));
        Fade.setAutoReverse(true);
        Fade.setInterpolator(Interpolator.LINEAR);
        Fade.setFromValue(0);
        Fade.setByValue(1);
        Fade.play();

        //Scale
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(myShape);
        scale.setCycleCount(transition.INDEFINITE);
        scale.setByX(2);
        scale.setByY(2);
        scale.setDuration(Duration.millis(1000));
        scale.setAutoReverse(true);
        scale.play();
    }
}
