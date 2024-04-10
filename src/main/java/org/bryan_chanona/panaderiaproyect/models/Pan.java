package org.bryan_chanona.panaderiaproyect.models;

public class Pan extends Producto{
    private String tamanio;
    private String sabor;

    public Pan(String nameProduct, Integer cantidadProducto, Double precioProducto, String tamanio, String sabor) {
        super(nameProduct, cantidadProducto, precioProducto);
        this.tamanio = tamanio;
        this.sabor = sabor;
    }


}
