package org.bryan_chanona.panaderiaproyect.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Usuario {
    private String userSuperAd = "superAd";
    private String contraseniaSu="superadmin123";
    private String userAdministrador = "administrador";
    private String contraseniaAd = "administrador123";
    private final StringProperty userEmpleado;
    private final StringProperty contraEmpleado;

    public Usuario() {
        this.userEmpleado = new SimpleStringProperty("");
        this.contraEmpleado = new SimpleStringProperty("");
    }

    public Usuario(String userEmpleado, String contraEmpleado) {
        this.userEmpleado = new SimpleStringProperty(userEmpleado);
        this.contraEmpleado = new SimpleStringProperty(contraEmpleado);
    }

    public String getUserEmpleado() {
        return userEmpleado.get();
    }

    public StringProperty userEmpleadoProperty() {
        return userEmpleado;
    }

    public String getContraEmpleado() {
        return contraEmpleado.get();
    }

    public StringProperty contraEmpleadoProperty() {
        return contraEmpleado;
    }

    public String getUserSuperAd() {
        return userSuperAd;
    }

    public String getContraseniaSu() {
        return contraseniaSu;
    }

    public String getUserAdministrador() {
        return userAdministrador;
    }

    public String getContraseniaAd() {
        return contraseniaAd;
    }



}
