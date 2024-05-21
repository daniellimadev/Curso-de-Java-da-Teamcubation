package com.github.daniellimadev.Exercicios.primeiraSemana.sequenciaLogica;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int tentativa = 0;
        int palpite = 0;

        System.out.println("Tente adivinhar um numero entre 1 e 100.");

        while (palpite != numeroSecreto) {
            System.out.println("Digite  seu palpite: ");
            palpite = sc.nextInt();
            tentativa++;
            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns! Você adivinhou em " + tentativa + " tentativas.");
            }
        }
    }
}
