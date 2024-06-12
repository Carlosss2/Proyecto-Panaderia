package org.bryan_chanona.panaderiaproyect;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.bryan_chanona.panaderiaproyect.controllers.EditarProductoController;
import org.bryan_chanona.panaderiaproyect.controllers.InventarioProductoController;
import org.bryan_chanona.panaderiaproyect.models.Panaderia;
import org.bryan_chanona.panaderiaproyect.models.Usuario;

import java.io.IOException;

public class App extends Application {
    private static Panaderia inventario = new Panaderia();
    public static Panaderia getInventario() {
        return inventario;
    }

    @Override
    public void start(Stage stage) throws IOException {
        Usuario administrador = new Usuario("administrador","administrador123");
        Usuario superAdministrador = new Usuario("superAd","superadmin123");
        App.getInventario().addEmpleado(superAdministrador);
        App.getInventario().addEmpleado(administrador);
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {

        launch();
    }
}