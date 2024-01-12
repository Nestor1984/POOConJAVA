package _14_clasesymetodosabstractos;
public class _14_ClasesYMetodosAbstractos {
    
    public static void main(String[] args) {
        
        /*
        Abstraccion: es una idea que no esta asociado a ningun caso concreto.
        
        Clase abstracta:
        - Es una clase que se utiliza como super clase.
        - No se pueden instanciar objetos.
        - Tiene metodos abstractos.
        
        Metodo abstracto: es un metodo que se declara en la superclase, para que
        se pueda implementar en sus clases hijas.
        Por ejemplo: public abstract void jugar();
        
        Un metodo abstracto lleva la palabra abstract, sabemos lo que hace este metodo
        que es jugar pero no sabemos su contenido, no sabemos el algoritmo que posee o 
        tiene, ese algoritmo lo vamos a implementar en sus clases hijas y siempre(obligatorio)
        si hay un metodo, la clase tambien tendra que ser abstracta
        */
        
        JugadorFutbol jugadorFutbol = new JugadorFutbol("Lionel Messi", 32);
        jugadorFutbol.jugar();
        
        System.out.println("");
        
        JugadorBasquet jugadorBasquet = new JugadorBasquet("Michael Jordan", 40);
        jugadorBasquet.jugar();
    }
    
}
