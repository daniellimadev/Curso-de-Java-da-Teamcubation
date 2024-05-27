package com.github.daniellimadev.Exercicios.segundaSemana.Funcoes;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        int celsius = scanner.nextInt();
        int fahrenheit = celsiusParaFahrenheit(celsius);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        celsius = fahrenheitParaCelsius(fahrenheit);
        fahrenheit = scanner.nextInt();

        System.out.println("\nA Temperatura de " + celsius + " Celsius é igual a " + fahrenheit + " Fahrenheit\n");
        System.out.println("A Temperatura de " + fahrenheit + " Fahrenheit é igual a " + celsius + " Celsius\n");

        scanner.close();
    }

    public static int celsiusParaFahrenheit(int celsius) {
        return (celsius * 9/5) + 32;
    }

    public static int fahrenheitParaCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
