package com.github.daniellimadev.Exercicios.primeiraSemana.condicionais;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantas vitórias: ");
        int vitorias = scanner.nextInt();
        System.out.println("Digite quantas derrotas: ");
        int derrotas = scanner.nextInt();

        if (vitorias > derrotas) {
            System.out.println("Seu time está positivo!");
        } else {
            System.out.println("Seu time está negativo!");
        }
    }
}
