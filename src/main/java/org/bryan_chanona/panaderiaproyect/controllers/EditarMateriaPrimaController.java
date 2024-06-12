package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Panaderia;
import org.bryan_chanona.panaderiaproyect.models.Producto;

public class EditarMateriaPrimaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Producto, Integer> MostrarCantidad;

    @FXML
    private TextField cantidadMateria;

    @FXML
    private TableView<Producto> materiaPrimaTable;

    @FXML
    private TableColumn<Producto, String> mostrarName;

    @FXML
    private TextField nombreMateria;

    @FXML
    void botonActualizar(MouseEvent event) {
        String nombrePan = nombreMateria.getText();
        String cantidadTexto = cantidadMateria.getText();

        // Verificar si alguno de los campos está vacío
        if (nombrePan.isEmpty() || cantidadTexto.isEmpty()) {
            showAlert("Por favor complete todos los campos.");
            return; // Salir del método si hay campos vacíos
        }

        try {
            Integer nuevaCantidad = Integer.parseInt(cantidadTexto);
            Panaderia lista = App.getInventario();
            boolean productoEncontrado = false;

            if (!lista.getListaMateriaPrima().isEmpty()) {
                for (Producto producto : lista.getListaMateriaPrima()) {
                    if (nombrePan.equals(producto.getNombrePan())) {
                        producto.setCantidadProducto(nuevaCantidad);
                        productoEncontrado = true;
                        break;
                    }
                }
                if (productoEncontrado) {
                    // Actualizar el TableView después de modificar el producto
                    materiaPrimaTable.getItems().setAll(lista.getListaMateriaPrima());
                    showAlert("¡Producto actualizado exitosamente!");
                    limpiar();
                } else {
                    showAlert("No se encontró el producto con el nombre especificado.");
                    limpiar();
                }
            } else {
                showAlert("La lista de productos está vacía.");
                limpiar();
            }
        } catch (NumberFormatException e) {
            showAlert("Por favor ingrese una cantidad válida (número entero).");
            limpiar();
        }
    }
    @FXML
    void botonVer(MouseEvent event) {
        Panaderia materiaPrima = App.getInventario();
        if (!materiaPrima.getListaMateriaPrima().isEmpty()) {
            materiaPrimaTable.getItems().setAll(materiaPrima.getListaMateriaPrima());
        } else {
            showAlert("La lista de materia prima está vacía.");
        }
    }
    @FXML
    void initialize() {
        mostrarName.setCellValueFactory(cellData -> cellData.getValue().getNombrePanProperty());
        MostrarCantidad.setCellValueFactory(cellData -> cellData.getValue().getCantidadProductoProperty().asObject());
    }
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private void limpiar(){
       cantidadMateria.clear();
       nombreMateria.clear();
    }
}
