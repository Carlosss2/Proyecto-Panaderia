module org.bryan_chanona.panaderiaproyect {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.bryan_chanona.panaderiaproyect to javafx.fxml;
    exports org.bryan_chanona.panaderiaproyect;
    exports org.bryan_chanona.panaderiaproyect.controllers;
    opens org.bryan_chanona.panaderiaproyect.controllers to javafx.fxml;
    opens org.bryan_chanona.panaderiaproyect.models;
}