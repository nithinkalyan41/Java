package com.example.javafx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class keys extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("keys.fxml"));
        Parent root = loader.load();

        KeyController controller = loader.getController();
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch(keyEvent.getCode()){
                    case UP:
                        controller.MoveUp();
                        break;
                    case DOWN:
                        controller.MoveDown();
                        break;
                    case LEFT:
                        controller.MoveLeft();
                        break;
                    case RIGHT:
                        controller.MoveRight();
                        break;
                    default:
                        break;
                }
            }
        });
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
