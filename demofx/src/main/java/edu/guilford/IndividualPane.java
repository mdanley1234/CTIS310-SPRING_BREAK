package edu.guilford;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

// Container for UI elements
// GridPane is a "layout manager" that uses a grid
public class IndividualPane extends GridPane {
    private TextField firstNameField;
    private TextField lastNameField;
    private TextField emailAddyField;
    private Button submitButton;
    private Label formattedNameLabel;

    // Without super constructor
    public IndividualPane(TextField firstNameField, TextField lastNameField, TextField emailAddyField,
            Button submitButton, Label formattedNameLabel) {
        this.firstNameField = firstNameField;
        this.lastNameField = lastNameField;
        this.emailAddyField = emailAddyField;
        this.submitButton = submitButton;
        this.formattedNameLabel = formattedNameLabel;
    }

    // With super constructor
    public IndividualPane(double hgap, double vgap, TextField firstNameField, TextField lastNameField,
            TextField emailAddyField, Button submitButton, Label formattedNameLabel) {
        super(hgap, vgap);
        this.firstNameField = firstNameField;
        this.lastNameField = lastNameField;
        this.emailAddyField = emailAddyField;
        this.submitButton = submitButton;
        this.formattedNameLabel = formattedNameLabel;
    }

    // Another constructor
    public IndividualPane() {
        firstNameField = new TextField();
        lastNameField = new TextField();
        emailAddyField = new TextField();
        submitButton = new Button();
        formattedNameLabel = new Label();

        firstNameField.setFont(new Font("Arial", 24));

        // this.add(emailAddyField, 0, 0,5,1);
        // this.add(firstNameField, 0, 5);
        this.add(lastNameField, 0, 2);
        this.add(submitButton, 2, 0);
        this.add(formattedNameLabel, 1, 1);

        submitButton.setOnAction(e -> {
            formattedNameLabel.setText(firstNameField.getText() + " " + lastNameField.getText());
        });

        // submitButton.setOnAction(this::handle);

        String avatar = this.getClass().getResource("bluh.png").getFile();
        File theAvatar = new File(avatar);
        Image image = new Image(theAvatar.toURI().toString());
        ImageView imageView = new ImageView(image);
        this.add(imageView, 0, 3);
    }

    public void handle(ActionEvent event) {
        formattedNameLabel.setText(firstNameField.getText() + " " + lastNameField.getText());
    }
    
    
}
