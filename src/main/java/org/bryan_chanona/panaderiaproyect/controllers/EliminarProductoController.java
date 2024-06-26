package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Panaderia;
import org.bryan_chanona.panaderiaproyect.models.Producto;

public class EliminarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField cantidadAeliminar;

    @FXML
    private Button salirBoton;

    @FXML
    private ComboBox<String> tipoMateriaComboBox;

    @FXML
    void botonEliminar(MouseEvent event) {
        Panaderia listaPanes = App.getPan();
        Integer cantidad = Integer.parseInt(cantidadAeliminar.getText());
        if (!listaPanes.getPanes().isEmpty()) {

            List<Producto> productosAEliminar = new ArrayList<>();

            for (Producto producto : listaPanes.getPanes()) {
                if (tipoMateriaComboBox.getValue().equals(producto.getNombrePan()) && cantidad > 0) {
                    if (producto.getCantidadProducto() >= cantidad) {
                        producto.setCantidadProducto(producto.getCantidadProducto() - cantidad);


                        if (producto.getCantidadProducto() == 0) {
                            productosAEliminar.add(producto);
                        }
                    }
                }
            }

            listaPanes.getPanes().removeAll(productosAEliminar);
        }

    }

    @FXML
    void salirBoton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        tipoMateriaComboBox.getItems().addAll("Yema","Chorizo","Micropan","Bienmesabe","Rosquilla simple"
                ,"Rosquilla matizada","Bolillo","Zisote","Higo","Maleta","Cazueleja","Empanada");
    }

}
