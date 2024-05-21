package com.github.daniellimadev.Exercicios.primeiraSemana.exerciciosEstruturasDeDados;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        int media = soma / 10;

        System.out.println("A média dos números digitados é: " + media);
    }
}
