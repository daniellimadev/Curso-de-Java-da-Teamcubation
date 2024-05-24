package com.github.daniellimadev.Exercicios.segundaSemana.AtividadePraticaPOO.Exercicio01;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Item> itens;

    public Biblioteca() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void listarItens() {
        for (Item item : itens) {
            item.exibirDetalhes();
        }
    }

    public Item buscarItemPorTitulo(String titulo) {
        for (Item item : itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item;
            }
        }
        return null;
    }
}





