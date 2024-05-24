package com.github.daniellimadev.Exercicios.segundaSemana.ClassesEObjetos.Exercicio04;

public class Pessoa extends Endereco {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void exibirPessoa() {
        System.out.println("Nome: " + getNome() + "\nEndereco: " + exibirEndereco());
    }
}
