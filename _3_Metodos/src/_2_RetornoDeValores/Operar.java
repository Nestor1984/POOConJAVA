package _2_RetornoDeValores;

import java.util.Scanner;

public class Operar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Numeros numero = new Numeros();
        int primerValor;
        int segundoValor;
        int tercerValor;

        System.out.print("Digite el primer valor: ");
        primerValor = teclado.nextInt();

        System.out.print("Digite el segundo valor: ");
        segundoValor = teclado.nextInt();

        System.out.print("Digite el tercer valor: ");
        tercerValor = teclado.nextInt();
        
        int mayor = numero.calcularMayorNumero(primerValor, segundoValor, tercerValor);
        int menor = numero.calcularMenorNumero(primerValor, segundoValor, tercerValor);
    
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }

}
