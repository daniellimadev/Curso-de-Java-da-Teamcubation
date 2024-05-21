package com.github.daniellimadev.Exercicios.primeiraSemana.condicionais;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite se seu time foi para finais, semi-finais ou quartas-finais: ");
        String desenpenho = scanner.nextLine();

        switch (desenpenho) {
            case "finais":
                System.out.println("Seu time foi para Série D!");
                break;
            case "semi-finais":
                System.out.println("Seu time foi para Copa do Brasil!");
                break;
            case "quartas-finais":
                System.out.println("Seu time foi para Copa Regional!");
                break;
            default:
                System.out.println("Está desclassificado das competições!");
        }
    }
}
