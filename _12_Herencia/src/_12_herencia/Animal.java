package _12_herencia;
public class Animal { //Superclase
    
    //Atributos de la superclase
    protected String nombre;
    protected int id;
    protected int edad;

    // Constructor de la superclase
    public Animal(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }
       
    // Metodos de la superclase
    public void comer(){
        System.out.println("El animal esta comiendo");
    }
    
}
