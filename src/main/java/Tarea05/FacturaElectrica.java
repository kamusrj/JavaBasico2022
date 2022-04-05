/*
 * Codigo Curso Insafor 2022 java basico
 * Autor Kamus
 */
package Tarea05;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * @author Kamus
 */
public class FacturaElectrica {

    private String NoCuenta;
    private int lecturaActual;
    private int lecturaAnterior;

    private int multiplicador = 10;
    private int consumoMensual;
    private int consumoDiario;
    private double valorFactura;

    NumberFormat nf = new DecimalFormat("###,##0.00");

    public FacturaElectrica() {

    }

    public String getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(String NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public int getLecturaActual() {
        return lecturaActual;
    }

    public void setLecturaActual(int LecturaActual) {
        this.lecturaActual = LecturaActual;
    }

    public int getLecturaAnterior() {
        return lecturaAnterior;
    }

    public void setLecturaAnterior(int LecturaAnterior) {
        this.lecturaAnterior = LecturaAnterior;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int Multiplicador) {
        this.multiplicador = Multiplicador;
    }

    public int getConsumoMensual() {
        return consumoMensual;
    }

    public void setConsumoMensual(int ConsumoMensual) {
        this.consumoMensual = ConsumoMensual;
    }

    public int getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(int ConsumoDiario) {
        this.consumoDiario = ConsumoDiario;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double ValorFactura) {
        this.valorFactura = ValorFactura;
    }

//consumo mes 
    public int calculoMes() {
        consumoMensual = lecturaActual - lecturaAnterior;
        return consumoMensual;
    }

//consulmo diario
    public int calculoDiario() {
        consumoDiario = 0;
        consumoDiario = calculoMes() / 30;
        return consumoDiario;
    }
//facturacion

    public double factura() {
        valorFactura = (consumoMensual * multiplicador) * 0.20;
        return valorFactura;
    }

    public String data() {
        String msj = "";
        msj += "Numero de cuenta: \n" + NoCuenta + "\n";
        msj += "lectura anterior: \n" + lecturaAnterior + "\n";
        msj += "lectura actual: \n" + lecturaActual + "\n";
        msj += "Multiplicador: \n" + multiplicador + "\n";
        msj += "consumo mensual: \n" + this.calculoMes() + "\n";
        msj += "consumo diario: \n" + this.calculoDiario() + "\n";
        msj += "factua final: \n$" + nf.format(this.factura()) + "\n";
        return msj;
    }
}
