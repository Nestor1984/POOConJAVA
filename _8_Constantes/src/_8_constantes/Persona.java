package _8_constantes;
public class Persona {
    
    // final: palabra en JAVA para constantes
    private int edad = 20;
    private final String nombre = "Nestor";
    
    public void saludar(){
        System.out.println("Hola, mi nombre es " + this.nombre + ", mi edad es " + this.edad);
    }
    
}
