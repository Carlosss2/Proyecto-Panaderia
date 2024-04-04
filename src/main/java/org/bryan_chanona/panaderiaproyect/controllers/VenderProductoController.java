package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Panaderia;
import org.bryan_chanona.panaderiaproyect.models.Producto;

public class VenderProductoController {
    @FXML
    private Label precioTotal;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField cantidadProductos;

    @FXML
    private ComboBox<String> venderPanes;
    @FXML
    void onMouseClickListoButton(MouseEvent event) {
        Panaderia listaPanes = App.getPan();
        Double cantidad = Double.parseDouble(cantidadProductos.getText());
        if (!listaPanes.getPanes().isEmpty()) {
            for (Producto producto : listaPanes.getPanes()) {
                if (venderPanes.getValue().equals(producto.getNombrePan()) && cantidad > 0) {
                    if (producto.getCantidadProducto() >= cantidad) {
                        Double precio = producto.getPrecioProducto();
                        Double total = precio * cantidad;
                        precioTotal.setText(String.valueOf(total) + " pesos");
                    }
                }
            }
        }

    }

    @FXML
    void onMouseClickCancelarButton(MouseEvent event) {
    }

    @FXML
    void onMouseClickVenderButton(MouseEvent event) {
        Panaderia listaPanes = App.getPan();
        Integer cantidad = Integer.parseInt(cantidadProductos.getText());
        if (!listaPanes.getPanes().isEmpty()) {
            for (Producto producto : listaPanes.getPanes()) {
                if (venderPanes.getValue().equals(producto.getNombrePan()) && cantidad > 0) {
                    if (producto.getCantidadProducto() >= cantidad) {
                        producto.setCantidadProducto(producto.getCantidadProducto()-cantidad);
                    }

                }
            }
        }


    }


    @FXML
    void initialize() {
        venderPanes.getItems().addAll("Yema", "Chorizo", "Micropan", "Bienmesabe",
                "Rosquilla simple", "Rosquilla matizada", "Bolillo", "Zisote", "Higo", "Maleta", "Cazueleja", "Empanada");
    }
}

