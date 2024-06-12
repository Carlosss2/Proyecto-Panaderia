package org.bryan_chanona.panaderiaproyect.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Usuario;

import java.util.List;

public class AgregarUserController {

    @FXML
    private TextField contraseniaUser;

    @FXML
    private TextField nombreUser;

    @FXML
    void agregarButon(MouseEvent event) {
        String usuarioNombre = nombreUser.getText();
        String contraaa = contraseniaUser.getText();

        if (usuarioNombre.isEmpty() || contraaa.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Rellene los campos correctamente.");
            alert.showAndWait();
            nombreUser.clear();
            contraseniaUser.clear();
        } else {
            // Obtener la lista de empleados
            List<Usuario> empleados = App.getInventario().getListaEmpleados();

            if (empleados.isEmpty()) {
                // Si la lista está vacía, agregar directamente el usuario
                Usuario nuevoUsuario = new Usuario(usuarioNombre, contraaa);
                App.getInventario().addEmpleado(nuevoUsuario);
                mostrarAlerta("¡Empleado agregado exitosamente!");
            } else {
                // Si la lista no está vacía, verificar si el usuario ya existe
                boolean usuarioExistente = false;
                for (Usuario empleado : empleados) {
                    if (empleado.getUserEmpleado().equals(usuarioNombre)) {
                        usuarioExistente = true;
                        break;
                    }
                }

                if (usuarioExistente) {
                    mostrarAlerta("El usuario ya existe. Vuelva a intentarlo.");
                    nombreUser.clear();
                    contraseniaUser.clear();

                } else {
                    // Si el usuario no existe, agregarlo a la lista
                    Usuario nuevoUsuario = new Usuario(usuarioNombre, contraaa);
                    App.getInventario().addEmpleado(nuevoUsuario);
                    mostrarAlerta("¡Empleado agregado exitosamente!");
                }
            }

            // Limpiar campos después de agregar
            nombreUser.clear();
            contraseniaUser.clear();
        }
    }
    @FXML
    void onMouseClickSalirButton(MouseEvent event) {
        Stage stage = (Stage) nombreUser.getScene().getWindow();
        stage.close();

    }

    private void mostrarAlerta(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
