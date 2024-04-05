package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
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
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField cantidadProductos;

    @FXML
    private ComboBox<String> venderPanes;

    Double totalVenta;
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
                        //
                        totalVenta=total;
                    }else{
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText("No hay panes suficientes, cuenta con: "+ producto.getCantidadProducto());
                    alert.showAndWait();
                    }
                } else  {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText("No hay panes disponibles de este tipo.");
                    alert.showAndWait();
                }
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("La lista de productos está vacía.");
            alert.showAndWait();
        }

    }

    @FXML
    void onMouseClickCancelarButton(MouseEvent event) {
        Stage stage = (Stage) precioTotal.getScene().getWindow();
        // Cerrar la ventana (escenario)
        stage.close();
    }

    @FXML
    void onMouseClickVenderButton(MouseEvent event) {
        Panaderia listaPanes = App.getPan();
        Integer cantidad = Integer.parseInt(cantidadProductos.getText());
        if (!listaPanes.getPanes().isEmpty()) {
            // Crear una lista auxiliar para almacenar los productos a eliminar
            List<Producto> productosAEliminar = new ArrayList<>();

            for (Producto producto : listaPanes.getPanes()) {
                if (venderPanes.getValue().equals(producto.getNombrePan()) && cantidad > 0) {
                    if (producto.getCantidadProducto() >= cantidad) {
                        producto.setCantidadProducto(producto.getCantidadProducto() - cantidad);
                        // Verificar si la cantidad restante es cero para marcar el producto para eliminación
                        if (producto.getCantidadProducto() == 0) {
                            productosAEliminar.add(producto);
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setHeaderText(null);
                            alert.setContentText("¡Producto vendido correctamente!. Ya no quedan mas panes de este tipo disponibles.");
                            alert.showAndWait();
                            break;

                        }
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText(null);
                        alert.setContentText("¡Productos vendidos con exito!");
                        alert.showAndWait();
                        //
                        Venta venta =new Venta(String.valueOf(venderPanes.getValue()),cantidad,totalVenta);
                        App.getPan().registroVenta(venta);
                    } else{
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText(null);
                        alert.setContentText("No hay panes suficientes, cuenta con: "+ producto.getCantidadProducto());
                        alert.showAndWait();

                    }
                } else  {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText("No hay panes disponibles de este tipo.");
                    alert.showAndWait();
                }
            }
            // Eliminar los productos marcados para eliminación de la lista principal
            listaPanes.getPanes().removeAll(productosAEliminar);
        } else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Aun no hay panes disponibles.");
            alert.showAndWait();

        }
    }
    @FXML
    void initialize() {
        venderPanes.getItems().addAll("Yema", "Chorizo", "Micropan", "Bienmesabe",
                "Rosquilla simple", "Rosquilla matizada", "Bolillo", "Zisote", "Higo", "Maleta", "Cazueleja", "Empanada");
    }
}

