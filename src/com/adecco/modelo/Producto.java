package com.adecco.modelo;

public abstract class Producto { //el tipo abstract se pone en el método y clase
    //Atributos
    protected int idProducto;
    protected String nombre;
    protected double precio;

    //Métodos
    public abstract double CalcularIva();

        // modificamos el return a 0, ya que en cada tipo de producto
        // tenemos su cálculo de IVA específico.
        // No lo borramos porque necesitamos llamar al método CalcularIva

        public double CalcularPrecio(){
        return precio+(precio*0.21);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

//Constructores

    public Producto() {
    }

    public Producto(int idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Setters y Getters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
