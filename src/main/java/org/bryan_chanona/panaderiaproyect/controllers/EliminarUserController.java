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
import org.bryan_chanona.panaderiaproyect.models.Usuario;

public class EliminarUserController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField contraUsuario;

    @FXML
    private TableView<Usuario> dataEmpleado;

    @FXML
    private TextField nombreEliminar;

    @FXML
    private TableColumn<Usuario, String> nombreEmpleado;

    @FXML
    void onMouseClickEliminarEmpleadoButton(MouseEvent event) {
        String nombreEmpleadoText = nombreEliminar.getText();
        String contrasenia = contraUsuario.getText();

        Panaderia listaEmpleado = App.getInventario();
        if (!listaEmpleado.getListaEmpleados().isEmpty()) {
            for (Usuario empleado : listaEmpleado.getListaEmpleados()) {
                if (empleado.getUserEmpleado().equals(nombreEmpleadoText) && empleado.getContraEmpleado().equals(contrasenia)) {
                    listaEmpleado.getListaEmpleados().remove(empleado);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText("¡Empleado eliminado exitosamente del sistema!");
                    alert.showAndWait();

                    nombreEliminar.clear();
                    contraUsuario.clear();
                    break; // Termina el bucle después de eliminar el usuario
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setContentText("Los datos no coinciden, vuelva a intentarlo.");
                    alert.showAndWait();
                    nombreEliminar.clear();
                    contraUsuario.clear();
                }
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("La lista de empleados está vacía.");
            alert.showAndWait();
            nombreEliminar.clear();
            contraUsuario.clear();
        }

        // Actualizar la tabla después de eliminar
        dataEmpleado.getItems().clear();
        dataEmpleado.getItems().addAll(listaEmpleado.getListaEmpleados());
    }

    @FXML
    void onMouseClickVerEmpleadosButton(MouseEvent event) {
        Panaderia listaEmpleado = App.getInventario();
        if (!listaEmpleado.getListaEmpleados().isEmpty()) {
            dataEmpleado.getItems().clear();
            dataEmpleado.getItems().addAll(listaEmpleado.getListaEmpleados());
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("La lista de empleados está vacía.");
            alert.showAndWait();
        }
    }

    @FXML
    void initialize() {
        nombreEmpleado.setCellValueFactory(cellData -> cellData.getValue().userEmpleadoProperty());
    }
}
