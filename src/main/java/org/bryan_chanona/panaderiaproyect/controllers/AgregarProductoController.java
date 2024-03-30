package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AgregarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField cantidadAagregar;

    @FXML
    private TextField namePan;

    @FXML
    void agregarProducto(MouseEvent event) {

    }

    @FXML
    void salirBoton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert cantidadAagregar != null : "fx:id=\"cantidadAagregar\" was not injected: check your FXML file 'agregarProducto-view.fxml'.";
        assert namePan != null : "fx:id=\"namePan\" was not injected: check your FXML file 'agregarProducto-view.fxml'.";

    }

}
