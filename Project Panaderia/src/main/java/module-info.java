module carlos.c.projectpanaderia {
    requires javafx.controls;
    requires javafx.fxml;


    opens carlos.c.projectpanaderia to javafx.fxml;
    exports carlos.c.projectpanaderia;
    exports carlos.c.projectpanaderia.controllers;
    opens carlos.c.projectpanaderia.controllers to javafx.fxml;

}