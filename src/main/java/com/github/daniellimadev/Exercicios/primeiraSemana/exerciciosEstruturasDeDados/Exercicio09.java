package com.github.daniellimadev.Exercicios.primeiraSemana.exerciciosEstruturasDeDados;

import java.util.*;

public class Exercicio09 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> emailsOffline = new LinkedList<>();

        while (true) {
            System.out.println("Digite 'offline' para armazenar um email, 'online' ou para enviar emails'sair' para terminar:");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            if (entrada.equalsIgnoreCase("offline")) {
                System.out.println("Digite o email para armazenar: ");
                String email = scanner.nextLine().trim();
                emailsOffline.offer(email);
                System.out.println("Email armazenado com sucesso!");
            } else if (entrada.equalsIgnoreCase("online")) {
                if (!emailsOffline.isEmpty()) {
                    System.out.println("Enviando emails offline:");
                    while (!emailsOffline.isEmpty()) {
                        String email = emailsOffline.poll();
                        System.out.println("Enviando email: " + email);
                    }
                    System.out.println("Todos os emails offline foram enviados.");
                } else {
                    System.out.println("Nenhum email offline para enviar.");
                }
            } else {
                System.out.println("Comando inválido. Tente novamente.");
            }

        }
    }
}
