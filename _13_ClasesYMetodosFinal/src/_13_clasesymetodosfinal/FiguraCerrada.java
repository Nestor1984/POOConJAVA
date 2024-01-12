package _13_clasesymetodosfinal;
public class FiguraCerrada extends Figura{
    
    // Constructor especial
    public FiguraCerrada(double tamanio) {
        super(tamanio);
    }

    /*
    @Override
    public void dibujar() { // No se puede sobreescribir
        System.out.println("Dibujando figura cerrada, del tamanio " + tamanio);
    }*/

    @Override
    public void pintar() {
        System.out.println("Pintando figura cerrada, del tamanio " + tamanio);
    }
    
}
