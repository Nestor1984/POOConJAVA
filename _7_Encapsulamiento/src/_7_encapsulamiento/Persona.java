package _7_encapsulamiento;
public class Persona {
    
    // Encapsulamos
    private int edad;
    private String nombre;
    private double altura;
    
    // Setters y getters
    /*
    set: establecer
    get: obtener
    */
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getAltura() {
        return altura;
    }
    
}
