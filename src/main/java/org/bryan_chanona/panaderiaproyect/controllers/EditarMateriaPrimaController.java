package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
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
        Integer nuevaCantidad = Integer.parseInt(cantidadMateria.getText());

        String nombrePan = nombreMateria.getText();
        Panaderia lista = App.getPan();

        if (!lista.getPanes().isEmpty()) {
            boolean productoEncontrado = false;
            for (Producto producto : lista.getPanes()) {
                if (nombrePan.equals(producto.getNombrePan())) {
                    producto.setCantidadProducto(nuevaCantidad);
                    productoEncontrado = true;
                    break;
                }
            }
            if (productoEncontrado) {

                materiaPrimaTable.getItems().clear();
                materiaPrimaTable.getItems().addAll(lista.getMaterial());
            }
        }

    }

    @FXML
    void botonVer(MouseEvent event) {
        Panaderia materiaPrima = App.getPan();
        if (!materiaPrima.getMaterial().isEmpty()) {
            materiaPrimaTable.getItems().clear();
            materiaPrimaTable.getItems().addAll(materiaPrima.getMaterial());
        }
    }

    @FXML
    void initialize() {
        mostrarName.setCellValueFactory(cellData -> cellData.getValue().getNombrePanProperty());
        MostrarCantidad.setCellValueFactory(cellData-> cellData.getValue().getCantidadProductoProperty().asObject() );


    }

}
