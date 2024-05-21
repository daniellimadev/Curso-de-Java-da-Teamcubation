package com.github.daniellimadev.Exercicios.primeiraSemana.condicionais;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos pênaltis o jogo teve: ");
        int penaltis = scanner.nextInt();
        System.out.println("Quantos explusões o jogo teve: ");
        int explusoes = scanner.nextInt();
        System.out.println("Quantos consutais ao VAR o jogo teve: ");
        int varJogo = scanner.nextInt();

        boolean analise = penaltis >2 && explusoes > 1 && varJogo > 3;

        if (analise) {
            System.out.println("O jogo é suspeito de manipulação!");
        } else {
            System.out.println("O jogo pode continua!");
        }
    }
}
