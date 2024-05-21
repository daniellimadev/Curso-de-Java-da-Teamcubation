package com.github.daniellimadev.Exercicios.primeiraSemana.condicionais;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos gols feitos: ");
        int golsFeitos = scanner.nextInt();
        System.out.println("Quantos gols sofridos: ");
        int golsSofridos = scanner.nextInt();

        if ((golsFeitos - golsSofridos) > 0) {
            System.out.println("Está positivo");
        } else if ((golsFeitos - golsSofridos) > 0) {
            System.out.println("Está negativo");
        } else {
            System.out.println("Está neutro");
        }
    }
}
