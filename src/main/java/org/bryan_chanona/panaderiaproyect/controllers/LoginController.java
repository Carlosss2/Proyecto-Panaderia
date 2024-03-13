package org.bryan_chanona.panaderiaproyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoginController {
    String Holabb;
    String CarlosGayXD;

    @FXML
    private Label welcomeText;

    @FXML
    private Label velcometa;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}