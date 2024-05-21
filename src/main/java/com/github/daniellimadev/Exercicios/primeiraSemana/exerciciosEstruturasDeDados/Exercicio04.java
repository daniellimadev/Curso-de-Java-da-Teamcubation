package com.github.daniellimadev.Exercicios.primeiraSemana.exerciciosEstruturasDeDados;

import java.util.*;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int a;
        System.out.println("Digite 10 numeros: ");

        for(int i = 0; i < array.length; i++){
            a = scanner.nextInt();
            array[i] = a;
        }

        scanner.close();

        System.out.println("Seu array ficou: " + Arrays.toString(array));
        int vezes = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j] && i!=j){
                    int numero = array[i];
                    vezes++;
                    while(array[i]==array[j] && vezes>1){
                        System.out.println("O numero "+numero+" é repetido "+vezes+" vezes.");
                        vezes=0;
                    }
                }
            }
        }
    }
}
