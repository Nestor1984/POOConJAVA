package _13_clasesymetodosfinal;
public class FiguraAbierta extends Figura{
    
    // Constructor especial
    public FiguraAbierta(double tamanio) {
        super(tamanio);
    }

    /*
    @Override
    public void dibujar() { // No se puede sobreescribir
        System.out.println("Dibujando figura abierta, del tamanio " + tamanio);
    }*/

    @Override
    public void pintar() {
        System.out.println("Pintando figura abierta, del tamanio " + tamanio);
    }
    
}
