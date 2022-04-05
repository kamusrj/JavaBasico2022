/*
 * Kamus Curso java Insafor 2022
 */
package Tarea06;

import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/*
 * @author Kamus
 */
public class CompuSmart {

    /* La empresa Compu Smart se dedica a la venta de equipos de computación. 
Vende tanto computadoras como dispositivos periféricos y consumibles. La 
empresa cuenta con un grupo de 5 vendedores a los cuales les paga la 
comisión según el rango de la venta efectuada. Si el vendedor vende de 
$3000 en adelante la comisión es el 10%, si vende de $1000 a $2999 gana 
el 8% y si la venta es de 1$ a $999 gana un 5%. Pero cada vendedor tiene 
un salario base de $300 al cual se le suma el valor de la comisión por ventas. 
Determinar el salario líquido de un vendedor según el monto de la venta 
realizada tomando en cuenta que se descuenta el 10% en concepto de renta.*/
    public static void main(String[] args) {

        double venta;
        double salario = 300.00;

        String data;
        data = JOptionPane.showInputDialog("Ingrese venta efectuada");
        venta = Integer.parseInt(data);
        calculoComision(venta, salario);

    }

    public static void calculoComision(double venta, double salario) {
        NumberFormat nf = new DecimalFormat("###,##0.00");
        double comision;
        if (venta >= 3000) {

            comision = venta * 0.10;
            salario += comision;
            salario -= (salario * 0.10);
            JOptionPane.showMessageDialog(null, "Salario neto : $" + nf.format(salario));

        } else if (venta <= 2999 && venta >= 1000) {

            comision = venta * 0.08;
            salario += comision;
            salario -= (salario * 0.10);
            JOptionPane.showMessageDialog(null, "Salario neto : $" + nf.format(salario));

        } else if (venta <= 999 && venta >= 1) {
            comision = venta * 0.05;
            salario += comision;
            salario -= (salario * 0.10);
            JOptionPane.showMessageDialog(null, "Salario neto : $" + nf.format(salario));

        } else {

            JOptionPane.showMessageDialog(null, "valor de venta 0");

        }
    }
}
