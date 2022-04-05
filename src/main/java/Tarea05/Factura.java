/*
 * Codigo Curso Insafor 2022 java basico
 * Autor Kamus
 */
package Tarea05;

import javax.swing.JOptionPane;

/**
 *
 * @author Kamus
 */
public class Factura {

    public static void main(String[] args) {

        FacturaElectrica fe = new FacturaElectrica();

        String dt = "";

        dt = JOptionPane.showInputDialog("Ingrese numero de cuenta");
        fe.setNoCuenta(dt);

        dt = JOptionPane.showInputDialog("Ingrese Lectura Actual");
        fe.setLecturaActual(Integer.parseInt(dt));

        dt = JOptionPane.showInputDialog("Ingrese Lectura Anterior");
        fe.setLecturaAnterior(Integer.parseInt(dt));

        JOptionPane.showMessageDialog(null, fe.data());
        fe.data();

    }
    /*Crear la clase Factura Eléctrica utilizando ENCAPSULAMIENTO con las siguientes 
características:
Atributos:
No Cuenta
Lectura actual del medidor
Lectura anterior del medidor
Multiplicador
Consumo Mensual
Consumo Diario
Valor Factura
Métodos:
Crear un método para calcular el Consumo en el mes *-
Crear un método para calcular el Consumo Diario *-
Crear un método para calcular el Valor Factura*-
Imprimir Todos los Atributos*-

Ejemplo del cálculo:
Lectura Anterior: 2010 Lectura Actual: 3025
Multiplicador: 10 Días de facturación: 30
Consumo: (lectura actual - lectura anterior) x el multiplicador
Consumo = (3025kWh 2010kWh) * 10 = 10150kWh
Valor factura = Consumo * 0.20

Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas*-
*/
}
