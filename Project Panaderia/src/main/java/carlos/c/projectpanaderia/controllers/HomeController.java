package carlos.c.projectpanaderia.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AccederButton;

    @FXML
    void OnMouseClickedAccederButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert AccederButton != null : "fx:id=\"AccederButton\" was not injected: check your FXML file 'home-view.fxml'.";

    }

}
