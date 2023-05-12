package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Scenes extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
                Group root = new Group();
                Scene scene = new Scene(root, Color.rgb(100,52,255));
                Text text = new Text("HELLO");
                text.setX(0);
                text.setY(100);
                text.setFont(Font.font("verdana",50));
                text.setFill(Color.rgb(50,250,50));

                Line line = new Line();
                line.setStartX(200);
                line.setStartY(200);
                line.setEndX(400);
                line.setEndY(200);
                line.setStrokeWidth(5);
                line.setStroke(Color.RED);
                line.setOpacity(0.5);
                line.setRotate(45);

                Rectangle rectangle = new Rectangle();
                rectangle.setX(150);
                rectangle.setY(150);
                rectangle.setWidth(100);
                rectangle.setHeight(100);
                rectangle.setFill(Color.WHITESMOKE);
                rectangle.setStrokeWidth(2);
                rectangle.setStroke(Color.GRAY);

                Polygon triangle = new Polygon();
                triangle.getPoints().setAll(200.0,200.0, 300.0,300.0,200.0,300.0);
                triangle.setLayoutX(100);
                triangle.setLayoutY(100);
                triangle.setFill(Color.TOMATO);

                Circle circle = new Circle();
                circle.setCenterX(50);
                circle.setCenterY(400);
                circle.setRadius(50);
                circle.setFill(Color.ORANGE);

                Image image = new Image("file:src/Images/image.png");
                ImageView imageView = new ImageView(image);
                imageView.setX(60);
                imageView.setY(200);
                imageView.setFitWidth(200);
                imageView.setFitHeight(200);



                root.getChildren().add(text);
                root.getChildren().add(line);
                root.getChildren().add(rectangle);
                root.getChildren().add(triangle);
                root.getChildren().add(circle);
                root.getChildren().add(imageView);

                stage.setX(100);
                stage.setY(100);
                stage.setWidth(500);
                stage.setHeight(500);
                stage.setResizable(false);
                stage.setScene(scene);
                stage.show();
    }
}
