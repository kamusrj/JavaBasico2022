/*
 * Codigo Curso Insafor 2022 java basico
 * Autor Kamus
 */
package Tarea05;

import javax.swing.JOptionPane;

/*
 * @author Kamus
 */
public class EmpleadoTesting {

    public static void main(String[] args) {
        Empleado e = new Empleado();

        String dr;

        dr = JOptionPane.showInputDialog("ingrese el numero de nit");
        e.setNoNit(Integer.parseInt(dr));
        dr = JOptionPane.showInputDialog("ingrese nombre");
        e.setNombre(dr);
        dr = JOptionPane.showInputDialog("ingrese apellido");
        e.setApellido(dr);
        dr = JOptionPane.showInputDialog("ingrese direccion");
        e.setDireccion(dr);
        dr = JOptionPane.showInputDialog("ingrese salario");
        e.setSalarioDevengado(Double.parseDouble(dr));
        dr = JOptionPane.showInputDialog("ingrese Bandera de Empleado");
        e.setBanderaDeEmpleado(dr);

        JOptionPane.showMessageDialog(null, " *** Resultados *** \n" + e.datos());

        JOptionPane.showMessageDialog(null, " *** Nombre completo *** \n" + e.dataEmp());
    }
}
/*.
Crear la clase Empleado utilizando ENCAPSULAMIENTO con las siguientes características:
Atributos:

No Nit
Apellidos 
Nombres 
Dirección
Salario Devengado
Salario Con Descuento
Bandera de Empleado Activo o Inactivo

Métodos:
Crear un método para calcular el Salario con Descuento que es Salario Devengado – Descuento 
del 10% de Renta
Crear un método para Imprimir el Nombre Completo del Contribuyente
Imprimir Todos los Atributos
Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas.*/
