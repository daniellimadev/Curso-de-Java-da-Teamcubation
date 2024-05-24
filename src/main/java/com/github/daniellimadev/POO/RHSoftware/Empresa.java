package com.github.daniellimadev.POO.RHSoftware;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private int id;
    private String nome;
    private String cnpj;
    List<Funcionario> funcionarios;

    public Empresa(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
       for (Funcionario funcionario : funcionarios) {
           System.out.println(funcionario.toString());
       }
    }
}
