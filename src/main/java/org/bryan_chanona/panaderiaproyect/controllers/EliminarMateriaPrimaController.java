package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Panaderia;
import org.bryan_chanona.panaderiaproyect.models.Producto;

public class EliminarMateriaPrimaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField cantidadAeliminar;

    @FXML
    private ComboBox<String> tipoMateriaComboBox;

    @FXML
    void bottonEliminar(MouseEvent event) {
        String tipoSeleccionado = tipoMateriaComboBox.getValue();
        String cantidadTexto = cantidadAeliminar.getText();

        // Verificar si algún campo está vacío
        if (tipoSeleccionado == null || cantidadTexto.isEmpty()) {
            showAlert("Por favor complete todos los campos.");
            return; // Salir del método si hay campos vacíos
        }

        try {
            Integer cantidad = Integer.parseInt(cantidadTexto);
            Panaderia lista = App.getPan();

            if (!lista.getMaterial().isEmpty()) {
                List<Producto> productosAEliminar = new ArrayList<>();

                for (Producto producto : lista.getMaterial()) {
                    if (tipoSeleccionado.equals(producto.getNombrePan()) && cantidad > 0) {
                        if (producto.getCantidadProducto() >= cantidad) {
                            producto.setCantidadProducto(producto.getCantidadProducto() - cantidad);
                            if (producto.getCantidadProducto() == 0) {
                                productosAEliminar.add(producto);
                            }
                        } else {
                            showAlert("No cuenta con la cantidad suficiente, cuenta con: "+ producto.getCantidadProducto());
                            limpiar();
                            return;
                        }
                    } else {
                        showAlert("Este tipo de pan aún no está agregado.");
                        limpiar();
                        return;
                    }
                }
                // Eliminar los productos de la lista principal
                lista.getPanes().removeAll(productosAEliminar);
                showAlert("¡Producto eliminado exitosamente!");

            } else {
                showAlert("Aun no hay materia prima para eliminar.");
                limpiar();
            }
        } catch (NumberFormatException e) {
            showAlert("Por favor ingrese una cantidad válida (número entero).");
            limpiar();
        }
    }

    @FXML
    void bottonSalir(MouseEvent event) {
        Stage stage = (Stage) tipoMateriaComboBox.getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        tipoMateriaComboBox.getItems().addAll("Harina", "Levadura", "Azucar", "Mantequilla", "Vainilla", "Ajonjoli", "Leche");

    }


    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void limpiar(){
        cantidadAeliminar.clear();
    }
}
