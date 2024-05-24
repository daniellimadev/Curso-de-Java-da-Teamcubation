package com.github.daniellimadev.Exercicios.segundaSemana.AtividadePraticaPOO.Exercicio01;

public class Revista extends Item {
    private String autor;
    private int anoPublicacao;
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo);
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: Revista, Título: " + getTitulo() + ", Autor: "
                + autor + ", Ano de Publicação: " + anoPublicacao + ", Edição: " + edicao);
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
}
