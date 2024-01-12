package _15_polimorfismo;
public class Perro extends Animal{

    public Perro(String nombre, int edad, int tamanio) {
        super(nombre, edad, tamanio);
    }

    // Hacemos polimorfismo, sobreescribiendo el metodo de la superclase
    @Override
    public void realizarSonido() {
        System.out.println("El perro " + nombre + " tiene " + edad + " anios y mide " + tamanio);
        System.out.println("El perro dice gua gua gua !!!");
    }
    
    
    
}
