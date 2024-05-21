package com.github.daniellimadev.Exercicios.primeiraSemana.sequenciaLogica;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextInt();

        System.out.println("Escolha a operação (+, -, *, /):");
        char operacao = sc.next().charAt(0);

        double resultado;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado da sua operação: " + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado da sua operação: " + resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado da sua operação: " + resultado);
                break;

            case '/':
                if (numero2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    break;
                } else {

                    resultado = numero1 / numero2;
                    System.out.println("Resultado da sua operação: " + resultado);
                    break;
                }

            default:
                System.out.println("Operação invalida!");
        }
    }
}

