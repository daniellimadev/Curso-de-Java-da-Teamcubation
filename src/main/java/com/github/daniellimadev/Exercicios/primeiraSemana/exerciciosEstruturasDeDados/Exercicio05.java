package com.github.daniellimadev.Exercicios.primeiraSemana.exerciciosEstruturasDeDados;

import java.util.*;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        Set<String> nomesUnicos = new HashSet<>();
        Set<String> nomesDuplicados = new HashSet<>();

        String nome;
        do {
            System.out.println("Digite alguns nomes (ou 'sair' para encerrar): ");
            nome = scanner.nextLine().trim();

            if (!nome.equalsIgnoreCase("sair")) {
                if (nomesUnicos.contains(nome)) {
                    nomesDuplicados.add(nome);
                } else {
                    nomesUnicos.add(nome);
                }
                nomes.add(nome);
            }

        } while (!nome.equalsIgnoreCase("sair"));

        scanner.close();

        if (!nomesDuplicados.isEmpty()) {
            System.out.println("Nomes que apareceram mais de uma vez:");
            for (String nomeDuplicado : nomesDuplicados) {
                System.out.println(nomeDuplicado);
            }
        } else {
            System.out.println("Nenhum nome foi repetido.");
        }
    }


}
