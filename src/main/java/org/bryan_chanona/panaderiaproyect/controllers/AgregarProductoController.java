package org.bryan_chanona.panaderiaproyect.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.panaderiaproyect.App;
import org.bryan_chanona.panaderiaproyect.models.Pan;


public class AgregarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField cantidadAagregar;

    @FXML
    private ComboBox<String> tipoPanesComboBox;

    @FXML
    void agregarProducto(MouseEvent event) {

        switch (tipoPanesComboBox.getValue()){
            case "Yema":
                Integer cantidadYema= Integer.parseInt(cantidadAagregar.getText());
                App.getPan().sumarPanesYema(cantidadYema);
                Pan yemita = new Pan("Yema",cantidadYema,1.00,"Mediano","Dulce");
                App.getPan().addPan(yemita);

                break;
            case  "Chorizo":
                Integer cantidadChorizo= Integer.parseInt(cantidadAagregar.getText());
                App.getPan().sumarPanesChorizo(cantidadChorizo);
                Pan chorizo = new Pan("Chorizo",cantidadChorizo,1.00,"Mediano","Dulce");
                App.getPan().addPan(chorizo);
                break;
            case "Micropan":
                Integer cantidadMicropan= Integer.parseInt(cantidadAagregar.getText());
                App.getPan().sumarMicroPan(cantidadMicropan);
                Pan micro = new Pan("Micropan",cantidadMicropan,1.00,"Mediano","Dulce");
                App.getPan().addPan(micro);

                break;
            case "Bienmesabe":
                Integer cantidadBienMeSabe= Integer.parseInt(cantidadAagregar.getText());
                App.getPan().sumarPanesBienmesabe(cantidadBienMeSabe);
                Pan bienSabe = new Pan("Bienmesabe",cantidadBienMeSabe,1.00,"Mediano","Dulce");
                App.getPan().addPan(bienSabe);
                break;
            case"Rosquilla simple":
                Integer cantidadRosquillaSimple= Integer.parseInt(cantidadAagregar.getText());
                App.getPan().sumarPanesRosquillaSimple(cantidadRosquillaSimple);
                Pan rQs = new Pan("Rosquilla simple",cantidadRosquillaSimple,1.00,"Mediano","Dulce");
                App.getPan().addPan(rQs);
                break;

            case"Rosquilla matizada":
                Integer cantidadRosquillaMatizada= Integer.parseInt(cantidadAagregar.getText());
                App.getPan().sumarRosquillaMatizada(cantidadRosquillaMatizada);
                Pan rQm = new Pan("Rosquilla Matizada",cantidadRosquillaMatizada,3.00,"Mediano","Dulce");
                App.getPan().addPan(rQm);
                break;

                case"Bolillo":
                    Integer cantidadBolillo= Integer.parseInt(cantidadAagregar.getText());
                    App.getPan().sumarBolillo(cantidadBolillo);
                    Pan bolillo = new Pan("Bolillo",cantidadBolillo,2.00,"Mediano","Salado");
                    App.getPan().addPan(bolillo);
                    break;

                    case"Zisote":
                        Integer cantidadZisote= Integer.parseInt(cantidadAagregar.getText());
                        App.getPan().sumarZisote(cantidadZisote);
                        Pan zisote = new Pan("Zisote",cantidadZisote,1.00,"Mediano","Dulce");
                        App.getPan().addPan(zisote);
                break;
                case"Higo":
                    Integer cantidadHigo= Integer.parseInt(cantidadAagregar.getText());
                    App.getPan().sumarHigo(cantidadHigo);
                    Pan higo = new Pan("Higo",cantidadHigo,5.00,"Mediano","Dulce");
                    App.getPan().addPan(higo);
                    break;
            case "Maleta":
                Integer cantidadMaleta= Integer.parseInt(cantidadAagregar.getText());
                App.getPan().sumarMaleta(cantidadMaleta);
                Pan maleta = new Pan("Maleta",cantidadMaleta,1.00,"Mediano","Dulce");
                App.getPan().addPan(maleta);
                break;
            case"Cazueleja":
                Integer cantidadCazueleja= Integer.parseInt(cantidadAagregar.getText());
                App.getPan().sumarCazueleja(cantidadCazueleja);
                Pan cazueleja = new Pan("Cazueleja",cantidadCazueleja,5.00,"Grande","Dulce");
                App.getPan().addPan(cazueleja);
                break;
            case "Empanada":
                Integer cantidadEmpanada= Integer.parseInt(cantidadAagregar.getText());
                App.getPan().sumarEmpanada(cantidadEmpanada);
                Pan empanada = new Pan("Empanada",cantidadEmpanada,1.00,"Mediano","Dulce");
                App.getPan().addPan(empanada);
                break;
        }
    }

    @FXML
    void salirBoton(MouseEvent event) {

    }

    
@FXML
    void initialize() {
        tipoPanesComboBox.getItems().addAll("Yema","Chorizo","Micropan","Bienmesabe","Rosquilla simple"
        ,"Rosquilla matizada","Bolillo","Zisote","Higo","Maleta","Cazueleja","Empanada");
    }

}
