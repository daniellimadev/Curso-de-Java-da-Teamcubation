package com.github.daniellimadev.Exercicios.primeiraSemana.condicionais;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos jogos o jogodor já jogou: ");
        int penaltis = scanner.nextInt();
        System.out.println("Quantos o próximo advesário está em uma posição inferior na tabela: ");
        int explusoes = scanner.nextInt();
        System.out.println("Este advesário virá um jogo classificatória importante 'sim' ou 'não': ");
        int varJogo = scanner.nextInt();

        boolean analise = penaltis >2 && explusoes > 1 && varJogo > 3;

        if (analise) {
            System.out.println("Este jogador vai jogar só na próximo jogo!");
        } else {
            System.out.println("O jogador vai jogar nesse jogo!");
        }
    }
}
