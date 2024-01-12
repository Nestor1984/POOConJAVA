package _14_clasesymetodosabstractos;
public class JugadorFutbol extends Jugador{ // Cuando heredamos de una clase abstracta, obligatorimente debemos crear el constructor especial si hay atributos en la superclase asbtracta y sobreescribir el metodo abstracto de la superclase

    // Constructor especial
    public JugadorFutbol(String nombre, int edad) {
        super(nombre, edad);
    }

    //Sobreescribiendo el metodo abstracto de la superclase
    @Override
    public void jugar() {
        System.out.println("El jugador de futbol " + nombre + " tiene " + edad + " anios");
        System.out.println("Este jugador esta en la cancha pateando el balon");
    }
    
}
