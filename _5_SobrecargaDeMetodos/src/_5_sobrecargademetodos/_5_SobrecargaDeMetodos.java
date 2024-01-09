package _5_sobrecargademetodos;
public class _5_SobrecargaDeMetodos {
    public static void main(String[] args) {
        
        Sobrecarga metodos = new Sobrecarga(100, "Nestor");
        int edad = metodos.calcular(2024, 2003);
        System.out.println(edad);
        
        int numero = metodos.calcular();
        System.out.println(numero);
        
        metodos.saludar();
        metodos.saludar("Nestor");
                
    }
    
}
