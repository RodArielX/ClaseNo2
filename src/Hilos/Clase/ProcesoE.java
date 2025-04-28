package Hilos.Clase;

import javax.swing.*;

public class ProcesoE implements Runnable{
    private String mensaje;

    public ProcesoE(String frase){
        this.mensaje = frase;

    }

    public void texto(String mensaje){
        JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel,mensaje);
    }

    @Override
    public void run() {
        texto(mensaje);
    }
}
