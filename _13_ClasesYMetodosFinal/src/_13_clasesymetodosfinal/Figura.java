package _13_clasesymetodosfinal;
public class Figura { // public final class Figura {}: si yo lo pongo asi, esta clase no va poder heredar
    
    //Atributos
    protected double tamanio;
       
    //Metodos

    public Figura(double tamanio) {
        this.tamanio = tamanio;
    }
    
    // No se va heredar este metodo porque es de tipo final
    public final void dibujar(){
        System.out.println("Dibujando figura");
    }
    
    public void pintar(){
        System.out.println("Pintando figura");
    }
}
