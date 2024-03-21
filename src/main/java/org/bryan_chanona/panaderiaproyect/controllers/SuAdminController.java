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

public class SuAdminController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    Stage callProducto = new Stage();

    @FXML
    void onMouseClickEmpleadosButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickMateriaPrimaButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickProductosButton(MouseEvent event) {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("producto-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            callProducto.setTitle("Hello!");
            callProducto.setScene(scene);
            callProducto.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }

    @FXML
    void onMouseClickRegistroVentasButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickReporteButton(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }

}
