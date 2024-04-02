package org.bryan_chanona.panaderiaproyect.models;

import java.util.ArrayList;

public class Panaderia {

    ArrayList<Pan> Panes=new ArrayList<>();

    public ArrayList<Pan> getPanes() {
        return Panes;
    }
    public boolean addPan(Pan pan ){
        return Panes.add(pan);
    }

    ArrayList<Usuario> empleados=new ArrayList<>();

    public ArrayList<Usuario> getEmpleados() {
        return empleados;
    }
    public boolean addEmpleado(Usuario usuario){
        return empleados.add(usuario);
    }

    @Override
    public String toString() {
        return "Panaderia{" +

                " empleados=" + empleados +
                '}';
    }
}
