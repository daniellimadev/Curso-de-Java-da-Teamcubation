package com.github.daniellimadev.LogicaDeProgramacao;

public class Igualdade {
    public static void main(String[] args) {
        // Usamos "==" para testar se os valores são iguais e "!=" se são diferentes.

        int x = 5;
        int y = 9;

        boolean igualdade = (x == y);
        boolean diferente = (x != y);

        System.out.println("x é igual a y" + igualdade);
        System.out.println("x é diferente a y" + diferente);
    }
}
