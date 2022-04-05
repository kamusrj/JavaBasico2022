/*
 * Kamus Curso java Insafor 2022
 */
package Tarea06;

import javax.swing.JOptionPane;

/*
 * @author Kamus
 */
public class Calculadora {

    /* Crear un programa que simule el funcionamiento de una calculadora que 
pueda realizar las cuatro operaciones aritméticas básicas (suma, resta, 
multiplicación y división) con valores numéricos enteros. El usuario debe 
especificar la operación a realizar, por ejemplo: S para la suma, R para la 
resta, M para la multiplicación y D para la división. Primero se debe de 
ingresar el primer valor, luego el operador y finalmente el segundo valor. 
Nota: Se recomienda el empleo de la sentencia switch.*/
    public static void main(String[] args) {
        int n1;
        int n2;
        char operado;
        String dt = "";

        dt = JOptionPane.showInputDialog(" ingrese primer numero ");
        n1 = Integer.parseInt(dt);
        dt = JOptionPane.showInputDialog(" ****  Ingres la operacion a realizar  **** \n"
                + "\nSuma                = 'S'"
                + "\nResta                = 'R'"
                + "\nMultiplicacion = 'M' "
                + "\nDivision             = 'D' ");
        operado = dt.toUpperCase().charAt(0);
        dt = JOptionPane.showInputDialog("ingrese segundo numero");
        n2 = Integer.parseInt(dt);

        calculadora(operado, n1, n2);

    }

    public static void calculadora(char operador, int n1, int n2) {
        int resultado;
        switch (operador) {
            case 'S':

                resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "La suma es :" + resultado);
                break;
            case 'R':
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "La resta es :" + resultado);

                break;
            case 'M':
                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "La division es :" + resultado);
                break;
            case 'D':
                if (n1 != 0 && n2 != 0) {
                    resultado = n1 / n2;
                    JOptionPane.showMessageDialog(null, "La Division  es :" + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "La Division no se puede realizar entre Zero :");
                }
                break;
            default:

        }

    }
}
