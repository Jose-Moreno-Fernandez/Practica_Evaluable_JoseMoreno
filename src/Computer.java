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
     * Getter que nos devuelve el valor int de la ram
     * @return La cantidad de ram del ordenador
     */
    public int getRam() {
        return ram;
    }
    /**
     * Getter que nos devuelve el valor float de la cpu
     * @return La cpu del ordenador
     */
    public float getCpu() {
        return cpu;
    }

    /**
     * Getter que nos devuelve el valor String de la placa base
     * @return La placa base del ordenador
     */
    public String getMotherBoard() {
        return motherBoard;
    }
}
