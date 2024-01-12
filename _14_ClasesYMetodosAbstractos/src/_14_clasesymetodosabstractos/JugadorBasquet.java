package _14_clasesymetodosabstractos;
public class JugadorBasquet extends Jugador {

    // Constructor especial
    public JugadorBasquet(String nombre, int edad) {
        super(nombre, edad);
    }

    //Sobreescribiendo el metodo abstracto de la superclase
    @Override
    public void jugar() {
        System.out.println("El jugador de basquet " + nombre + " tiene " + edad + " anios");
        System.out.println("Esta en el campo saltando con el balon");
    }
    
}
