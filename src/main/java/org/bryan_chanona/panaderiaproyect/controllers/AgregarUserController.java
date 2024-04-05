package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Usuario;

public class AgregarUserController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField contraseniaUser;

    @FXML
    private TextField nombreUser;

    @FXML
    void agregarButon(MouseEvent event) {
        Usuario usuario=new Usuario(nombreUser.getText(),contraseniaUser.getText());
        App.getPan().addEmpleado(usuario);
        nombreUser.clear();
        contraseniaUser.clear();

    }


}
