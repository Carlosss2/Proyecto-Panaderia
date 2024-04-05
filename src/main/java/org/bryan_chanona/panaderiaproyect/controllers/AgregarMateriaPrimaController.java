package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.MateriaPrima;
import org.bryan_chanona.panaderiaproyect.models.Pan;

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
                Integer cantidad = Integer.parseInt(cantidadAgregar.getText());

                MateriaPrima primaExistente=null;

                for (MateriaPrima producto : App.getPan().getMaterial()) {
                        if (producto.getNombrePan().equals(tipoSeleccionado)) {
                                primaExistente = producto;
                                break;
                        }
                }

                if (primaExistente != null) {
                        primaExistente.setCantidadProducto(primaExistente.getCantidadProducto() + cantidad);
                } else {
                        MateriaPrima nuevaMateria = new MateriaPrima(tipoSeleccionado, cantidad,Double.parseDouble(ingreseGastos.getText()) , "Polvo-Liquido");
                        App.getPan().addMateriaPrima(nuevaMateria);
                }

        }

        @FXML
        void salirBoton(MouseEvent event) {

        }

        @FXML
        void initialize() {
         tipoMateriaComboBox.getItems().addAll("Harina","Levadura","Azucar","Mantequilla","Vainilla","Ajonjoli","Leche");
        }

}
