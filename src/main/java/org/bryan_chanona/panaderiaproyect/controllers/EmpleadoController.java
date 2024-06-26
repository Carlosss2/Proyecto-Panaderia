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

public class EmpleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    Stage callProducto = new Stage();
    Stage callMateriaPrima = new Stage();

    @FXML
    void onMouseClickMateriaPrimaButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("materiaPrima-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        callMateriaPrima.setTitle("Hello!");
        callMateriaPrima.setScene(scene);
        callMateriaPrima.show();

    }

    @FXML
    void onMouseClickProductosButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("producto-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        callProducto.setTitle("Hello!");
        callProducto.setScene(scene);
        callProducto.show();

    }

    @FXML
    void initialize() {

    }

}
