package com.adecco.presentacion;

import com.adecco.modelo.Producto;
import com.adecco.modelo.Producto1Necesidad;
import com.adecco.modelo.ProductoLujo;

public class Main {
    public static void main(String[] args) {
        Producto p1= new ProductoLujo(1,"Aceite",10);
        System.out.println("ID producto: "+p1.getIdProducto());
        System.out.println("Nombre producto: "+p1.getNombre());
        System.out.println("Precio producto: "+p1.getPrecio());
        System.out.println("IVA producto: "+p1.CalcularIva() );
        System.out.println("Total a pagar cliente: "+p1.CalcularPrecio());
        System.out.println(p1.toString());
//Si en la clase producto no declaramos un toString aparece otra info.
//Si creamos un toString en la clase Producto, aparecerá esa info.
        System.out.println(p1);
//Si no ponemos método, se aplica el toString
        Producto p2=new ProductoLujo(2,"Papel",5);
        System.out.println(p2.toString());
        System.out.println("IVA producto: "+p2.CalcularIva());

        Producto1Necesidad p1n1=new Producto1Necesidad(1,"Fruta",10);
        //p1n1.setIdProducto(1);
        //p1n1.setNombre("Fruta");
        //p1n1.setPrecio(10);
        System.out.println(p1n1);
        System.out.println("IVA producto: "+p1n1.CalcularIva());
        System.out.println("Total a pagar cliente: "+p1n1.CalcularPrecio());

        Producto p3=new Producto1Necesidad(2,"Platanos",7);
        System.out.println(p3);
        System.out.println("IVA producto: "+p3.CalcularIva());

        ProductoLujo p1l1=new ProductoLujo(1,"Colgante",100);
        System.out.println(p1l1.toString());
        System.out.println("IVA producto: "+p1l1.CalcularIva());

    }


}