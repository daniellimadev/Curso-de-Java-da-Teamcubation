package com.github.daniellimadev.Exercicios.segundaSemana.AtividadePraticaPOO.Exercicio01;

public class Livro extends Item {
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo);
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: Livro, Título: " + getTitulo() + ", Autor: " + autor
                + ", Ano de Publicação: " + anoPublicacao);
    }

    @Override
    public String getTipo() {
        return "Livro";
    }
}



