/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteExtra;
import _6_modificadoresdeacceso.Modificadores; // Es importante importar el paquete, para llamar a la clase
public class ArchivoExtra {

    public static void main(String[] args) {
        
        Modificadores persona = new Modificadores(30, "Maria");
        
        int edad = persona.edad = 18;
        String nombre = persona.nombre = "Mariel";
        
        System.out.println(edad + " - " + nombre);
        
    }
    
}
