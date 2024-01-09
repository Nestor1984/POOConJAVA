package _10_metodotostring;
public class Persona {
    
    public static int edad = 14;
    public final static String nombre = "Nestor";
    public static float altura = 1.77f;
    
     // toString: es el metodo mostrar datos, que le pertenece a la super clase Object
            
    @Override // Annotacion override: significa que estamos sobreescribiendo un metodo de la super clase
    public String toString(){
        return "Edad: " + edad + "\nNombre: " + nombre + "\nAltura: " + altura;
    }
}
