package com.github.daniellimadev.LogicaDeProgramacao;

public class Logicos {
    public static void main(String[] args) {
        // Pererível utiliza os operadore de curto-circuito, comparado aos simples "&" e "|"

        int idade = 17;
        boolean maiorDeIdade = idade >= 18;
        boolean maiorDeIdadeVotar = idade > 16;
        boolean possuiCarteiraDeMotorista = true;

        boolean podeDirigir = maiorDeIdade && possuiCarteiraDeMotorista;
        boolean podeVotar = maiorDeIdadeVotar || maiorDeIdade;

        System.out.println("Pode dirigir: " + podeDirigir);
        System.out.println("Pode votar: " + podeVotar);
    }
}
