
package _16_interfaces;
public class MusicoEstudiante implements Estudiante, Musico{ // Con las interfaces usamos implements para heredar
    
    // Debemos implementar si o si los metodos de las interfaces de mayor jerarquia

    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando programacion");
    }

    @Override
    public void hablar() {
        System.out.println("Estoy hablando");
    }
    
    @Override
    public void tocarMusica() {
        System.out.println("Estoy cantando y tocando instrumentos musicales");
    }
}
