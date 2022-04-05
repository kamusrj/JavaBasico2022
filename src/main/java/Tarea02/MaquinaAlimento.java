package Practica02;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * @author Kamus
 */
public class MaquinaAlimento {

    /* Para importar una máquina de procesamiento de alimentos, la dirección de 
aduanas cobra el 10% de impuesto sobre el valor de la maquinaria. menos el 
valor del costo del flete para transportar la maquinaria desde estados unidos 
a el salvador menos el valor del seguro pagado para asegurar que la maquina 
ingrese a territorio nacional, por lo general el 5% del valor dela máquina. La 
fórmula queda así: DAI = (valor de la máquina – flete – seguro) * 10%. Al 
valor resultante hay que calcularle el valor del IVA que es el 13% del valor 
del DAI.
Si estamos importando una máquina que cuesta $10,000, hemos pagado por 
el flete $500. ¿Cuánto es el valor del DAI y del IVA?
     */

    public static void main(String[] args) {
        double maquina = 10000.00;
        double seguro = maquina * 0.05;
        double flete = 500.00;
        double dai = CalculoDai(maquina, flete, seguro);
        double iva = CalcularIva(dai);
        
        NumberFormat formato = new DecimalFormat("0.00");
        
        System.out.println("*** Calculo de DAI e IVA ***");
        System.out.println("Precio del producto: $" + maquina);      
        System.out.println(" "); 
        System.out.println("Valor del DAI: $" + formato.format(dai));
        System.out.println(" ");
        System.out.println("Valor del IVA: $" + formato.format(iva));
      
        
    }
    
    public static double CalculoDai(double maquina, double flete, double seguro) {
        double dai;
        dai = (maquina - flete - seguro) * 0.10;
        return dai;
    }
    
    public static double CalcularIva(double dai) {
        double iva;
        iva = dai * 0.13;
        return iva;
    }
    
}
