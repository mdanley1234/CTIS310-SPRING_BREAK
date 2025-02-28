package edu.guilford;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

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

        this.add(emailAddyField, 0, 0);
        this.add(firstNameField, 0, 1);
        this.add(lastNameField, 0, 2);
        this.add(submitButton, 1, 0);
        this.add(formattedNameLabel, 1, 1);


    }
    
    
}
