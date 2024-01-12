
package _2_excepciones;

// Clase para crear nuestras propias excepciones
public class OperacionAritmetica extends RuntimeException{ // va heredar de RuntimeException
    
    // Constructor especial
    public OperacionAritmetica(String mensaje){
        super(mensaje);
    }
    
}
