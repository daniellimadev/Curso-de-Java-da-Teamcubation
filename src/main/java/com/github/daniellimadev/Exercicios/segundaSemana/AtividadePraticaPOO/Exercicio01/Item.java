package com.github.daniellimadev.Exercicios.segundaSemana.AtividadePraticaPOO.Exercicio01;

public abstract class Item implements ItemBiblioteca {
    private String titulo;

    public Item(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract String getTipo();
}
