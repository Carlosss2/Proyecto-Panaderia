package org.bryan_chanona.panaderiaproyect.models;


import java.util.ArrayList;

public class Panaderia {

    private ArrayList<Pan> listaProductos=new ArrayList<>();
    private ArrayList<Usuario> listaEmpleados=new ArrayList<>();
    private ArrayList<MateriaPrima> listaMateriaPrima=new ArrayList<>();
    private ArrayList<Venta> ventas=new ArrayList<>();

    public ArrayList<Pan> getListaProductos() {
        return listaProductos;
    }

    public boolean agregarProducto(Pan pan ){
        return listaProductos.add(pan);
    }

    public boolean addEmpleado(Usuario usuario){
        return listaEmpleados.add(usuario);
    }
    public ArrayList<Usuario> getListaEmpleados() {
        return listaEmpleados;
    }

    public boolean addMateriaPrima(MateriaPrima materiaPrima){
        return listaMateriaPrima.add(materiaPrima);
    }
    public ArrayList<MateriaPrima> getListaMateriaPrima() {
        return listaMateriaPrima;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public boolean registroVenta(Venta venta) {
        return ventas.add(venta);
    }
}



