package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField Passwordtext;

    @FXML
    private Button SingInButton;

    @FXML
    private TextField Ussertext;

    @FXML
    void OnMouseClickedSingInButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert Passwordtext != null : "fx:id=\"Passwordtext\" was not injected: check your FXML file 'login-view.fxml'.";
        assert SingInButton != null : "fx:id=\"SingInButton\" was not injected: check your FXML file 'login-view.fxml'.";
        assert Ussertext != null : "fx:id=\"Ussertext\" was not injected: check your FXML file 'login-view.fxml'.";

    }

}
