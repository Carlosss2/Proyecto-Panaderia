package org.bryan_chanona.panaderiaproyect.models;

public class MateriaPrima extends Producto{

    String typeMateria;

    public MateriaPrima(String nombre, Integer cantidad, Double precio, String typeMateria) {
        super(nombre, cantidad, precio);
        this.typeMateria = typeMateria;
    }
}
