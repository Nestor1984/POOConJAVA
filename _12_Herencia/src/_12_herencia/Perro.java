package _12_herencia;
public class Perro extends Animal{ //Subclase
    
    // Atributos de la subclase
    public String colorPelo;

    // Constructor de la subclase
    public Perro(String nombre, int id, int edad, String colorPelo) {
        super(nombre, id, edad); //Cargamos los atributos de la superclase
        this.colorPelo = colorPelo; //Cargamos los atributos de la subclase
    }   

    // Metodos heredados
    @Override
    public void comer() {
        System.out.println("El perro come ricocan");
        System.out.println("El nombre del perro es: " + nombre); 
        System.out.println("El id del perro es: " + id);
        System.out.println("La edad del perro es: " + edad);
        System.out.println("El color del pelo del perro es: " + colorPelo);
    }
    
    // Metodos propios de la subclase
    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
    
}
