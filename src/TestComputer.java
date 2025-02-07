/**
 * Clase para probar la funcionalidad de la clase Computer.
 * @author Jose Moreno
 * @version 1.0
 */
public class TestComputer {
    /**
     * Metodo principal que crea y configura tres ordenadores y luego muestra la información de cada uno.
     * @param args
     */
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.setRam(16);
        computer1.setCpu(3.5f);
        computer1.setMotherBoard("Asus ROG");

        Computer computer2 = new Computer();
        computer2.setRam(8);
        computer2.setCpu(2.8f);
        computer2.setMotherBoard("Gigabyte AORUS");

        Computer computer3 = new Computer();
        computer3.setRam(32);
        computer3.setCpu(4.0f);
        computer3.setMotherBoard("MSI MAG");

        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
    }
}


