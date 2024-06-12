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

public class MateriaPrimaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    Stage callAddMateria = new Stage();
    Stage callDeleteMateria = new Stage();
    Stage callModifiedMateria = new Stage();
    Stage callInventario = new Stage();

    @FXML
    void onMouseClickAgregarMateriaButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("agregarMateriaPrima-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        callAddMateria.setTitle("Hello!");
        callAddMateria.setScene(scene);
        callAddMateria.show();


    }

    @FXML
    void onMouseClickEliminarMateriaButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("eliminarMateriaPrima-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        callDeleteMateria.setTitle("Hello!");
        callDeleteMateria.setScene(scene);
        callDeleteMateria.show();

    }

    @FXML
    void onMouseClickModificarMateriaButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("editarMateriaPrima-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        callModifiedMateria.setTitle("Hello!");
        callModifiedMateria.setScene(scene);
        callModifiedMateria.show();


    }
    @FXML
    void onMouseClickInventarioButton(MouseEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("inventarioMateriaPrima-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callInventario.setTitle("Hello!");
        callInventario.setScene(scene);
        callInventario.show();

    }

    @FXML
    void initialize() {

    }

}
