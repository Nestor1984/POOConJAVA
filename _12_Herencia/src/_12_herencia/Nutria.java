package _12_herencia;

public class Nutria extends Animal { //Subclase

    /*
    extends: dice que estamos heredando atributos y metodos de la superclase
    Ejm: Subclase extends Superclase
     */
    
    // Constructor de la subclase
    public Nutria(String nombre, int id, int edad) {
        super(nombre, id, edad); // super(): con super() invocamos al constructor de la superclase
    }
    
    // Metodos heredados
    @Override // @Override: es una annotacion que hace referencia a que voy transcribir o sobreescribir un metodo de la clase padre, un metodo que estoy heredando
    public void comer() {
        System.out.println("La nutria come peces");
        System.out.println("El nombre de la nutria es: " + super.nombre); // super. : con super. hacemos referencia a los atributos o metodos de la superclase
        System.out.println("El id de la nutria es: " + super.id);
        System.out.println("La edad de la nutria es: " + super.edad);
    }

    // Metodos propios de la subclase
    public void nadar(){
        System.out.println("La nutria esta nadando");
    }
}
