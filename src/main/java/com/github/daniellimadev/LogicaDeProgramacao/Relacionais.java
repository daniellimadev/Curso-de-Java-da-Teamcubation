package com.github.daniellimadev.LogicaDeProgramacao;

public class Relacionais {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        boolean menor = (a < b);
        boolean menorOuIgual = (a <= b);
        boolean maior = (a > b);
        boolean maiorOuIgual = (a >= b);

        System.out.println("a é menor que b: " + menor);
        System.out.println("a é menor ou igual que b: " + menorOuIgual);
        System.out.println("a é maior que b: " + maior);
        System.out.println("a é maior ou igual que b: " + maiorOuIgual);
    }
}
