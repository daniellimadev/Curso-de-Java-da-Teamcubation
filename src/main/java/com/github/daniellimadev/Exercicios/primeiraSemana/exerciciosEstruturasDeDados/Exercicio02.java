package com.github.daniellimadev.Exercicios.primeiraSemana.exerciciosEstruturasDeDados;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float arrayAlturas[] = new float[5];;
        float alturaMaior = 0;
        float alturaMenor = 0;

        for (int i = 0; i < arrayAlturas.length; i++) {
            System.out.println("Digite a altura da pessoa " + ( i+1)  + ": ");
            arrayAlturas[i] =  scanner.nextFloat();
            alturaMaior = arrayAlturas[i];
            alturaMenor = arrayAlturas[i];
        }

        scanner.close();

        for (int i = 0; i < arrayAlturas.length; i++) {
            if (arrayAlturas[i] > alturaMaior) {
                alturaMaior = arrayAlturas[i];
            } else if (arrayAlturas[i] < alturaMenor) {
                alturaMenor = arrayAlturas[i];
            }
        }
        System.out.println("Altura maior: " + alturaMaior);
        System.out.println("Altura menor: " + alturaMenor);
    }
}
