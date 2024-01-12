package _15_polimorfismo;
public class Loro extends Animal{

    public Loro(String nombre, int edad, int tamanio) {
        super(nombre, edad, tamanio);
    }

    // Hacemos polimorfismo, sobreescribiendo el metodo de la superclase
    @Override
    public void realizarSonido() {
        System.out.println("El loro " + nombre + " tiene " + edad + " anios y mide " + tamanio);
        System.out.println("El loro dice cri cri cri");
    }
    
}
