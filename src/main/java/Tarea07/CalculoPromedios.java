/*
 * Kamus Curso java Insafor 2022
 */
package Tarea07;

import java.util.Scanner;

/*
 * @author Kamus
 */
public class CalculoPromedios {

    static int apro = 0;
    static int repro = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double lab1 = 0, lab2 = 0, lab3 = 0, lab4 = 0;
        double par1 = 0, par2 = 0, par3 = 0, par4 = 0;

        System.out.println("**** Sistema de calculo de promedios ****");

//for
        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese nombre del alumno");
            String nombre = sc.nextLine();

//notas laboratorio
            System.out.println("Ingrese nota del laboratorio N°1");
            lab1 = Double.parseDouble(sc.nextLine());
            System.out.println("Ingrese nota del laboratorio N°2");
            lab2 = Double.parseDouble(sc.nextLine());
            System.out.println("Ingrese nota del laboratorio N°3");
            lab3 = Double.parseDouble(sc.nextLine());
            System.out.println("Ingrese nota del laboratorio N°4");
            lab4 = Double.parseDouble(sc.nextLine());
//notas parciales
            System.out.println("Ingrese nota del parcial N°1");
            par1 = Double.parseDouble(sc.nextLine());
            System.out.println("Ingrese nota del parcial N°2");
            par2 = Double.parseDouble(sc.nextLine());
            System.out.println("Ingrese nota del parcial N°3");
            par3 = Double.parseDouble(sc.nextLine());
            System.out.println("Ingrese nota del parcial N°4");
            par4 = Double.parseDouble(sc.nextLine());

//suma de notas  
            double notaLab = (lab1 + lab2 + lab3 + lab4) / 4;
            double notaPar = (par1 + par2 + par3 + par4) / 4;
            System.out.println("-------------------------------");
            System.out.println("nombre del alumno: \n" + nombre);
            System.out.println("nota final laboratorios: " + notaLab);
            System.out.println("nota final parciales: " + notaPar);
//promedio de alumno 
            prmedioFinal(notaLab, notaPar);
            System.out.println("-------------------------------");
        }
//impresion de alumnos aprobados o reprobados 
        System.out.println("Alumnos aprobados:  " + apro);
        System.out.println("Alumnos reprobados: " + repro);

    }

//metodo para calcular
    public static void prmedioFinal(double lab, double par) {

        double fin;
        fin = (lab * 0.4) + (par * 0.6);
        System.out.println("***************\nPromedio Final: \n" + fin);
        if (fin >= 6.0) {
            System.out.println("Aprobado\n********");
            apro += 1;
        } else {
            System.out.println("******\nReprobado\n******");
            repro += 1;
        }

    }
}
/* En la Universidad Francisco Gavidia se realizan 4 laboratorios y 4 parciales 
en cada asignatura. Los 4 laboratorios forman el 40% de la nota final y los 4 
parciales forman el 60% de la nota final. Escribir un programa en Java que 
solicite ingresar las notas de 10 estudiantes y nos muestre cuántos tienen 
notas mayores o iguales a 6.0 y cuántos menores a 6.0, es decir están
reprobados.
Ejemplo: Estudiante Brad Pitt
Lab1=8, Lab2=9, Lab3=7 y Lab4=7.5 Calculo: (8+9+7+7.5)/4*0.4 (Promedio 1)
Par1=9, Par2=8, Par3=7 y Par4=8.5 Calculo: (9+8+7+8.5)/4*0.6 (Promedio 2)
Nota final: Promedio1 + Promedio2
El programa deberá de hacer los cálculos para 10 estudiantes utilizando 
repeticiones.*/

// si funciona y respeto los camel case, a si que no chinges
//a ver repruebame >:{/
