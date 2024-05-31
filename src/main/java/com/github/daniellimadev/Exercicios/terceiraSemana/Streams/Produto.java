package com.github.daniellimadev.Exercicios.terceiraSemana.Streams;

public class Produto {
    private String nomeProduto;
    private double valorUnitario;

    public Produto(String nomeProduto, double valorUnitario) {
        this.nomeProduto = nomeProduto;
        this.valorUnitario = valorUnitario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}

