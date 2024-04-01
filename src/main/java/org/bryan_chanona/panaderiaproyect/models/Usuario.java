package org.bryan_chanona.panaderiaproyect.models;

public class Usuario {
    private String userSuperAd = "superAd";
    private String contraseniaSu="superadmin123";
    private String userAdministrador = "administrador";
    private String contraseniaAd = "administrador123";
    private String userEmpleado;
    private String contraEmpleado;

    public String getUserEmpleado() {
        return userEmpleado;
    }

    public String getContraEmpleado() {
        return contraEmpleado;
    }

    public Usuario (){

    }

    public Usuario(String userEmpleado, String contraEmpleado) {
        this.userEmpleado = userEmpleado;
        this.contraEmpleado = contraEmpleado;
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


    public String seeUser(){
        return "Usuario"+userEmpleado+ ""+contraEmpleado;
    }
}
