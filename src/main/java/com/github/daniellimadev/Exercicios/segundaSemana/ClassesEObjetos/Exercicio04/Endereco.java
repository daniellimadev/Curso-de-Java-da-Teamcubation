package com.github.daniellimadev.Exercicios.segundaSemana.ClassesEObjetos.Exercicio04;

public class Endereco {
    private String rua;
    private int numero;
    private String cidade;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String exibirEndereco() {
        return "Rua: " + getRua() + ", Numero: " + getNumero() + ", Cidade: " + getCidade();
    }
}
