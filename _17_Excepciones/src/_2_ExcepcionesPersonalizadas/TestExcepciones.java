
package _2_ExcepcionesPersonalizadas;

import _2_aritmetica.Division;
import _2_excepciones.OperacionAritmetica;

public class TestExcepciones {

    public static void main(String[] args) {
        
        int resultado = 0;
        
        try {
            resultado = Division.dividir(10, 0);
        } catch (OperacionAritmetica e) {
            e.printStackTrace(System.out);
        } finally{
            System.out.println("Fin del programa");
        }
        
        System.out.println("Resultado: " + resultado);
    }
    
}
