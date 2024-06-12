package org.bryan_chanona.panaderiaproyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Panaderia;
import org.bryan_chanona.panaderiaproyect.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class EliminarProductoController {

    @FXML
    private TextField cantidadAeliminar;

    @FXML
    private ComboBox<String> tipoMateriaComboBox;

    @FXML
    void botonEliminar(MouseEvent event) {
        String tipoPanSeleccionado = tipoMateriaComboBox.getValue();
        String cantidadEliminarStr = cantidadAeliminar.getText().trim();

        // Verificar si los campos están vacíos
        if (tipoPanSeleccionado == null || tipoPanSeleccionado.isEmpty() || cantidadEliminarStr.isEmpty()) {
            showAlert("Rellene los campos correctamente.");
            return;
        }

        // Verificar si la cantidad a eliminar es un número válido
        if (!isNumeric(cantidadEliminarStr)) {
            showAlert("La cantidad debe ser un número entero positivo.");
            return;
        }

        int cantidadEliminar = Integer.parseInt(cantidadEliminarStr);
        if (cantidadEliminar <= 0) {
            showAlert("La cantidad debe ser un número entero positivo.");
            return;
        }

        Panaderia listaPanes = App.getInventario();
        List<Producto> productosAEliminar = new ArrayList<>();
        boolean panEncontrado = false;

        for (Producto producto : listaPanes.getListaProductos()) {
            if (tipoPanSeleccionado.equals(producto.getNombrePan())) {
                panEncontrado = true;
                if (producto.getCantidadProducto() >= cantidadEliminar) {
                    producto.setCantidadProducto(producto.getCantidadProducto() - cantidadEliminar);
                    if (producto.getCantidadProducto() == 0) {
                        productosAEliminar.add(producto);
                    }
                    showAlert("Producto(s) eliminado(s) correctamente.");
                } else {
                    showAlert("No hay suficientes panes disponibles. Cantidad disponible: " + producto.getCantidadProducto());
                }
                break;
            }
        }

        if (!panEncontrado) {
            showAlert("Aún no hay panes de este tipo agregados.");
        }

        // Eliminar los productos marcados para eliminación de la lista principal
        listaPanes.getListaProductos().removeAll(productosAEliminar);
    }

    @FXML
    void salirBoton(MouseEvent event) {
        Stage stage = (Stage) tipoMateriaComboBox.getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        tipoMateriaComboBox.getItems().addAll("Yema", "Chorizo", "Micropan", "Bienmesabe",
                "Rosquilla simple", "Rosquilla matizada", "Bolillo", "Zisote", "Higo", "Maleta", "Cazueleja", "Empanada");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}
