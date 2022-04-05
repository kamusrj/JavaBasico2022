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
public class TestCasa {

/*Modelar una clase Casa con los atributos número de casa, numero de pasaje y 
nombre de la calle. El número de la casa debe ser alfanumérico para contemplar 
las casas que tengan números como “27A”). Cuando la casa se crea se asigna 
tanto el número de la casa, el número de pasaje y la calle. La clase tiene que 
tener definido un método para imprimir los valores asignados*/

    public static void main(String[] args) {
        ObjCasa casa = new ObjCasa("", 0, "");

        casa.noCasa = JOptionPane.showInputDialog("Ingrese el numero de la casa:\n");
        casa.noPasaje = Integer.parseInt(JOptionPane.showInputDialog("ingrese Numero del pasaje:\n"));
        casa.nCalle = JOptionPane.showInputDialog("Ingrese nombre de la calle:\n ");

        JOptionPane.showMessageDialog(null, "**** Resultados ****\n\n" + casa.datoCasa());

    }
}
