package com.github.daniellimadev.Exercicios.segundaSemana.AtividadePraticaPOO.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Código Limpo", "Robert Cecil Martin", 2008);
        Livro livro2 = new Livro("Java Como Programar", "Paul. J Deitel", 1996);
        Revista revista1 = new Revista("Arquitetura Limpa: o Guia do Artesão Para Estrutura e Design de Software",
                "Robert Cecil Martin", 2019, 1);

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(revista1);

        System.out.println("Listando todos os itens da biblioteca:");
        biblioteca.listarItens();

        System.out.println("\nBuscando por título '1984':");
        Item itemBuscado = biblioteca.buscarItemPorTitulo("Arquitetura Limpa: o Guia do Artesão Para Estrutura e Design de Software");
        if (itemBuscado != null) {
            itemBuscado.exibirDetalhes();
        } else {
            System.out.println("Item não encontrado.");
        }
    }
}
