package com.adecco.modelo;

public class Producto1Necesidad extends Producto {
    //Atributos
    //Metodos
        //Override methods-> CalcularIva
    @Override
    public double CalcularIva() {
        return precio*0.04;
    }

    @Override
    public double CalcularPrecio() {
        return precio+(precio*0.04);
    }

    @Override
    public String toString() {
        return "Producto1Necesidad{ " +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    //Constructores

    public Producto1Necesidad() {
    }

    public Producto1Necesidad(int idProducto, String nombre, double precio) {
        super(idProducto, nombre, precio);
    }

    //Setters y Getters

}
