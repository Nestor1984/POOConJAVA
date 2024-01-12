package _12_herencia;
public class _12_Herencia {

    public static void main(String[] args) {
        
        /*
        Herencia: Herencia en POO es heredar atributos o propiedades y metodos o acciones.
        Super clase: clase padre
        Sub clase: clase hija
        protected: vas a heredar miembros a tus clases hijas
        NOTA: Los atributos o metodos privados no se heredan
        */
        
        // Instancia de la subclase Nutria
        Nutria nutria = new Nutria("Carlos", 123, 5);
        nutria.comer();
        nutria.nadar();
        
        System.out.println("");
        
        // Instancia de la subclase Perro
        Perro perro = new Perro("Dani", 923, 10, "cafe");
        perro.comer();
        perro.ladrar();
        
    }
    
}
