package _5_sobrecargademetodos;
public class Sobrecarga {

    /*
    NOTA: En JAVA la sobrecarga de metodos se puede hacer por:
    - La cantidad de parametros.
    - El orden de los parametros.
    - El tipo de dato de los parametros.
     */

    public Sobrecarga(int edad) {
        System.out.println("La edad es: " + edad);
    }

    public Sobrecarga(int kilometros, String nombre) {
        System.out.println("La persona " + nombre + " corre " + kilometros);
    }

    public Sobrecarga(float altura) {
        System.out.println("La altura de la persona es: " + altura);
    }
    
    public int calcular(int fechaActual, int fechaNacimiento){
        int edad = fechaActual - fechaNacimiento;
        return edad;
    }
    
    public int calcular(){
        return 10 * 20;
    }
    
    public void saludar(){
        System.out.println("Hola, muy buenas noches");
    }
    
    public void saludar(String nombre){
        System.out.println("Hola, me presento mi nombre es " + nombre);
    }
            
}
