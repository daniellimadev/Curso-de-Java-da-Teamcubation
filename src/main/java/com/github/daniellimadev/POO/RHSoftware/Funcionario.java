package com.github.daniellimadev.POO.RHSoftware;

public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(int id, String nome, String cpf, double salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public void aumentarSalarioPorPercentual(double percentual) {
        this.salario += this.salario * percentual /100;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | CPF: " + this.cpf + " | Salario:" + this.salario;
    }
}
