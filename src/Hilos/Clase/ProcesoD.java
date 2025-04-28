package Hilos.Clase;

public class ProcesoD implements Runnable {
    private int n;

    // Constructor
    public ProcesoD(int numero) {
        n = numero;
    }

    public void asterisco(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println("****************************************");
        }
    }

    @Override
    public void run() {
        asterisco(n);
    }
}

