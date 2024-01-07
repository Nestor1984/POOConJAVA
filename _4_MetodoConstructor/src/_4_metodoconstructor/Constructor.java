package _4_metodoconstructor;
public class Constructor {
    
    int edad;
    float altura;
    String nombre;
    
    // this: hace referencia a los atributos de la clase
    // Metodo constructor
    public Constructor(int edad, float altura, String nombre){     
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
        System.out.println("La edad es: " + this.edad);
        System.out.println("La altura es: " + this.altura);
        System.out.println("El nombre es: " + this.nombre);
    }
    
}
