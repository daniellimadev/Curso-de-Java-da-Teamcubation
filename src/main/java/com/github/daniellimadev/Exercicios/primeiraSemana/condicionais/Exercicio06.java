package com.github.daniellimadev.Exercicios.primeiraSemana.condicionais;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite de um 1 a 5, quantos sue time teve conquista consecutivamente:  : ");
        int conquista = scanner.nextInt();

        switch (conquista) {
            case 1:
                System.out.println("Campeão!");
                break;
            case 2:
                System.out.println("Bicampeão!");
                break;
            case 3:
                System.out.println("Tricampeão!");
                break;
            case 4:
                System.out.println("Tetracampeão!");
                break;
            case 5:
                System.out.println("Pentacampeão!");
                break;
        }
    }
}
