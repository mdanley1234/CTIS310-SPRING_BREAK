package edu.guilford;

import java.io.IOException;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private javafx.scene.control.TextField firstNameBox;

    @FXML
    private javafx.scene.control.TextField lastNameBox;

    @FXML
    private javafx.scene.control.TextField ageBox;

    @FXML
    private javafx.scene.control.TextField countryBox;

    @FXML
    private javafx.scene.control.TextField heightBox;

    @FXML
    private javafx.scene.control.Label headerLabel;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void updateName() throws IOException {
        String firstName = firstNameBox.getText();
        headerLabel.setText("Welcome " + firstName);
    }
}
