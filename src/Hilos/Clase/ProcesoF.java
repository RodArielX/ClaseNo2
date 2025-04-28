package Hilos.Clase;

import Hilos.Vista.VentanaAuto;

public class ProcesoF implements Runnable {
    @Override
    public void run() {
        new VentanaAuto();
    }
}

