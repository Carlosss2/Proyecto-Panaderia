package org.bryan_chanona.panaderiaproyect.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.bryan_chanona.panaderiaproyect.App;

public class ProductoController {


    @FXML
    private Button addProduct;
    @FXML
    private Button eliminarProducto;

    @FXML
    private Button modifiedProduct;

    @FXML
    private Button venderProducto;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    Stage callAgregarProducto = new Stage();
    Stage callEliminarProducto = new Stage();
    Stage callModificarProducto = new Stage();
    Stage callVenderProducto = new Stage();
    Stage callInventario = new Stage();


    @FXML
    void onMouseClickAgregarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("agregarProducto-view.fxml"));
        Scene scene;
        scene = new Scene(fxmlLoader.load());
        callAgregarProducto.setTitle("Hello!");
        callAgregarProducto.setScene(scene);
        callAgregarProducto.show();

    }

    @FXML
    void onMouseClickEliminarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("eliminarProducto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callEliminarProducto.setTitle("Hello!");
        callEliminarProducto.setScene(scene);
        callEliminarProducto.show();

    }

    @FXML
    void onMouseClickModificarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("editar-producto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callModificarProducto.setTitle("Hello!");
        callModificarProducto.setScene(scene);
        callModificarProducto.show();




    }

    @FXML
    void onMouseClickVenderButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("venderProducto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callVenderProducto.setTitle("Hello!");
        callVenderProducto.setScene(scene);
        callVenderProducto.show();

    }

    @FXML
    void initialize() {

    }

    public void inventarioBoton(MouseEvent mouseEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("inventario-productos-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callInventario.setTitle("Hello!");
        callInventario.setScene(scene);
        callInventario.show();

    }
}
