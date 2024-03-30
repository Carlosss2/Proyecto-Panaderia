package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EliminarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button botonEliminar;

    @FXML
    private TextField cantidadAeliminar;

    @FXML
    private TextField nombreProducto;

    @FXML
    private Button salirBoton;

    @FXML
    void botonAgregar(MouseEvent event) {

    }

    @FXML
    void salirBoton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert botonEliminar != null : "fx:id=\"botonEliminar\" was not injected: check your FXML file 'eliminarProducto-view.fxml'.";
        assert cantidadAeliminar != null : "fx:id=\"cantidadAeliminar\" was not injected: check your FXML file 'eliminarProducto-view.fxml'.";
        assert nombreProducto != null : "fx:id=\"nombreProducto\" was not injected: check your FXML file 'eliminarProducto-view.fxml'.";
        assert salirBoton != null : "fx:id=\"salirBoton\" was not injected: check your FXML file 'eliminarProducto-view.fxml'.";

    }

}
