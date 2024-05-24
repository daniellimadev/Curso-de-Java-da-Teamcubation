package com.github.daniellimadev.Exercicios.segundaSemana.ClassesEObjetos.Exercicio02;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void exibirDetalhes () {
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\n");
    }
}
