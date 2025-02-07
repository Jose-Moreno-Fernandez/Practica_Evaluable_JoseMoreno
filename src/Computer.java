/**
 * Clase computer que represanta a ordenadores en general
 * @author Manuel Molino && Encarni Muñoz && Jose Moreno && Jose Moreno
 * @version 1.0.1
 */
public class Computer {
    private int ram;
    private float cpu;
    private String motherBoard;

    /**
     * Setter para establecer el valor int de la ram de un ordenador
     * @param ram Representa la cantidad de ram del ordenador
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * Setter para establecer el valor float de la cpu de un ordenador
     * @param cpu Representa la cpu del ordenador
     */
    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    /**
     * Setter para establecer el valor String de la placa base de un ordenador
     * @param motherBoard Representa el nombre de la placa base del ordenador
     */
    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }    /**
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
