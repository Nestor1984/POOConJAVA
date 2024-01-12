package _1_try_catch_finally;

import java.util.Scanner;

public class TestExcepciones {

    public static void main(String[] args) {
        /*
        Excepciones: existen muchas clases de Excepciones ya creadas en el API de JAVA,
        pero nosotros podemos crear nuestras propias clases de excepcion.
        
        -Throwable
        -Exception
        1.- IOException: Excepciones verificadas. (Errores que no dependen del desarrollador)
        -FileNotFoundException
        -EOFException
        
        2.- RuntimeException: Excepciones no verificadas. (Errores del desarrollador)
        -ArithmeticException
        -NullPointerException
         */

        // Ejemplo 1: excepciones no verificadas
        // Dividir un numero entre 0
        int primerNumero = 10;
        int segundoNumero = 0;

        try { // Voy a tratar de hacer algo
            int division = primerNumero / segundoNumero;
            System.out.println("La division es: " + division);
        } catch (Exception e) { // Si hay un error que me capture una excepcion
            System.out.println("Ocurrio una excepcion");
            System.out.println("Excepcion: " + e.getMessage()); // getMessage(): te devuelve la excepcion
            e.printStackTrace(System.out); // Esto te imprime una pila de excepciones detalladamente
        }

        // Ejemplo 2: excepciones no verificadas
        // Ingresar un tipo de dato diferente
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        try { // tratamos
            System.out.print("Digite un valor: ");
            valor = teclado.nextInt();
            
            System.out.println("El valor es: " + valor);
        } catch (Exception e) { // si no capturamos la excepcion
            System.out.println("Ocurrio una excepcion");
            e.printStackTrace(System.out); // Esto te imprime una pila de excepciones detalladamente
        } finally{ // esto se ejecuta finalmente 
            System.out.println("Cerramos el programa");
        }
    }
}
