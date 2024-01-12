package _16_interfaces;
public class _16_Interfaces {
    
    public static void main(String[] args) {
        
        /*Herencia multiple: Una clase puede heredar comportamientos de mas de una superclase
        NOTA: En JAVA no existe la herencia multiple, pero podemos simularla usando interfaces.
        Interface: Es una coleccion de metodos abstractos.
        - Permiten simular la herencia multiple
        - La interfaz solo es public o default
        - Todos sus metodos son abstractos
        - Todos sus atributos son final
        */
        
        MusicoEstudiante musicoEstudiante = new MusicoEstudiante();
        musicoEstudiante.estudiar();
        musicoEstudiante.hablar();
        musicoEstudiante.tocarMusica();
    }
    
}
