package com.github.daniellimadev.Exercicios.primeiraSemana.condicionais;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu número da camisa: ");
        int numeroDaCamisa = scanner.nextInt();

        switch (numeroDaCamisa) {
            case 1:
                System.out.println("Goleiro!");
                break;
            case 2, 3, 4, 5:
                System.out.println("defensor!");
                break;
            case 6, 7, 8, 10:
                System.out.println("Meio-Campo!");
                break;
            case 9, 11:
                System.out.println("Atacante!");
                break;
        }

    }
}
