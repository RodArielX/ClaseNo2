package Hilos.Clase;

public class ProcesoB extends Thread {
    private int n;
    // Constructor
    public ProcesoB(int n){
        this.n=n;


    }
    public void contar(int n){
        for(int i=1; i<n; i++){
            System.out.println("Iteracion N--" + i);

        }
    }

    @Override
    public void run() {
        contar(n);
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
