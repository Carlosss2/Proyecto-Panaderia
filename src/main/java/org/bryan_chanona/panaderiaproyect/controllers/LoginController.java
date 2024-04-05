package org.bryan_chanona.panaderiaproyect.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Usuario;

public class LoginController {
    Usuario usuarioLogin = new Usuario();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField Passwordtext;

    @FXML
    private Button SingInButton;

    @FXML
    private TextField Usertext;

    Stage callSu = new Stage();
    Stage callAd = new Stage();

    private int intentos = 0;
    private final int MAX_INTENTOS = 3;

    @FXML
    void OnMouseClickedSingInButton(MouseEvent event) {
        String userName = Usertext.getText();
        String userPassword = Passwordtext.getText();

        if (intentos < MAX_INTENTOS) {
            if (userName.equals(usuarioLogin.getUserSuperAd()) && userPassword.equals(usuarioLogin.getContraseniaSu())) {
                abrirVentana("suAdmin-view.fxml", "Super Administrador");
                Usertext.clear();
                Passwordtext.clear();
                return;
            } else if (userName.equals(usuarioLogin.getUserAdministrador()) && userPassword.equals(usuarioLogin.getContraseniaAd())) {
                abrirVentana("admin-view.fxml", "Administrador");
                Usertext.clear();
                Passwordtext.clear();
                return;
            } else {
                intentos++;
                if (intentos == MAX_INTENTOS) {
                    mostrarAlerta("Hasta luego", "Ha alcanzado el máximo de intentos.");
                    cerrarVentana();
                } else {
                    mostrarAlerta("Error de inicio de sesión", "El correo o la contraseña no coinciden. Intento " + intentos + "/" + MAX_INTENTOS + ". Vuelva a intentarlo.");
                    Usertext.clear();
                    Passwordtext.clear();
                }
            }
        }
    }
    @FXML
    void onMouseClickCerrarButton(MouseEvent event) {
        cerrarVentana();
    }

    private void abrirVentana(String fxmlPath, String title) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxmlPath));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void cerrarVentana() {
        Stage stage = (Stage) SingInButton.getScene().getWindow();
        stage.close();
    }
}
