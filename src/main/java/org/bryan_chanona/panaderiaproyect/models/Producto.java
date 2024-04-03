package org.bryan_chanona.panaderiaproyect.models;

public class Producto {
    private String nameProduct;
    private Integer cantidadProducto;
    private Double precioProducto;

    public Producto(String nameProduct, Integer cantidadProducto, Double precioProducto) {
        this.nameProduct = nameProduct;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
    }
}
