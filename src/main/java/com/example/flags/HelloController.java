package com.example.flags;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class HelloController {

    @FXML
    private Rectangle rectangleA;

    @FXML
    private Rectangle rectangleB;

    @FXML
    private Rectangle rectangleC;

    //method that removes the displayed flags
    @FXML
    void ClearStage(ActionEvent event) {
        rectangleA.setFill(null);
        rectangleB.setFill(null);
        rectangleC.setFill(null);
    }

    //method that displays Lesotho flag
    @FXML
    void LesothoFlag(ActionEvent event) {
        rectangleA.setFill(Color.BLUE);
        rectangleB.setFill(Color.WHITE);
        rectangleC.setFill(Color.GREEN);
    }
    //method that displays Yemen flag
    @FXML
    void YemenFlag(ActionEvent event) {
        rectangleA.setFill(Color.RED);
        rectangleB.setFill(Color.WHITE);
        rectangleC.setFill(Color.BLACK);
    }
    //method that displays Germany flag
    @FXML
    void GermanyFlag(ActionEvent event) {
        rectangleA.setFill(Color.BLACK);
        rectangleB.setFill(Color.RED);
        rectangleC.setFill(Color.GOLD);
    }
    //method that displays Hungary Flag
    @FXML
    void HungaryFlag(ActionEvent event) {
        rectangleA.setFill(Color.RED);
        rectangleB.setFill(Color.WHITE);
        rectangleC.setFill(Color.GREEN);
    }
    //method that displays Austria Flag
    @FXML
    void AustriaFlag(ActionEvent event) {
        rectangleA.setFill(Color.RED);
        rectangleB.setFill(Color.WHITE);
        rectangleC.setFill(Color.RED);
    }
}