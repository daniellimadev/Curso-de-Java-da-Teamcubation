package com.github.daniellimadev.Exercicios.terceiraSemana.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto 1", 500.0));
        produtos.add(new Produto("Produto 2", 200.0));
        produtos.add(new Produto("Produto 3", 150.0));
        produtos.add(new Produto("Produto 4", 100.0));

        List<Produto> produtosOrdenadosCrescente = produtos.stream()
                .sorted(Comparator.comparing(Produto::getNomeProduto))
                .collect(Collectors.toList());
        System.out.println("Produtos ordenados por nome, crescente: " + produtosOrdenadosCrescente + "\n");

        List<Produto> produtosOrdenadosDecrescente = produtos.stream()
                .sorted(Comparator.comparing(Produto::getNomeProduto).reversed())
                .collect(Collectors.toList());
        System.out.println("Produtos ordenados por nome, decrescente: " + produtosOrdenadosDecrescente);
    }
}
