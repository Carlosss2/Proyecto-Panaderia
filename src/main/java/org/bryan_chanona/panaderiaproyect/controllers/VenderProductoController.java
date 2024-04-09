package org.bryan_chanona.panaderiaproyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Panaderia;
import org.bryan_chanona.panaderiaproyect.models.Producto;
import org.bryan_chanona.panaderiaproyect.models.Venta;

public class VenderProductoController {

    @FXML
    private Label precioTotal;

    @FXML
    private TextField cantidadProductos;

    @FXML
    private ComboBox<String> venderPanes;

    private Double totalVenta;

    @FXML
    void onMouseClickListoButton(MouseEvent event) {
        String selectedPan = venderPanes.getValue();
        String quantityText = cantidadProductos.getText();

        if (selectedPan == null || selectedPan.isEmpty() || quantityText.isEmpty()) {
            showAlert("Rellene los campos correctamente.");
            return;
        }

        try {
            Double cantidad = Double.parseDouble(quantityText);
            Panaderia listaPanes = App.getPan();

            for (Producto producto : listaPanes.getPanes()) {
                if (selectedPan.equals(producto.getNombrePan())) {
                    if (cantidad > 0 && producto.getCantidadProducto() >= cantidad) {
                        Double precio = producto.getPrecioProducto();
                        Double total = precio * cantidad;
                        precioTotal.setText(String.valueOf(total) + " pesos");
                        totalVenta = total;
                        return; // Salir del método después de encontrar el producto correcto
                    } else {
                        showAlert("No hay suficientes panes disponibles.");
                        return;
                    }
                }
            }

            showAlert("No hay panes disponibles de este tipo.");
        } catch (NumberFormatException e) {
            showAlert("Ingrese una cantidad válida.");
        }
    }

    @FXML
    void onMouseClickCancelarButton(MouseEvent event) {
        Stage stage = (Stage) precioTotal.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onMouseClickVenderButton(MouseEvent event) {
        String selectedPan = venderPanes.getValue();
        String quantityText = cantidadProductos.getText();

        if (selectedPan == null || selectedPan.isEmpty() || quantityText.isEmpty()) {
            showAlert("Rellene los campos correctamente.");
            return;
        }

        try {
            Integer cantidad = Integer.parseInt(quantityText);
            Panaderia listaPanes = App.getPan();

            for (Producto producto : listaPanes.getPanes()) {
                if (selectedPan.equals(producto.getNombrePan()) && cantidad > 0) {
                    if (producto.getCantidadProducto() >= cantidad) {
                        producto.setCantidadProducto(producto.getCantidadProducto() - cantidad);

                        if (producto.getCantidadProducto() == 0) {
                            listaPanes.getPanes().remove(producto);
                            showAlert("¡Producto vendido correctamente! Ya no quedan más panes de este tipo disponibles.");
                        } else {
                            showAlert("¡Productos vendidos con éxito!");
                        }

                        Venta venta = new Venta(selectedPan, cantidad, totalVenta);
                        App.getPan().registroVenta(venta);
                        return; // Salir del método después de procesar la venta
                    } else {
                        showAlert("No hay suficientes panes disponibles.");
                        return;
                    }
                }
            }

            showAlert("No hay panes disponibles de este tipo.");
        } catch (NumberFormatException e) {
            showAlert("Ingrese una cantidad válida.");
        }
    }

    @FXML
    void initialize() {
        venderPanes.getItems().addAll(
                "Yema", "Chorizo", "Micropan", "Bienmesabe",
                "Rosquilla simple", "Rosquilla matizada", "Bolillo",
                "Zisote", "Higo", "Maleta", "Cazueleja", "Empanada"
        );
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
