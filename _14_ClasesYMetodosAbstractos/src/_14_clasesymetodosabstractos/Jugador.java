package _14_clasesymetodosabstractos;
public abstract class Jugador { //Superclase que no se puede instanciar
    
    //Atributos
    protected String nombre;
    protected int edad;
    
    // Metodos
    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Metodos abstractos}
    public abstract void jugar();
    
}
