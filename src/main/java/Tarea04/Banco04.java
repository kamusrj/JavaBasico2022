/*
 * Codigo Curso Insafor 2022 java basico
 * Autor Kamus
 */
package Ejercicios04;

import java.text.NumberFormat;
import java.text.DecimalFormat;


/*
 * @author Kamus
 */
public class Banco04 {

    String cliente;
    double inversion;
    int meses;
    double interes;

    NumberFormat nf = new DecimalFormat("#,##0.00");

    public Banco04(String cliente, double inversion, int meses, double interes) {
        this.cliente = cliente;
        this.inversion = inversion;
        this.meses = meses;
        this.interes = interes;
    }

    public double CalculoInteres() {
        double calculo;
//porsenta de la inversion
        calculo = inversion * 0.03;
//se divide el porsentaje de la inversion entre 12 para sacar valor de un mes
        calculo = calculo / 12;
//se multiplica entre los meses
        calculo = calculo * meses;
        return calculo;
    }

    public String Datos() {
        String data = "";

        data += "El nombre del usuario es:\n" + cliente + "\n";
        data += "La inversion es:\n$" + nf.format(inversion) + "\n";
        data += "Ganancia:\n$" + nf.format(CalculoInteres());
        return data;
    }

}
