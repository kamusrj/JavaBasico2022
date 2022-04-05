package Ejercicios03;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * @author Kamus
 */
public class SalarioPC {

    /*Una empresa de venta de computadoras paga a su personal de ventas un salario 
de $300,00 más una comisión de $50,00 por computadora vendida. Diseñar un 
programa para calcular el salario de un vendedor en un determinado mes, 
conociendo el nº de computadoras vendidas. Al salario devengado se debe de 
retener el 10% en concepto de renta. Imprimir el nombre del vendedor, el salario 
devengado y la retención de la renta*/
    public static void main(String[] args) {
        NumberFormat nf = new DecimalFormat("0.00");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//declaracion de variable 

        double salario = 300.00;
        double comision = 50.00;
        int Npc = 0;

        System.out.println(" *** Bienvenido al sistema de calculo salarial *** ");

        try {
            System.out.println("Ingrese nombre del vendedor");
            String nombre = bf.readLine();
            System.out.println("Ingres cantidad de Computadoras vendida");
            Npc = Integer.parseInt(bf.readLine());

            System.out.println("Nombre del empleado:\n" + nombre);
            System.out.println("Salario completo:\n$" + nf.format(SalarioTotal(salario, comision, Npc)));
            System.out.println("Descuento de la renta total;\n$" + nf.format(Renta(salario, comision, Npc)));

        } catch (Exception e) {
            System.out.println("El erro esta en " + e.getMessage());
        }

    }
// metodo para calcular salario total

    public static double SalarioTotal(double salario, double comision, int Npc) {
        double total;
        total = salario + (comision * Npc);
        return total;
    }
// metodo dentro de un metodo 

    public static double Renta(double salario, double comision, int Npc) {
        double st = SalarioTotal(salario, comision, Npc);
        double renta;
        renta = st * 0.10;
        return renta;

    }

}
