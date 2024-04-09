package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Panaderia;
import org.bryan_chanona.panaderiaproyect.models.Venta;

public class RegistroVentaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Venta, Integer> cantidadView;

    @FXML
    private TableColumn<Venta, String> productosView;

    @FXML
    private TableView<Venta> tableView;

    @FXML
    private TableColumn<Venta, Double> totalView;

    @FXML
    void botonVer(MouseEvent event) {
        Panaderia venta = App.getPan();
        if (!venta.getVentas().isEmpty()) {
            tableView.getItems().clear();
            tableView.getItems().addAll(venta.getVentas());
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
       productosView.setCellValueFactory(cellData -> cellData.getValue().nameProductProperty());
       cantidadView.setCellValueFactory(cellData -> cellData.getValue().cantidadProductProperty().asObject());
       totalView.setCellValueFactory(cellData -> cellData.getValue().totalProperty().asObject() );
    }

}
