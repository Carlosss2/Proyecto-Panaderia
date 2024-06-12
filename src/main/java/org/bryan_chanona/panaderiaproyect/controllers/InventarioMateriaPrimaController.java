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

public class InventarioMateriaPrimaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Producto, Integer> cantidadMateria;

    @FXML
    private TableView<Producto> dataTableMateria;

    @FXML
    private TableColumn<Producto, String> nameMateria;

    @FXML
    void onMouseClickVerButton(MouseEvent event) {

        System.out.println();
        Panaderia pancito = App.getInventario();
        if (!pancito.getListaMateriaPrima().isEmpty()) {
            dataTableMateria.getItems().addAll(pancito.getListaMateriaPrima());
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("La lista de materia prima está vacia");
            alert.showAndWait();
        }

    }
    @FXML
    void onMouseClickSalirButton(MouseEvent event) {
   Stage stage = (Stage) dataTableMateria.getScene().getWindow();
   stage.close();
    }

    @FXML
    void initialize() {
        nameMateria.setCellValueFactory(cellData -> cellData.getValue().getNombrePanProperty());
        cantidadMateria.setCellValueFactory(cellData ->cellData.getValue().getCantidadProductoProperty().asObject());
    }

}
