package com.mycompany.ejercicio_resuelto_12;

public class Ejercicio_resuelto_12 {

    public static void main(String[] args) {
        double horas_trabajadas, valor_hora;
        double retencion;
        double salario_bruto,salario_neto;
        horas_trabajadas=48;
        valor_hora=5000;
        salario_bruto=horas_trabajadas*valor_hora;  
        retencion= salario_bruto* (12.5/100);
        salario_neto = salario_bruto - retencion;
        System.out.println("Salario Bruto: " + salario_bruto);
        System.out.println("Retención en la fuente: " + retencion);
        System.out.println("Salario Neto: " + salario_neto);
        
    }
}
