package org.bryan_chanona.panaderiaproyect.models;

import javafx.beans.property.*;

public class Venta {
    private StringProperty nameProduct;
    private IntegerProperty cantidadProduct;
    private DoubleProperty total;

    public Venta(String nameProduct, Integer cantidadProduct, Double total) {
        this.nameProduct = new SimpleStringProperty(nameProduct);
        this.cantidadProduct = new SimpleIntegerProperty(cantidadProduct);
        this.total = new SimpleDoubleProperty(total) ;
    }



    public StringProperty nameProductProperty() {
        return nameProduct;
    }



    public IntegerProperty cantidadProductProperty() {
        return cantidadProduct;
    }

    public DoubleProperty totalProperty() {
        return total;
    }
}
