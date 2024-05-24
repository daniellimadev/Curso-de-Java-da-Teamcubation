package com.github.daniellimadev.Exercicios.segundaSemana.ClassesEObjetos.Exercicio02;

public class CadastroDeCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        carro1.setModelo("Uno");
        carro1.setAno(2015);

        Carro carro2 = new Carro("Volkswagen", "Polo", 2024);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}
