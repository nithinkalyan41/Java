package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Stages extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        Image icon = new Image("file:src/Images/image.png");
        stage.setTitle("FirstOne");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(400);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Don't try to escape unless press 1");
        stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("1"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
