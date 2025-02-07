/**
 * Clase computer que represanta a ordenadores en general
 * @author Manuel Molino && Encarni Muñoz && Jose Moreno
 * @version 1.0.0
 */
public class Computer {
    private int ram;
    private float cpu;
    private String motherBoard;

    /**
     * Metodo toString que devuelve un mensaje con los componentes y los valores del ordenador
     * @return El mensaje String.format sobre los componentes del ordenador
     */
    @Override
    public String toString() {
        return String.format("La memoria RAM es: %d%nLa CPU es: %.2f%nLa placa base es: %s%n", ram, cpu, motherBoard);
    }
}
