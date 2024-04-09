package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.panaderiaproyect.App;
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
    private TableColumn<Producto, Integer> cantidadPanes;

    @FXML
    private TableColumn<Producto, String> nombrePanes;

    @FXML
    private TableColumn<Producto, Double> precioPanes;

    @FXML
    private Button actualizarButon;

    @FXML
    private Button verButton;

    @FXML
    private TextField actualizarCantidadPanes;

    @FXML
    private TextField actualizarNombre;

    @FXML
    private TextField actualizarPrecio;

    @FXML
    void onMouseClickActualizarButton(MouseEvent event) {
        String nuevaCantidad = actualizarCantidadPanes.getText();
        String nuevoPrecio = actualizarPrecio.getText();
        String nombrePan = actualizarNombre.getText();
        Panaderia lista = App.getPan();
        if (nuevaCantidad.isEmpty() || nuevoPrecio.isEmpty() || nombrePan.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Rellene los campos correctamente.");
            alert.showAndWait();
        } else {
            if (!lista.getPanes().isEmpty()) {
                boolean productoEncontrado = false;
                for (Producto producto : lista.getPanes()) {
                    if (nombrePan.equals(producto.getNombrePan())) {
                        Integer cantidadNueva = Integer.parseInt(actualizarCantidadPanes.getText());
                        Double precio = Double.parseDouble(actualizarPrecio.getText());
                        producto.setCantidadProducto(cantidadNueva);
                        producto.setPrecioProducto(precio);
                        productoEncontrado = true;
                        actualizarNombre.clear();
                        actualizarCantidadPanes.clear();
                        actualizarPrecio.clear();
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText(null);
                        alert.setContentText("¡Producto actualizado correctamente!.");
                        alert.showAndWait();
                        break; // Salir del bucle una vez que se actualice el producto
                    } else {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText(null);
                        alert.setContentText("Este tipo de pan aun no se encuentra disponible, por lo tanto, no se puede actualizar.");
                        alert.showAndWait();

                    }
                }
                if (productoEncontrado) {
                    // Limpiar la tabla y agregar de nuevo los productos actualizados
                    dataTable.getItems().clear(); // Limpiar la tabla antes de volver a agregar los productos
                    dataTable.getItems().addAll(lista.getPanes()); // Agregar los productos actualizados
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("No se ha podido actualizar, la lista se encuentra vacia.");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void onMouseClickVerButton(MouseEvent event) {
            Panaderia pancito = App.getPan();
            if (!pancito.getPanes().isEmpty()) {
                dataTable.getItems().clear(); // Limpiar la tabla antes de agregar los productos
                dataTable.getItems().addAll(pancito.getPanes()); // Agregar los productos a la tabla
            }
            else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("La lista se encuentra vacia.");
                alert.showAndWait();

            }
    }

    @FXML
    void initialize() {
        nombrePanes.setCellValueFactory(cellData -> cellData.getValue().getNombrePanProperty());
        cantidadPanes.setCellValueFactory(cellData-> cellData.getValue().getCantidadProductoProperty().asObject());
        precioPanes.setCellValueFactory(cellData -> cellData.getValue().getPrecioProductoProperty().asObject());
    }
}
