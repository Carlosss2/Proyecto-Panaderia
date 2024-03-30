package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AgregarMateriaPrimaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField cantidadAgregar;

    @FXML
    private TextField nameMateriaPrima;

    @FXML
    void agregarBoton(MouseEvent event) {

    }

    @FXML
    void salirBoton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert cantidadAgregar != null : "fx:id=\"cantidadAgregar\" was not injected: check your FXML file 'agregarMateriaPrima-view.fxml'.";
        assert nameMateriaPrima != null : "fx:id=\"nameMateriaPrima\" was not injected: check your FXML file 'agregarMateriaPrima-view.fxml'.";

    }

}
