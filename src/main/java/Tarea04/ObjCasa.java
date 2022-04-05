/*
 * Codigo Curso Insafor 2022 java basico
 * Autor Kamus
 */
package Ejercicios04;

/**
 *
 * @author Kamus
 */
public class ObjCasa {

    String noCasa;
    int noPasaje;
    String nCalle;

//constructor
    public ObjCasa(String noCasa, int noPasaje, String nCalle) {
        this.noCasa = noCasa;
        this.noPasaje = noPasaje;
        this.nCalle = nCalle;
    }

//metodo info
    public String datoCasa() {
        String datos = "";
        datos += "Numero de Casa: \n" + noCasa + "\n";
        datos += "Numero del pasaje: \n" + noPasaje + "\n";
        datos += "Nombre de la calle \n" + nCalle + "\n";
        return datos;
    }

}
