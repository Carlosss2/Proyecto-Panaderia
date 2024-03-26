package org.bryan_chanona.panaderiaproyect.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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
    private Button SignInButton;
    @FXML
    private TextField Usertext;
    Stage callSu = new Stage();
    Stage callAd = new Stage();

    @FXML
    void OnMouseClickedSingInButton(MouseEvent event) {
        String userName = Usertext.getText();
        String userPassword = Passwordtext.getText();
        if (userName.equals(usuarioLogin.getUserSuperAd()) && userPassword.equals(usuarioLogin.getContraseniaSu())){

            try {
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("suAdmin-view.fxml"));
                Scene scene = null;
                scene = new Scene(fxmlLoader.load());
                callSu.setTitle("Hello!");
                callSu.setScene(scene);
                callSu.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (userName.equals(usuarioLogin.getUserAdministrador()) && userPassword.equals(usuarioLogin.getContraseniaAd())) {

            try {
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("admin-view.fxml"));
                Scene scene = null;
                scene = new Scene(fxmlLoader.load());
                callAd.setTitle("Hello!");
                callAd.setScene(scene);
                callAd.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    @FXML
    void initialize() {
      SignInButton.getStylesheets().add("estilos.css");
    }


}