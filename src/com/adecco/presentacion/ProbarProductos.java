package com.adecco.presentacion;

import com.adecco.modelo.Producto;
import com.adecco.modelo.Producto1Necesidad;
import com.adecco.modelo.ProductoLujo;

public class ProbarProductos {
    public static void main(String[] args) {
        //Definir un array de productos, solo se asigna un espacio de memoria crea las celdas del array
        Producto[] productos=new Producto[4];

        Producto1Necesidad p1=new Producto1Necesidad(1,"Arroz",2);
        Producto1Necesidad p2=new Producto1Necesidad(2,"Patata",3);
        ProductoLujo p3=new ProductoLujo(3,"Ratón",12);
        ProductoLujo p4=new ProductoLujo(4,"Teclado",20);

        productos[0]=p1;
        productos[1]=p2;
        productos[2]=p3;
        productos[3]=p4;

        //System.out.println("Primera celda "+productos[0]);
        //System.out.println("Segunda celda "+productos[1]);
        //System.out.println("Tercera celda "+productos[2]);
        //System.out.println("Cuarta celda "+productos[3]);
        System.out.println("------for ");
        for(int i= 0; i<productos.length;i++){
        System.out.println("Cálculo IVA: "+ productos[i].CalcularIva());}

        System.out.println("------for each");

        for (Producto elemento:productos) {
        System.out.println("Cálculo IVA: "+elemento.CalcularIva());}
    }
}
