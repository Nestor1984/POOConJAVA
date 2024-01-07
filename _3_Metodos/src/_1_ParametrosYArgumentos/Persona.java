package _1_ParametrosYArgumentos;
public class Persona {
    
    public void comprobarSiEsMayorDeEdad(int edad, String nombre, float altura){
        if (edad >= 18) {
            System.out.println("");
            System.out.println("El ciudadano " + nombre + " es mayor de edad, cuenta con una altura de " + altura);
        }else{
            System.out.println("");
            System.out.println("El ciudadano " + nombre + " no es mayor de edad, cuenta con una altura de " + altura);
        }
    }
    
}
