package _9_miembrosestaticos;
public class Persona {
    
    /*
    static: los miembros estaticos ya no le petenecen a los objetos, le pertenecen a la clase
    */
    
    public static int edad = 20;
    public static final String nombre = "Nestor";
    public static final int id = 12345;
    public static double altura = 1.77;
    
    public static void saludar(){
        System.out.println("Hola....");
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi edad es " + edad);
        System.out.println("Mi id es " + id);
        System.out.println("Mi altura es  " + altura);
    }
    
    public static void hablar(){
        System.out.println("Estoy hablando....");
    }
    
}
