package com.github.daniellimadev.POO.Funcoes;

public class Funcao {
    public static void main(String[] args) {
        int result = soma(5, 7);
        int result2 = divisao(5, 5);
        System.out.println("Resultado da soma:" +result);
        System.out.println("Resultado da divisão:" +result2);

    }

    private static int soma(int a, int b) {
        return a + b;
    }
    private static int divisao(int a, int b) {
        return a / b;
    }


}
