package _7_encapsulamiento;

import java.util.Scanner;

public class _7_Encapsulamiento {
    public static void main(String[] args) {
        
        // Private: encapsula.
        Scanner teclado = new Scanner(System.in);
        Persona persona = new Persona();
        
        System.out.print("Digite el nombre: ");
        persona.setNombre(teclado.next());
        
        System.out.print("Digite la edad: ");
        persona.setEdad(teclado.nextInt());
        
        System.out.print("Digite su altura: ");
        persona.setAltura(teclado.nextDouble());
        
        System.out.println("\nEl nombre es: " + persona.getNombre());
        System.out.println("La edad de " + persona.getNombre() + " es " + persona.getEdad());
        System.out.println("La altura es: " + persona.getAltura());
    }
}
