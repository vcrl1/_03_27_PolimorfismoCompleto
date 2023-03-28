package com.adecco.presentacion;

import java.util.Arrays;

public class ProbarArrays {
    public static void main(String[] args) {
        System.out.println("--Definición de array ");
        //Definición de Array
        int[] numeros=new int[3];
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=15;
        System.out.println("Primera celda "+numeros[0]);
        System.out.println("Segunda celda "+numeros[1]);
        System.out.println("Tercera celda "+numeros[2]);


        System.out.println("--Definición de array en dos líneas");
        //Definición de array en dos líneas
        String[] nombres; //no sabemos el nº de alumnos, por ej.
        nombres=new String[3];  //Esto se crearía cuando sepamos el nº de alumnos
        nombres[0]="Sara";
        nombres[1]="Ana";
        nombres[2]="Eli";
        System.out.println("Primera celda "+nombres[0]);
        System.out.println("Segunda celda "+nombres[1]);
        System.out.println("Tercera celda "+nombres[2]);
        System.out.println(Arrays.toString(nombres));




    }
}
