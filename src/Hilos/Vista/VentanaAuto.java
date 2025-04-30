package Hilos.Vista;

import Hilos.Clase.Auto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaAuto extends JFrame {
    private JTextField txtMarca, txtModelo, txtPrecio;

    public VentanaAuto() {
        setTitle("Ingreso de Vehículo");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(new JLabel("Marca:"));
        txtMarca = new JTextField();
        add(txtMarca);

        add(new JLabel("Modelo:"));
        txtModelo = new JTextField();
        add(txtModelo);

        add(new JLabel("Precio:"));
        txtPrecio = new JTextField();
        add(txtPrecio);

        JButton btnEnviar = new JButton("Proceso");
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Auto vehiculo = new Auto();
                vehiculo.setMarca(txtMarca.getText());
                vehiculo.setModelo(txtModelo.getText());

                try {
                    vehiculo.setPrecio(Double.parseDouble(txtPrecio.getText()));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No hay datos ingresados");
                    return;
                }

                new VentanaDatos(vehiculo).setVisible(true);
                dispose();
            }
        });
        add(btnEnviar);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

