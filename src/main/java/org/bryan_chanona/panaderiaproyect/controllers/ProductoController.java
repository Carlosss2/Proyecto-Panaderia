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

public class ProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    Stage callAgregarproduct = new Stage();
    Stage callModificarproducto = new Stage();
    Stage callVenderProducto =  new Stage();
    Stage callEliminarProducto = new Stage();


    @FXML
    void onMouseClickAgregarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("agregarProducto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callAgregarproduct.setTitle("Hello!");
        callAgregarproduct.setScene(scene);
        callAgregarproduct.show();


    }

    @FXML
    void onMouseClickModificarButton(MouseEvent event) {


    }

    @FXML
    void onMouseClickVenderButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickeliminarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("eliminarProducto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callEliminarProducto.setTitle("Hello!");
        callEliminarProducto.setScene(scene);
        callEliminarProducto.show();

    }

    @FXML
    void initialize() {

    }

}
