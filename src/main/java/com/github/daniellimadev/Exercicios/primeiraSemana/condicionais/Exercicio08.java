package com.github.daniellimadev.Exercicios.primeiraSemana.condicionais;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos jogadores do primeiro time: ");
        int jogadoresPrimeiroTime = scanner.nextInt();
        System.out.println("Quantos jogadores do segundo time: ");
        int jogadoresSegundoTime = scanner.nextInt();

        if (jogadoresPrimeiroTime >=7 && jogadoresSegundoTime >= 7) {
            System.out.println("O jogo pode continua!");
        } else {
            System.out.println("O número de jogadores tem que ser de 7 a 11!");
        }
    }
}
