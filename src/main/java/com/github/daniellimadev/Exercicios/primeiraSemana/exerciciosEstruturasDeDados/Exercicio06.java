package com.github.daniellimadev.Exercicios.primeiraSemana.exerciciosEstruturasDeDados;

import java.util.*;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        Set<String> nomesUnicos = new HashSet<>();
        Set<String> nomesDuplicados = new HashSet<>();
        int contadorDuplicados = 0;

        String nome;
        do {
            System.out.println("Digite um nome (ou 'sair' para encerrar): ");
            nome = scanner.nextLine().trim();

            if (!nome.equalsIgnoreCase("sair")) {
                if (nomesUnicos.contains(nome)) {
                    nomesDuplicados.add(nome);
                    contadorDuplicados++;
                } else {
                    nomesUnicos.add(nome);
                }
                nomes.add(nome);
            }

        } while (!nome.equalsIgnoreCase("sair"));

        scanner.close();

        System.out.println("Nomes não duplicados:");
        for (String nomeUnico : nomesUnicos) {
            if (!nomesDuplicados.contains(nomeUnico)) {
                System.out.println(nomeUnico);
            }
        }

        System.out.println("Número de vezes que nomes duplicados foram digitados: " + contadorDuplicados);
    }
}
