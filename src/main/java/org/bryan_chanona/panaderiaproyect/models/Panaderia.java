package org.bryan_chanona.panaderiaproyect.models;

import org.bryan_chanona.panaderiaproyect.App;

import java.util.ArrayList;

public class Panaderia {
    private ArrayList<Pan> Panes=new ArrayList<>();

    public ArrayList<Pan> getPanes() {
        return Panes;
    }
    public boolean addPan(Pan pan ){
        return Panes.add(pan);
    }

    private ArrayList<Usuario> empleados=new ArrayList<>();


    public boolean addEmpleado(Usuario usuario){
        return empleados.add(usuario);
    }
    public ArrayList<Usuario> getEmpleados() {
        return empleados;
    }


    private ArrayList<MateriaPrima> material=new ArrayList<>();

    public ArrayList<MateriaPrima> getMaterial() {
        return material;
    }
    public boolean addMateriaPrima(MateriaPrima materiaPrima){
        return material.add(materiaPrima);
    }

    private ArrayList<Venta> ventas=new ArrayList<>();

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public boolean registroVenta(Venta venta) {
        return ventas.add(venta);
    }
}



