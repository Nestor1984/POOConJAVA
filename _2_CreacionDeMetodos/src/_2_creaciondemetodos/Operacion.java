package _2_creaciondemetodos;

import java.util.Scanner;

public class Operacion {
      
    int primerNumero;
    int segundoNumero;
    int suma;
    int resta;
    int multiplicacion;
    
    public void pedirNumeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.print("Digite el primer numero: ");
        primerNumero = teclado.nextInt();
        
        System.out.print("Digite el segundo numero: ");
        segundoNumero = teclado.nextInt();        
    }
    
    public void mostrarMenu(){
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println("1. Sumar numeros");
        System.out.println("2. Restar numeros");
        System.out.println("3. Multiplicar numeros");
        System.out.print("Digite una opcion: ");
        opcion = teclado.nextInt();
        
        switch(opcion){
            case 1:
                pedirNumeros();
                sumarNumeros();
                break;
            case 2:
                pedirNumeros();
                restarNumeros();
                break;
            case 3:
                pedirNumeros();
                multiplicarNumeros();
                break;
            default:
                System.out.println("");
                System.out.println("Opcion no disponible");
                break;
        }
    }
    
    public void sumarNumeros(){
        suma = primerNumero + segundoNumero;
        System.out.println("");
        System.out.println("La suma de los numeros es: " + suma);
    }
    
    public void restarNumeros(){
        resta = primerNumero - segundoNumero;
        System.out.println("");
        System.out.println("La resta de los numeros es: " + resta);
    }
    
    public void multiplicarNumeros(){
        multiplicacion = primerNumero * segundoNumero;
        System.out.println("");
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
    }
    
}
