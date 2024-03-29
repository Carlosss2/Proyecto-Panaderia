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

public class AgregarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bienmesabeButton;

    @FXML
    private Button bolilloButton;

    @FXML
    private Button cazuelejaButton;

    @FXML
    private Button chorizoButton;

    @FXML
    private Button empanadaButton;

    @FXML
    private Button higoButton;

    @FXML
    private Button malateButton;

    @FXML
    private Button matizadaButton;

    @FXML
    private Button micropanButton;

    @FXML
    private Button simpleButton;

    @FXML
    private Button yemaButton;

    @FXML
    private Button zisoteButton;
    Stage callBienmesabe = new Stage();

    @FXML
    void onMouseClickBienmesabeButton(MouseEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("controlDeProducto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callBienmesabe.setTitle("Hello!");
        callBienmesabe.setScene(scene);
        callBienmesabe.show();
    }

    @FXML
    void onMouseClickBolilloButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickCazuelejaButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickChorizoButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickEmpnadaButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickHigoButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickMaletaButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickMatizadaButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickMicroButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickSimpleButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickYemaButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickZisoteButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
    }

}
