package Practica02;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * @author Kamus
 */
public class HorasExtras {

/*Un trabajador de la industria de la construcción gana $10 diarios en su 
jornada normal de trabajo. En ciertas ocasiones el empleado tiene que 
trabajar horas extras para cumplir con su trabajo. En el mes a acumulado 50 
horas extras que se la pagan al 10% del valor del pago diario. ¿Cuánto 
ganara el trabajador al final de un mes de trabajo?. Tomar en consideración 
que al trabajador le descontaran el 10% en concepto de renta*/
    public static void main(String[] args) {

        double salario = 10.00 * 30;
        double horas = 1.00 * 50;
        double descuento = salario * 0.10;
        double total = salarioNeto(horas, salario,descuento);

        NumberFormat formato = new DecimalFormat("0.00");

        System.out.println("**** Calculo de horas *****");
        System.out.println("salario base: $" + salario);
        System.out.println("Descuento de renta: -$" + descuento);
        System.out.println("Horas extras: " + horas);
        System.out.println(" ");
        System.out.println("Total Salario más horas extras : $" + formato.format(total));

    }

    public static double salarioNeto(double horas, double salario,double descuento) {
        double SalarioNeto;
        SalarioNeto = horas + (salario - descuento);
        return SalarioNeto;
    }

}

