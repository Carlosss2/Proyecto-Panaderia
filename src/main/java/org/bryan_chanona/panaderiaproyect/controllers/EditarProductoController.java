package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Panaderia;
import org.bryan_chanona.panaderiaproyect.models.Producto;

public class EditarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Producto> dataTable;

    @FXML
    private TableColumn<Producto, Integer> cantidadPanes;

    @FXML
    private TableColumn<Producto, String> nombrePanes;

    @FXML
    private TableColumn<Producto, Double> precioPanes;

    @FXML
    private Button actualizarButon;

    @FXML
    private Button verButton;

    @FXML
    void onMouseClickActualizarButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickVerButton(MouseEvent event) {
        Panaderia pancito = App.getPan();
        if (!pancito.getPanes().isEmpty()) {
            dataTable.getItems().addAll(pancito.getPanes());
        }
    }

    @FXML
    void initialize() {
        nombrePanes.setCellValueFactory(cellData -> cellData.getValue().getNombrePanProperty());
        cantidadPanes.setCellValueFactory(cellData-> cellData.getValue().getCantidadProductoProperty().asObject());
        precioPanes.setCellValueFactory(cellData -> cellData.getValue().getPrecioProductoProperty().asObject());
    }
}
