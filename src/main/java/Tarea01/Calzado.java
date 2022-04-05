package Practica01;

/**
 * @author Kamus
 */
public class Calzado {

 /* En una empresa de calzado se aplican los siguientes descuentos al sueldo 
base de cada uno de sus empleados: renta 10%. Afp 7.25%. Seguro social 
3%. Desarrollar el programa que asigne el sueldo base en una variable de un 
empleado y que determine los descuentos y el sueldo neto a pagar.
*/
    public static void main(String[] args) {

        double salario = 360.45;
        double renta = (salario * 10) / 100;
        double afp = (salario * 7.25) / 100;
        double sSocial = (salario * 3) / 100;
        double desTotal = renta + afp + sSocial;
        double total = salario - desTotal;

        System.out.println("***  Descuentos ***");
        System.out.println("Salario : $"+salario);
        System.out.println("Renta: $"+renta);
        System.out.println("AFP : $" +afp );
        System.out.println("Seguro Social  : $ "+ sSocial);
        System.out.println("Descuento total  : $"+desTotal);
        System.out.println("***   Salario Total ***");
        System.out.println("Salario Neto : $"+total );
    }

}
