/*
 * Kamus Curso java Insafor 2022
 */
package Tarea07;

import java.util.Scanner;

/*}
 * @author Kamus
 */
public class CalculoHoras {

    public static void main(String[] args) {
        int horas;
        int horaExtra;
        double salario;
        int j = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("***** Sistema de calculo de salario semanal *****");
        while (j <= 10) {
            System.out.println("Empleado N°" + j);
            System.out.println(
            "Ingrese la cantidad de horas trabajadas ");
            horas = sc.nextInt();

            if (horas > 40) {

                System.out.println("horas trabajadas :" + horas);
                horaExtra = (horas - 40) * 15;
                horas = 40 * 10;

                salario = horas + horaExtra;

                System.out.println("Salario: \n$" + salario);

            } else {
                salario = horas * 10;
                System.out.println("horas trabajadas :" + horas);
                System.out.println("Salario: \n$" + salario);
            }
            j++;
            System.out.println("**************************************************");
        }

    }

}

/*Un obrero necesita calcular su salario semanal, si trabaja 40 horas o menos 
tiene un pago de 10 dólares por hora, y si trabaja más de 40 horas se le paga 
15 dólares por hora por cada hora extra, realizar el programa en Java. 
Ingresar el número de horas trabajadas y calcular el salario devengado.
El programa deberá de hacer los cálculos para 10 empleados utilizando 
repeticiones*/
