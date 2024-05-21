package com.github.daniellimadev.LogicaDeProgramacao;

public class Xor {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        // Verificar se apenas uma das condições é verdadeira antes de ativar a funcionalidade.
        if (condition1 ^ condition2) {
            System.out.println("A funcionalidade foi ativada.");
        }
    }
}
