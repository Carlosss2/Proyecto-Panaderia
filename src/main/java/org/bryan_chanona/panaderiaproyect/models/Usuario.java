package org.bryan_chanona.panaderiaproyect.models;

public class Usuario {
    private String userSuperAd = "superAd";
    private String contraseniaSu="superadmin123";
    private String userAdministrador = "administrador";
    private String contraseniaAd = "administrador123";
    private String userEmpleado;
    private String contraEmpleado;

    public Usuario(String userEmpleado, String contraEmpleado) {
        this.userEmpleado = userEmpleado;
        this.contraEmpleado = contraEmpleado;
    }
}
