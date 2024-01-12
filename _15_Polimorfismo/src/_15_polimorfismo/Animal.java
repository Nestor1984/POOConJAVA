package _15_polimorfismo;
public abstract class Animal { //Superclase abstracta
    
    protected String nombre;
    protected  int edad;
    protected  int tamanio;

    public Animal(String nombre, int edad, int tamanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    
    public abstract void realizarSonido();
    
}
