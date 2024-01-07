package _1_ParametrosYArgumentos;

import java.util.Scanner;

public class Edad {

    public static void main(String[] args) {
        /*
        Parametros: es una declaracion de variable
        Argumentos: es un valor que se envia
         */
        Scanner teclado = new Scanner(System.in);
        Persona persona = new Persona();
        int edad;
        float altura;
        String nombre;

        System.out.print("Digite su edad: ");
        edad = teclado.nextInt();

        System.out.print("Digite su nombre: ");
        nombre = teclado.next();

        System.out.print("Digite su altura: ");
        altura = teclado.nextFloat();

        persona.comprobarSiEsMayorDeEdad(edad, nombre, altura);

    }

}
