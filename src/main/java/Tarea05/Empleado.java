/* Codigo Curso Insafor 2022 java basico
 * Autor Kamus
 */
package Tarea05;

import java.text.NumberFormat;
import java.text.DecimalFormat;

/*
 * @author Kamus
 */
public class Empleado {

    private int NoNit;
    private String apellido;
    private String nombre;
    private String direccion;
    private double salarioDevengado;
    private double salarioConDescuento;
    private String BanderaDeEmpleado;

    NumberFormat nf = new DecimalFormat("#,##0.00");

    public Empleado() {
    }

    public String getBanderaDeEmpleado() {
        return BanderaDeEmpleado;
    }

    public void setBanderaDeEmpleado(String BanderaDeEmpleado) {
        this.BanderaDeEmpleado = BanderaDeEmpleado;
    }

    public int getNoNit() {
        return NoNit;
    }

    public void setNoNit(int NoNit) {
        this.NoNit = NoNit;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalarioDevengado() {
        return salarioDevengado;
    }

    public void setSalarioDevengado(double salarioDevengado) {
        this.salarioDevengado = salarioDevengado;
    }

    public double getSalarioConDescuento() {
        return salarioConDescuento;
    }

    public void setSalarioConDescuento(double salarioConDescuento) {
        this.salarioConDescuento = salarioConDescuento;
    }

//metodo  nombre apellido cliemte
    public String dataEmp() {
        String dato = "";
        dato = nombre + " " + apellido;
        return dato;
    }
//metodo calcular descuento

    public double calculoDescuento() {
        salarioDevengado -= salarioDevengado * 0.10;
        return salarioDevengado;
    }


    public String datos() {
        String datos = "";
        datos += "Numero de Nit: \n" + this.NoNit + "\n";
        datos += "Nombre del empleado: \n" + dataEmp() + "\n";
        datos += "Direccion: \n" + this.direccion + "\n";
        datos += "Salario Devengado: \n$" + nf.format(this.salarioDevengado) + "\n";
        datos += "Salario Con desucento: \n$" + nf.format(calculoDescuento()) + "\n";
        datos += "Bandera de Empleado: \n" + this.BanderaDeEmpleado;
        return datos;
    }
}