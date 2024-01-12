package _15_polimorfismo;
public class Gato extends Animal{

    public Gato(String nombre, int edad, int tamanio) {
        super(nombre, edad, tamanio);
    }

    // Hacemos polimorfismo, sobreescribiendo el metodo de la superclase
    @Override
    public void realizarSonido() {
        System.out.println("El gato " + nombre + " con la edad de " + edad + " anios mide " + tamanio);
        System.out.println("El gato dice miau miau miau");
    }
    
}
