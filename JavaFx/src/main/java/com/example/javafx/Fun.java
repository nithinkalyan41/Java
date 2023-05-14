package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Fun extends Application {
    @Override
    public void start(Stage stage) throws Exception {
            Group root = new Group();
             Label label = new Label();
             label.setText("HELLO");
             root.getChildren().add(label);
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.setWidth(500);
            stage.setHeight(500);

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
