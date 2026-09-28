package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.model.Model;

public class FXMLStudentsSceneController {

    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    @FXML
    private Label seasonsLabel;

    @FXML
    void handleButtonPressed(ActionEvent event) {
        if (seasonsLabel.getText().equals("Winter"))
            seasonsLabel.setText("Summer");
        else
            seasonsLabel.setText("Winter");
    }
}
