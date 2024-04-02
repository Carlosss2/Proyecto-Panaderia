package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Pan;
import org.bryan_chanona.panaderiaproyect.models.Panaderia;
import org.bryan_chanona.panaderiaproyect.models.Producto;


public class InventarioProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Producto, Integer> mostrarCantidad;

    @FXML
    private TableColumn<Producto, Double> mostrarPrecio;

    @FXML
    private TableColumn<Producto, String> mostrarProduct;
    private TableView<Pan> tablaInventario;
    @FXML
    void verBoton(MouseEvent event) {



    }

    @FXML
    void initialize() {
        mostrarProduct.setCellValueFactory(new PropertyValueFactory<>("nameProduct"));
        mostrarPrecio.setCellValueFactory(new PropertyValueFactory<>("cantidadProduct"));
        mostrarCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidadProducto"));

    }

}
