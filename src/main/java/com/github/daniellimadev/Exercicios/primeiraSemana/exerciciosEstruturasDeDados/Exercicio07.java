package com.github.daniellimadev.Exercicios.primeiraSemana.exerciciosEstruturasDeDados;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> notas = new HashMap<>();

        System.out.println("Digite as notas do aluno (matéria: nota), ou 'sair' para terminar:");

        while (true) {
            System.out.print("Digite a matéria e a nota (ou 'sair' para terminar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = entrada.split(":");
            if (partes.length != 2) {
                System.out.println("Entrada inválida. Tente novamente.");
                continue;
            }

            String materia = partes[0].trim();
            double novaNota = Double.parseDouble(partes[1].trim());

            if (notas.containsKey(materia)) {
                double notaExistente = notas.get(materia);
                double media = (notaExistente + novaNota) / 2;
                notas.put(materia, media);
            } else {
                notas.put(materia, novaNota);
            }
        }

        System.out.println("Notas do aluno:");
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }

}
