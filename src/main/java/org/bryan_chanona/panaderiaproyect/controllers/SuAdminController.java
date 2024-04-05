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
    Stage callMateriaPrima = new Stage();
    Stage callEmpleado = new Stage();
    Stage callReporte = new Stage();
    Stage callRegistro = new Stage();

    @FXML
    void onMouseClickEmpleadosButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("usuario-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        callEmpleado.setTitle("Hello!");
        callEmpleado.setScene(scene);
        callEmpleado.show();

    }

    @FXML
    void onMouseClickMateriaPrimaButton(MouseEvent event) throws IOException{
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
    void onMouseClickRegistroVentasButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("registro-ventas-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        callRegistro.setTitle("Hello!");
        callRegistro.setScene(scene);
        callRegistro.show();


    }

    @FXML
    void onMouseClickReporteButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("generarReporte-view.fxml"));
        Scene scene = null;
        scene = new Scene(fxmlLoader.load());
        callReporte.setTitle("Hello!");
        callReporte.setScene(scene);
        callReporte.show();

    }

    @FXML
    void initialize() {

    }

}