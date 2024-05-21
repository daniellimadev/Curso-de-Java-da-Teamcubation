package com.github.daniellimadev.Exercicios.primeiraSemana.exerciciosEstruturasDeDados;

import java.util.*;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algum comando:");

        String input = "";
        Stack<String> stack = new Stack<>();

        do {
            input = scanner.nextLine();

            stack.push(input);
            if (input.equals("CTRL + Z")) {
                 stack.pop();
                System.out.println("O ultimo comando é: " + stack.peek());
            }

        } while (!input.equals("CTRL + Z"));

        scanner.close();
    }
}
