package com.Conversor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorDeDivisasGUI {
    private JFrame frame;
    private JComboBox<String> monedaOrigenCombo;
    private JComboBox<String> monedaDestinoCombo;
    private JTextField valorTextField;
    private JButton convertirButton;
    private JLabel resultadoLabel;

    public ConversorDeDivisasGUI() {
        frame = new JFrame("Conversor de divisas");
        frame.setLayout(new GridLayout(3, 2, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        monedaOrigenCombo = new JComboBox<>(new String[]{"euro", "dolar", "pesos argentinos"});
        monedaDestinoCombo = new JComboBox<>(new String[]{"euro", "dolar", "pesos argentinos"});
        valorTextField = new JTextField();
        convertirButton = new JButton("Convertir");
        resultadoLabel = new JLabel();

        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String monedaOrigen = (String) monedaOrigenCombo.getSelectedItem();
                String monedaDestino = (String) monedaDestinoCombo.getSelectedItem();
                double valor = Double.parseDouble(valorTextField.getText());
                double valorConvertido = ConversorDeDivisas.convertir(valor, monedaOrigen, monedaDestino);
                resultadoLabel.setText(valor + " " + monedaOrigen + " = " + valorConvertido + " " + monedaDestino);
            }
        });

        frame.add(new JLabel("Moneda de origen:"));
        frame.add(monedaOrigenCombo);
        frame.add(new JLabel("Moneda de destino:"));
        frame.add(monedaDestinoCombo);
        frame.add(new JLabel("Valor a convertir:"));
        frame.add(valorTextField);
        frame.add(new JLabel());
        frame.add(convertirButton);
        frame.add(new JLabel("Resultado:"));
        frame.add(resultadoLabel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ConversorDeDivisasGUI();
    }
}
