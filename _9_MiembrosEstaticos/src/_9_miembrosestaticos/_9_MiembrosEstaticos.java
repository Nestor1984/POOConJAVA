package _9_miembrosestaticos;
public class _9_MiembrosEstaticos {
    
    public static int calcularEdad(int fechaActual, int fechaNacimiento){
        return fechaActual - fechaNacimiento;
    }
    
    public void saludar(String nombre){
        System.out.println("Hola mi nombre es: " + nombre);
    }
    
    public static void main(String[] args) {
       
        Persona.saludar();
        Persona.hablar();
        
        System.out.println(""); // salto de linea
        
        _9_MiembrosEstaticos persona = new _9_MiembrosEstaticos();
        persona.saludar("Max"); // Necesito hacer una instancia para acceder al metodo saludar que no es estatico
        
        int edad = calcularEdad(2024, 2003); // Como el metodo es estatico y esta esta clase, ya no es necesario llamar o hacer referencia a la clase
        System.out.println("La edad es: " + edad);
        
    }
}
