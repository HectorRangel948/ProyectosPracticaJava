package mundoPC;

import mundoPC.modelo.Computadora;
import mundoPC.modelo.Monitor;
import mundoPC.modelo.Raton;
import mundoPC.modelo.Teclado;
import mundoPC.servicio.Orden;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class VentaComputadorasApp {
    public static void main(String[] args) {
        //Crear objetos

        //Computadora Lenovo
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        Teclado tecladoLenovo = new Teclado("Alàmbrico", "Lenovo");
        Monitor monitorLenovo = new Monitor("Lenovo",27);
        Computadora computadoraLenovo = new Computadora(
                "Computadora Lenovo",
                monitorLenovo,
                tecladoLenovo,
                ratonLenovo);

        //Computadora Dell
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //Computadora Mac
        Monitor monitorMac = new Monitor("Mac", 15);
        Teclado tecladoMac = new Teclado("Alámbrico", "Apple");
        Raton ratonMac = new Raton("Alámbrico", "Apple");
        Computadora computadoraMac = new Computadora("Computadora Mac", monitorMac, tecladoMac, ratonMac);

        //Creamos una orden
        Orden orden1= new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        Orden orden2= new Orden();
        orden2.agregarComputadora(computadoraLenovo);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraMac);
        System.out.println();
        System.out.println();
        orden2.mostrarOrden();
    }

}