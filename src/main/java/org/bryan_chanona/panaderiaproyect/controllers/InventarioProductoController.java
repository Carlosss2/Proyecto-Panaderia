package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.bryan_chanona.panaderiaproyect.App;
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

    @FXML
    private TableView<Producto> tablaInventario;

    @FXML
    void onMouseClickVerButton(MouseEvent event) {
        Panaderia pancito = App.getInventario();
        if (!pancito.getListaProductos().isEmpty()) {
            tablaInventario.getItems().addAll(pancito.getListaProductos());
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("La lista de productos está vacia");
            alert.showAndWait();
        }
    }


    @FXML
    void initialize() {
        mostrarProduct.setCellValueFactory(cellData -> cellData.getValue().getNombrePanProperty());
        mostrarCantidad.setCellValueFactory(cellData -> cellData.getValue().getCantidadProductoProperty().asObject());
        mostrarPrecio.setCellValueFactory(cellData -> cellData.getValue().getPrecioProductoProperty().asObject());


    }

    public void onMouseClickSalirButton(MouseEvent mouseEvent) {
        Stage stage = (Stage) tablaInventario.getScene().getWindow();
        stage.close();
    }
}
