package com.github.daniellimadev.Exercicios.segundaSemana.ClassesEObjetos.Exercicio03;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        int segundoNumero = scanner.nextInt();

        System.out.println(soma( primeiroNumero, segundoNumero ));
    }

    private static int soma(int primeiroNumero, int segundoNumero) {
        return primeiroNumero + segundoNumero;
    }
}
