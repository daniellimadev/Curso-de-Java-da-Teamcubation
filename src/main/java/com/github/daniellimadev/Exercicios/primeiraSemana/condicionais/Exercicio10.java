package com.github.daniellimadev.Exercicios.primeiraSemana.condicionais;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual fase da Copa do Brasil um time irá estrear: ");
        String classificado = scanner.nextLine();

        switch (classificado) {
            case "estadual":
                System.out.println("Irá começar na primeira fase!");
                break;
            case "libertadores":
                System.out.println("Irá começar na segunda fase!");
                break;
            case "campeão":
                System.out.println("Irá começar na terceira fase!");
                break;
            default:
                System.out.println("Tente novamente o ano que vem!");
        }
    }
}
