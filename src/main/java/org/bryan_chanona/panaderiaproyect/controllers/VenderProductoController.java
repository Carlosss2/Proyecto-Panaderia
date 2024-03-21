package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VenderProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button YEMA;

    @FXML
    void initialize() {
        assert YEMA != null : "fx:id=\"YEMA\" was not injected: check your FXML file 'venderProducto-view.fxml'.";

    }

}
