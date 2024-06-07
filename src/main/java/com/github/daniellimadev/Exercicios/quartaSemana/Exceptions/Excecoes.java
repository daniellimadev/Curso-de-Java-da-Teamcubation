package com.github.daniellimadev.Exercicios.quartaSemana.Exceptions;

public class Excecoes {

    // Método X que lança uma exceção checada
    public static void metodoX() throws MinhaException {
        throw new MinhaException();
    }

    // Método Y que chama o método X
    public static void metodoY() {
        try {
            metodoX();
        } catch (MinhaException e) {
            System.out.println("Exceção checada capturada em método Y.");
        }
    }

    public static void main(String[] args) {
        // Exercício 1
        try {
            metodoX();
        } catch (MinhaException e) {
            System.out.println("Exceção checada capturada no método main.");
        }

        // Exercício 2
        metodoY(); // Não há obrigação de capturar MinhaRuntimeException

        // Exercício 3
        try {
            System.out.println("Entrando no bloco try");
            // Nenhuma exceção é lançada aqui
            System.out.println("Instrução que não lança exceção");
            System.out.println("Saindo do bloco try");
        } catch (Exception e) {
            System.out.println("Capturando exceção no bloco catch");
        } finally {
            System.out.println("Executando bloco finally");
        }

        // Exercício 4
        try {
            System.out.println("Entrando no bloco try");
            // Lançando uma exceção
            int resultado = 5 / 0; // Esta instrução lançará uma ArithmeticException
            System.out.println("Instrução que não será executada devido à exceção");
        } catch (ArithmeticException e) {
            System.out.println("Capturando exceção no bloco catch: " + e.getMessage());
        } finally {
            System.out.println("Executando bloco finally");
        }
    }
}

