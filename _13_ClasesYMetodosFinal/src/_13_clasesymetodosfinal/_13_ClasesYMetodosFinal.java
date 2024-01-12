package _13_clasesymetodosfinal;
public class _13_ClasesYMetodosFinal {
    public static void main(String[] args) {
        
        /*
        metodo final: es aquel metodo que no se va poder heredar a sus clases hijas (no va poder ser sobreescrito por sus subclases)
        clase final: es aquella que no puede heredar, ni atributos, ni metodos.
        */
        
        FiguraCerrada figuraCerrada = new FiguraCerrada(120);
        figuraCerrada.pintar();
        
        System.out.println("");
        
        FiguraAbierta figuraAbierta = new FiguraAbierta(150);
        figuraAbierta.pintar();
        
    }
    
}
