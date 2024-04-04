package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Pan;


public class AgregarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField cantidadAagregar;

    @FXML
    private ComboBox<String> tipoPanesComboBox;

    @FXML
    void agregarProducto(MouseEvent event) {
        String tipoSeleccionado = tipoPanesComboBox.getValue();
        Integer cantidad = Integer.parseInt(cantidadAagregar.getText());

        Pan productoExistente = null;
        for (Pan producto : App.getPan().getPanes()) {
            if (producto.getNombrePan().equals(tipoSeleccionado)) {
                productoExistente = producto;
                break;
            }
        }

        if (productoExistente != null) {
            productoExistente.setCantidadProducto(productoExistente.getCantidadProducto() + cantidad);
        } else {
            Pan nuevoPan = new Pan(tipoSeleccionado, cantidad, 1.00, "Mediano", "Dulce");
            App.getPan().addPan(nuevoPan);
        }
        
    }

    @FXML
    void salirBoton(MouseEvent event) {

    }

    
@FXML
    void initialize() {
        tipoPanesComboBox.getItems().addAll("Yema","Chorizo","Micropan","Bienmesabe","Rosquilla simple"
        ,"Rosquilla matizada","Bolillo","Zisote","Higo","Maleta","Cazueleja","Empanada");
    }

}
