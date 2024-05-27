package com.github.daniellimadev.Exercicios.segundaSemana.Funcoes;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        char operacao;

            System.out.println("Digite o primeiro número: ");
            num1 = scanner.nextInt();

            System.out.println("Digite a operação (+, -, *, /): ");
            operacao = scanner.next().charAt(0);


            System.out.println("Digite o segundo número: ");
            num2 = scanner.nextInt();

            calcular(operacao, num1, num2);
    }

    public static void calcular(char operacao,int num1, int num2) {
        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + adicionar(num1, num2));
                break;
            case '-':
                System.out.println("Resultado: " + subtrair(num1, num2));
                break;
            case '*':
                System.out.println("Resultado: " + multiplicar(num1, num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + dividir(num1, num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }

    private static int adicionar(int a, int b) {
        return a + b;
    }

    private static int subtrair(int a, int b) {
        return a - b;
    }

    private static int multiplicar(int a, int b) {
        return a * b;
    }

    private static double dividir(int a, int b) {
        return a / b;
    }
}
