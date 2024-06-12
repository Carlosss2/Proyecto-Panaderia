package org.bryan_chanona.panaderiaproyect.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Usuario {
    private final StringProperty userEmpleado;
    private final StringProperty contraEmpleado;

    public Usuario(String userEmpleado, String contraEmpleado) {
        this.userEmpleado = new SimpleStringProperty(userEmpleado);
        this.contraEmpleado = new SimpleStringProperty(contraEmpleado);
    }

    public StringProperty userEmpleadoProperty() {
        return userEmpleado;
    }
    public String getUserEmpleado() {
        return userEmpleado.get();
    }
    public String getContraEmpleado() {
        return contraEmpleado.get();
    }
}
