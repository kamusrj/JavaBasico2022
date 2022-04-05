package Ejercicios03;

import javax.swing.JOptionPane;

/*
 * @author Kamus
 */
public class FechaNacimientoNit {

    /*El número de NIT de un contribuyente está compuesto por 14 números, por 
ejemplo 06143010801102. Nos piden crear un programa que reciba vía teclado 
un número de NIT de un contribuyente y que el programa imprima la fecha de 
nacimiento separada por /. Deberá de utilizar el método substring de la clase 
String.*/

    public static void main(String[] args) {
//Declara variable 
        String nit;
// javax.swimg para cuadro de dialogo que solicita la informacion
        nit = JOptionPane.showInputDialog(" ***** Bienvenido al sistema ***** \nPara mostrar fecha de nacimineto\ndigite su numero de nit completo");
//Cuadro de dialogo con el resultado 
// para el salto de linea en un solo cuadro de dialogo se usa "\n" * pleca invertida = alt+92 
        JOptionPane.showMessageDialog(null, "N° de nit:\n" + nit + "\n\nFecha de nacimiento:\n" + "Dia/Mes/Año\n"
                + nit.substring(4, 6) + " / " + nit.substring(6, 8)
                + " / " + nit.substring(8, 10));

    }

}
