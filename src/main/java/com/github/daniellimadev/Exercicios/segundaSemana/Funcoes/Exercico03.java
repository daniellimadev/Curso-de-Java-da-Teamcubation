package com.github.daniellimadev.Exercicios.segundaSemana.Funcoes;

import java.util.Scanner;

public class Exercico03 {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Digite um número: ");
          int numero = scanner.nextInt();

          if (ehPrimo(numero)) {
               System.out.println(numero + " é um número primo.");
          } else {
               System.out.println(numero + " não é um número primo.");
          }

          scanner.close();
     }

     public static boolean ehPrimo(int numero) {
          if (numero < 2) {
               return false;
          }
          for (int i = 2; i <= Math.sqrt(numero); i++) {
               if (numero % i == 0) {
                    return false;
               }
          }
          return true;
     }
}
