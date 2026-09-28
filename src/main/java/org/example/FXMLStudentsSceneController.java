package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLStudentsSceneController {

    @FXML
    private Label seasonsLabel;

    @FXML
    void handleButtonPressed(ActionEvent event) {
        System.out.println("It works!!!");
    }
}
