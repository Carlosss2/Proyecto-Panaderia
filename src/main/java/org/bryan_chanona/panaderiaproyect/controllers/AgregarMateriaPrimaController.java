package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.MateriaPrima;

public class AgregarMateriaPrimaController {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField cantidadAgregar;

        @FXML
        private ComboBox<String> tipoMateriaComboBox;

        @FXML
        private TextField ingreseGastos;

        @FXML
        void agregarBoton(MouseEvent event) {
                String tipoSeleccionado = tipoMateriaComboBox.getValue();
                String cantidadTexto = cantidadAgregar.getText();
                String gastosTexto = ingreseGastos.getText();

                // Verificar si algún campo está vacío
                if (tipoSeleccionado == null || cantidadTexto.isEmpty() || gastosTexto.isEmpty()) {
                        showAlert("Por favor complete todos los campos.");
                        return; // Salir del método si hay campos vacíos
                }
                // Validar la entrada para cantidad y gastos
                try {
                        Integer cantidad = Integer.parseInt(cantidadTexto);
                        Double gastos = Double.parseDouble(gastosTexto);

                        MateriaPrima primaExistente = null;
                        for (MateriaPrima producto : App.getPan().getMaterial()) {
                                if (producto.getNombrePan().equals(tipoSeleccionado)) {
                                        primaExistente = producto;
                                        break;
                                }
                        }

                        if (primaExistente != null) {
                                primaExistente.setCantidadProducto(primaExistente.getCantidadProducto() + cantidad);
                                showAlert("¡Cantidad de materia prima registrada exitosamente!");
                                limpiar();
                        } else {
                                MateriaPrima nuevaMateria = new MateriaPrima(tipoSeleccionado, cantidad, gastos, "Polvo-Liquido");
                                App.getPan().addMateriaPrima(nuevaMateria);
                                showAlert("¡Materia prima registrada exitosamente!");
                                limpiar();
                        }

                } catch (NumberFormatException e) {
                        showAlert("Por favor ingrese valores numéricos válidos para cantidad y gastos.");
                        limpiar();
                }
        }

        @FXML
        void salirBoton(MouseEvent event) {
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
               cantidadAgregar.clear();
               ingreseGastos.clear();
        }
}
