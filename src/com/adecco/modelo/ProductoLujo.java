package com.adecco.modelo;

public class ProductoLujo extends Producto{
    //Atributos
    //Metodos

    @Override
    public double CalcularIva() {
        return precio*0.21;
    }

    @Override
    public String toString() {
        return "ProductoLujo{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
    //Constructor

    public ProductoLujo() {
    }

    public ProductoLujo(int idProducto, String nombre, double precio) {
        super(idProducto, nombre, precio);
    }
    //Setters y Getters
}
