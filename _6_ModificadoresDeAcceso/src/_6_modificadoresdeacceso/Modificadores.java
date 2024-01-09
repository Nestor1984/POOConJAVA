package _6_modificadoresdeacceso;
public class Modificadores {
    
    /*
    private: va pertenecer solo a la clase
    public: se va a poder acceder desde cualquier clase y paquete
    default: solo va poder ser accedido por clases del mismo paquete
    */
    
    public int edad;
    public String nombre;
    
    public Modificadores(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }
    
    private void describir(){
        System.out.println("El alumno " + this.nombre + " tiene " + this.edad + " anios");
    }
    
    public void saludar(){
        this.describir();
        System.out.println("Buenos dias");
    }
    
    // Modificador de acceso por defecto
    void despedir(){
        System.out.println("Adios");
    }
    
}
