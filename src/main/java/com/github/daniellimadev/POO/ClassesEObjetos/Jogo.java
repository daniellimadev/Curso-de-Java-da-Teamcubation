package com.github.daniellimadev.POO.ClassesEObjetos;

public class Jogo {
    public static void main(String[] args) {
        Time a = new Time("Corinthians", 3);
        Time b = new Time("São Paulo", 3);

        System.out.println("O placar do jogo do " + a.getInformacoes() + " gols e " + b.getInformacoes() + " gols!");

        a.setGols(5);

        System.out.println("Agora o placar do jogo do " + a.getInformacoes() + " gols e " + b.getInformacoes() + " gols!");


    }
}
