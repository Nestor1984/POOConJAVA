package _15_polimorfismo;
public class _15_Polimorfismo {

    public static void main(String[] args) {
        
        /*
        Polimorfismo: significa "muchas formas"
        poli = "muchas" y morfismo = "formas"
        Ejm: Loro, Perro y Gato.
        realizarSonido()
        Todos los animales realizan un sonido pero de 
        diferente manera, osea de muchas formas.
        */
        
        // NOTA: En JAVA cuando hablamos de polimorfismo, podemos almacenar objetos de las subclases en variables de tipo superclase, (PERO TEN EN ENCUENTA QUE NO PODEMOS HACERLO AL REVES) 
        Animal perro = new Perro("Boby", 5, 1);
        perro.realizarSonido();
        
        System.out.println("");
        
        Animal gato = new Gato("Misha", 3, 1);
        gato.realizarSonido();
        
        System.out.println("");
        
        Animal loro = new Loro("Jaime", 2, 1);
        loro.realizarSonido();
        
    }
    
}
