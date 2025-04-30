package Hilos.Vista;

import Hilos.Clase.Auto;

import javax.swing.*;
import java.awt.*;

public class VentanaDatos extends JFrame {
    public VentanaDatos(Auto vehiculo) {
        setTitle("Datos del Vehículo");
        setSize(300, 150);
        setLayout(new GridLayout(3, 1));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(new JLabel("Marca: " + vehiculo.getMarca()));
        add(new JLabel("Modelo: " + vehiculo.getModelo()));
        add(new JLabel("Precio: $" + vehiculo.getPrecio()));

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(e -> dispose());
        add(btnCerrar);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

