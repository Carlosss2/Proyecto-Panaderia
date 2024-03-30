package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EliminarMateriaPrimaController {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField cantidadAeliminar;

        @FXML
        private TextField nombreDeMateria;

        @FXML
        void bottonEliminar(MouseEvent event) {

        }

        @FXML
        void bottonSalir(MouseEvent event) {

        }

        @FXML
        void initialize() {
                assert cantidadAeliminar != null : "fx:id=\"cantidadAeliminar\" was not injected: check your FXML file 'eliminarMateriaPrima-view.fxml'.";
                assert nombreDeMateria != null : "fx:id=\"nombreDeMateria\" was not injected: check your FXML file 'eliminarMateriaPrima-view.fxml'.";

        }

}
