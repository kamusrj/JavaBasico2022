/*
 * Codigo Curso Insafor 2022 java basico
 * Autor Kamus
 */
package Ejercicios04;

import javax.swing.JOptionPane;

/**
 *
 * @author Kamus
 */
public class TestBanco04 {

    /*Modelar una clase que calcule cuanto le dará su banco después de realizar un 
depósito a plazo fijo. Para ello el programa debe pedir el nombre del cliente y la 
cantidad que desea invertir en el banco, el interés anual que le pagará el banco 
por el dinero (ejemplo 3%) y el plazo de la inversión (De 1 a 12 meses). El 
programa debe de calcular el dinero que se obtiene después de un año o en el 
mes que el usuario requiera recuperar su inversión (divida el interés entre 12 y 
multiplíquelo por el número de meses). El programa deberá imprimir el nombre 
del cliente, el monto invertido y la ganancia obtenida*/
    public static void main(String[] args) {
        Banco04 bc = new Banco04("", 0, 0, 0);

        String dato;

        dato = JOptionPane.showInputDialog("Ingres su nombre");
        bc.cliente = dato;
        dato = JOptionPane.showInputDialog("Ingres Monto a invertir");
        bc.inversion = Double.parseDouble(dato);
        dato = JOptionPane.showInputDialog("Ingrese a cuantos meses");
        bc.meses = Integer.parseInt(dato);

        JOptionPane.showMessageDialog(null, " **** Resultados **** \n" + bc.Datos());

    }
}
