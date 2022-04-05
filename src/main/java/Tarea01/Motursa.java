package Practica01;

/*
 * @author Kamus
 */
public class Motursa {

    public static void main(String[] args) {
/* La empresa Motursa S.A. de C.V. adquirió el 2 de febrero del presente año 
un activo por $12,000. Se estima que este activo tendrá una vida útil de 5 
años. El cálculo de la depreciación anual es el siguiente: 

Depreciación anual = $12,000 / 5 = $2400 por año.
La depreciación en el primer año es 12,000 – 2400 = 9,600
La depreciación en el primer año es 9,600 – 2400 = 7,200
La depreciación en el primer año es 7,200 – 2400 = 4,800
La depreciación en el primer año es 4,800 – 2400 = 2,400
La depreciación en el primer año es 2,400 – 2400 = 0

Utilizando únicamente variables desarrollar el ejercicio planteado*/

        double prestamo = 12000.00;
        double cuota = prestamo / 5;
        double total = 0;

        System.out.println("*** Prestamos inicial $"+prestamo+" ****");
        prestamo = prestamo - cuota;
        total = prestamo;
        System.out.println("La depreciación en el primer año  es: $" + total);
        prestamo = prestamo - cuota;
        total = prestamo;
        System.out.println("La depreciación en el segundo año es: $"+ total);
        prestamo = prestamo - cuota;
        total = prestamo;
        System.out.println("La depreciación en el tercer año  es: $"+ total );
        prestamo = prestamo - cuota;
        total = prestamo;
        System.out.println("La depreciación en el cuarto año  es: $"+ total);
        prestamo = prestamo - cuota;
        total = prestamo;
        System.out.println("La depreciación en el quinto año  es: $" +total);

        /* for (int i = 1; i < 6; i++) {
            saldo = prestamo - descuento;

            System.out.println("el saldo del año n°" + i + " es de : $" + saldo);
            System.out.println("prestamo es : $" + prestamo);
            prestamo = saldo;
        }*/
    }
}
