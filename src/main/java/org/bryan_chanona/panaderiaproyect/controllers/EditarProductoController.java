package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.bryan_chanona.panaderiaproyect.models.Panaderia;
import org.bryan_chanona.panaderiaproyect.models.Producto;

public class EditarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Producto> dataTable;

    @FXML
    private TableColumn<Producto,Integer> cantidadDeProductos;

    @FXML
    private TableColumn<Producto, Integer> precioProductoNuevo;

    @FXML
    private TableColumn<Producto, String> productoNuevo;

    @FXML
    void initialize() {
        cantidadDeProductos.setCellValueFactory(new PropertyValueFactory<>("CantidadProducto"));
        precioProductoNuevo.setCellValueFactory(new PropertyValueFactory<>("PrecioProducto"));
        productoNuevo.setCellValueFactory(new PropertyValueFactory<>("nameProduct"));

    }

}
