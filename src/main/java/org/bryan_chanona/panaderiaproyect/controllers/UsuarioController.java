package org.bryan_chanona.panaderiaproyect.controllers;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.bryan_chanona.panaderiaproyect.App;

public class UsuarioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    Stage callEliminar = new Stage();
    Stage callAgregar = new Stage();

    @FXML
    void onMouseClickAgregarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("agregarUser-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        callAgregar.setTitle("Hello!");
        callAgregar.setScene(scene);
        callAgregar.show();

    }

    @FXML
    void onMouseClickEliminarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("eliminarUser-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        callEliminar.setTitle("Hello!");
        callEliminar.setScene(scene);
        callEliminar.show();


    }

    @FXML
    void initialize() {

    }

}
