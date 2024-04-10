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
import org.bryan_chanona.panaderiaproyect.models.Pan;


public class AgregarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField cantidadAagregar;

    @FXML
    private ComboBox<String> tipoPanesComboBox;

    @FXML
    void agregarProducto(MouseEvent event) {
        String tipoSeleccionado = tipoPanesComboBox.getValue();
       String texto = cantidadAagregar.getText();

        Pan productoExistente = null;
        for (Pan producto : App.getPan().getPanes()) {
            if (producto.getNombrePan().equals(tipoSeleccionado)) {
                productoExistente = producto;
                break;
            }
        }

        if (productoExistente != null) {
            if(!texto.isEmpty()){
                Integer cantidad = Integer.parseInt(cantidadAagregar.getText());
                productoExistente.setCantidadProducto(productoExistente.getCantidadProducto() + cantidad);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("¡Cantidad de panes agregado con exito!");
                alert.showAndWait();
                cantidadAagregar.clear();
            } else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("Rellene los campos correctamente");
                alert.showAndWait();

            }
        } else {
            if (!texto.isEmpty()){
                Integer cantidad = Integer.parseInt(cantidadAagregar.getText());
                Pan nuevoPan = new Pan(tipoSeleccionado, cantidad, 1.00, "Mediano", "Dulce");
                App.getPan().addPan(nuevoPan);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("¡Producto agregado exitosamente!");
                alert.showAndWait();
                cantidadAagregar.clear();

            } else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("Rellene los campos correctamente");
                alert.showAndWait();

            }

        }
        
    }

    @FXML
    void salirBoton(MouseEvent event) {
        Stage stage = (Stage) tipoPanesComboBox.getScene().getWindow();
        // Cerrar la ventana (escenario)
        stage.close();

    }

    
@FXML
    void initialize() {
        tipoPanesComboBox.getItems().addAll("Yema","Chorizo","Micropan","Bienmesabe","Rosquilla simple"
        ,"Rosquilla matizada","Bolillo","Zisote","Higo","Maleta","Cazueleja","Empanada");
    }

}
