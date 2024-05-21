package com.github.daniellimadev.Exercicios.primeiraSemana.condicionais;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos gols fez o primeiro time: ");
        int primeiroTime = scanner.nextInt();
        System.out.println("Digite quantos gols fez o segundo time: ");
        int segundoTime = scanner.nextInt();

        if (primeiroTime > segundoTime) {
            System.out.println("Vitória do primeiro time");
        } else if (primeiroTime < segundoTime) {
            System.out.println("Vitória do segundo  time");

        } else {
            System.out.println("Teve Empate!");
        }
    }
}
