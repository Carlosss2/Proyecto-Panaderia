package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    private TextField actualizarCantidadPanes;

    @FXML
    private TextField actualizarNombre;

    @FXML
    private TextField actualizarPrecio;

    @FXML
    void onMouseClickActualizarButton(MouseEvent event) {
        Integer nuevaCantidad = Integer.parseInt(actualizarCantidadPanes.getText());
        Double nuevoPrecio = Double.parseDouble(actualizarPrecio.getText());
        String nombrePan = actualizarNombre.getText();
        Panaderia lista = App.getPan();

        if (!lista.getPanes().isEmpty()) {
            boolean productoEncontrado = false;
            for (Producto producto : lista.getPanes()) {
                if (nombrePan.equals(producto.getNombrePan())) {
                    producto.setCantidadProducto(nuevaCantidad);
                    producto.setPrecioProducto(nuevoPrecio);
                    productoEncontrado = true;
                    actualizarNombre.clear();
                    actualizarCantidadPanes.clear();
                    actualizarPrecio.clear();
                    break; // Salir del bucle una vez que se actualice el producto
                }
            }
            if (productoEncontrado) {
                // Limpiar la tabla y agregar de nuevo los productos actualizados
                dataTable.getItems().clear(); // Limpiar la tabla antes de volver a agregar los productos
                dataTable.getItems().addAll(lista.getPanes()); // Agregar los productos actualizados
            }
        }
    }

    @FXML
    void onMouseClickVerButton(MouseEvent event) {
            Panaderia pancito = App.getPan();
            if (!pancito.getPanes().isEmpty()) {
                dataTable.getItems().clear(); // Limpiar la tabla antes de agregar los productos
                dataTable.getItems().addAll(pancito.getPanes()); // Agregar los productos a la tabla
            }
    }

    @FXML
    void initialize() {
        nombrePanes.setCellValueFactory(cellData -> cellData.getValue().getNombrePanProperty());
        cantidadPanes.setCellValueFactory(cellData-> cellData.getValue().getCantidadProductoProperty().asObject());
        precioPanes.setCellValueFactory(cellData -> cellData.getValue().getPrecioProductoProperty().asObject());
    }
}
