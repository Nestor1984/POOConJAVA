
package _2_aritmetica;

import _2_excepciones.OperacionAritmetica;

public class Division {
    
    public static int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            // throw: sirve para lanzar una excepcion
            throw new OperacionAritmetica("Error al dividir entre cero"); // voy a lanzar una nueva excepcion personalizada. (ENVIAMOS EL MSJ QUE QUEREMOS QUE TENGA LA EXCEPCION A LA CLASE OPERACION ARITMETICA)
        }
        return numerador/denominador;
    }
   
    /*
    public static int dividir(int numerador, int denominador) throws OperacionAritmetica{ //throws OperacionAritmetica: indica que hay una excepcion de tipo OperacionAritmetica 
        if (denominador == 0) {
            // throw: sirve para lanzar una excepcion
            throw new OperacionAritmetica("Error al dividir entre cero"); // voy a lanzar una nueva excepcion personalizada. (ENVIAMOS EL MSJ QUE QUEREMOS QUE TENGA LA EXCEPCION A LA CLASE OPERACION ARITMETICA)
        }
        return numerador/denominador;
    }
    */
}
