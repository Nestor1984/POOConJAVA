package _1_creaciondeclasesyobjetos;

public class _1_CreacionDeClasesYObjetos {

    public static void main(String[] args) {
        /*
        Clase: Una clase es una categoria.
        Objeto: Un objeto es una instancia de una clase.
        
        Sintaxis:
        Clase:
        modificadorDeAcceso class nombreDeLaClase{
        }
        
        Objeto:
        NombreDeLaClase objeto = new Constructor();
        */
        
        // Creamos los objetos
        Lavadora lavadora = new Lavadora(); // new: hace una instancia
        String color = lavadora.color = "rojo";
        String modelo = lavadora.modelo = "modelo avanzado";
        int numeroSerie = lavadora.numeroSerie = 1234567;
        float precio = lavadora.precio = 900.9f;
        
        System.out.println("La primera lavadora tiene las siguientes caracteristicas: " );
        System.out.println("Color: " + color);
        System.out.println("Modelo: " + modelo);
        System.out.println("Numero de serie: " + numeroSerie);
        System.out.println("Precio: " + precio);
        
        System.out.println("");
        
        Lavadora lavadoraBolivia = new Lavadora();
        String colorBolivia = lavadoraBolivia.color = "verde";
        String modeloBolivia = lavadora.modelo = "modelo basico";
        int numeroSerieBolivia = lavadora.numeroSerie = 1274649387;
        float precioBolivia = lavadora.precio = 989.9f;
        System.out.println("La segunda lavadora tiene las siguientes caracteristicas: " );
        System.out.println("Color: " + colorBolivia);
        System.out.println("Modelo: " + modeloBolivia);
        System.out.println("Numero de serie: " + numeroSerieBolivia);
        System.out.println("Precio: " + precioBolivia);
        
                
    }
    
}
