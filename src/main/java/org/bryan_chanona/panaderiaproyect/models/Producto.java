package org.bryan_chanona.panaderiaproyect.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Producto {
    private final StringProperty nombrePan;
    private final IntegerProperty cantidadProducto;
    private final DoubleProperty precioProducto;

    public Producto(String nombre, Integer cantidad, Double precio) {
        this.nombrePan = new SimpleStringProperty(nombre);
        this.cantidadProducto = new SimpleIntegerProperty(cantidad);
        this.precioProducto = new SimpleDoubleProperty(precio);
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto.set(cantidadProducto);
    }

    public int getCantidadProducto() {
        return cantidadProducto.get();
    }

    public String getNombrePan() {
        return nombrePan.get();
    }

    public StringProperty getNombrePanProperty() {
        return nombrePan;
    }

    public IntegerProperty getCantidadProductoProperty() {
        return cantidadProducto;
    }

    public DoubleProperty getPrecioProductoProperty() {
        return precioProducto;
    }
}
