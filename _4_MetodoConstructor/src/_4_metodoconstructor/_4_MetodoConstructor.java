package _4_metodoconstructor;
public class _4_MetodoConstructor {
    public static void main(String[] args) {

        /*
        Reglas:
        - Se llama igual que la clase
        - Es el primer metodo que se ejecuta
        - Se ejecuta automaticamente
        - No devuelve nada
        - Un constrcutor tiene por objetivo inicializar atributos
        
        Sintaxis:
        Clase objeto = new Clase();
         */
        int edad = 20;
        String nombre = "Nestor";
        float altura = 1.77f;
        
        Constructor persona = new Constructor(edad, altura, nombre);

    }

}
