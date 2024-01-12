package _1_BucleForEach;
public class _1_BucleForEach {
    
    public static void main(String[] args) {
        
        /*
        Sintaxis del bucle for-each:
        for(TipoDeDatoDelArreglo nombreVariableMagica : arreglo){
        }
        */
        
        //Creamos el arreglo de objetos
        Persona[] personas = new Persona[4];
        personas[0] = new Persona("Nestor", "Mamani", 20, 12345);
        personas[1] = new Persona("Pablo", "Perez", 16, 29848);
        personas[2] = new Persona("Maria", "Cruz", 29, 28339);
        personas[3] = new Persona("Juan", "Andres", 28, 12334);
        
        // Imprimimos
        for(Persona persona : personas){
            persona.mostrarDatos();
            System.out.println("");
        }
        
        // Salida:
        /*
        Nombre: Nestor
        Apellido: Mamani
        Edad: 20
        DNI: 12345

        Nombre: Pablo
        Apellido: Perez
        Edad: 16
        DNI: 29848

        Nombre: Maria
        Apellido: Cruz
        Edad: 29
        DNI: 28339

        Nombre: Juan
        Apellido: Andres
        Edad: 28
        DNI: 12334
        */
        
    }
    
}
