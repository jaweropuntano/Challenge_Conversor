package com.Conversor;

public class ConversorDeDivisas {
    public static double convertir(double valor, String monedaOrigen, String monedaDestino) {
        double tasaDeCambio;
        if (monedaOrigen.equals("euro") && monedaDestino.equals("dolar")) {
            tasaDeCambio = TasasDeCambio.EURO_A_DOLAR;
        } else if (monedaOrigen.equals("euro") && monedaDestino.equals("pesos argentinos")) {
            tasaDeCambio = TasasDeCambio.EURO_A_PESOS_ARG;
        } else if (monedaOrigen.equals("dolar") && monedaDestino.equals("pesos argentinos")) {
            tasaDeCambio = TasasDeCambio.DOLAR_A_PESOS_ARG;
        } else if (monedaOrigen.equals("dolar") && monedaDestino.equals("euro")) {
            tasaDeCambio = 1 / TasasDeCambio.EURO_A_DOLAR;
        } else if (monedaOrigen.equals("pesos argentinos") && monedaDestino.equals("euro")) {
            tasaDeCambio = 1 / TasasDeCambio.EURO_A_PESOS_ARG;
        } else if (monedaOrigen.equals("pesos argentinos") && monedaDestino.equals("dolar")) {
            tasaDeCambio = 1 / TasasDeCambio.DOLAR_A_PESOS_ARG;
        } else {
            throw new IllegalArgumentException("Monedas de origen y destino no válidas");
        }
        return valor * tasaDeCambio;
    }
}
