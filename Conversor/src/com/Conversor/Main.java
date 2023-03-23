package com.Conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la moneda de origen (euro, dolar o pesos argentinos): ");
        String monedaOrigen = scanner.nextLine().toLowerCase();
        System.out.println("Ingrese la moneda de destino (euro, dolar o pesos argentinos): ");
        String monedaDestino = scanner.nextLine().toLowerCase();
        System.out.println("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();
        double valorConvertido = ConversorDeDivisas.convertir(valor, monedaOrigen, monedaDestino);
        System.out.println(valor + " " + monedaOrigen + " = " + valorConvertido + " " + monedaDestino);
    }
}
