package com.mycompany.ejercicio_resuelto_5;

public class Ejercicio_Resuelto_5 {

    public static void main(String[] args) {
        double suma,x,y;
        suma=0;
        x=20;
        suma=suma+x;
        y=40;
        x=x+ Math.pow(y, 2);
        suma=suma+(x/y);
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
    }
}
