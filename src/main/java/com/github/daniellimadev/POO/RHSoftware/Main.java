package com.github.daniellimadev.POO.RHSoftware;

public class Main {
    public static void main(String[] args) {
        // Sistema de gerenciamento de funcionarios
        // Classes, métodos e construtores
        // 3 classes: Main, Funcionario e Empresa

        // Funcionario: int id, String cpf, String nome, double salario
        // Empresa: int id, String nome, String cnpj
        // Main consumir e manipular as classes.

        Empresa empresa = new Empresa(1,"XPTO", "80.981.418/0001-66");
        Funcionario funcionario01 = new Funcionario(1, "João Silva","261.754.210-60",3000.00);
        Funcionario funcionario02 = new Funcionario(2, "Maria Batista","256.545.140-75",5000.00);

        empresa.adicionarFuncionario(funcionario01);
        empresa.adicionarFuncionario(funcionario02);

        empresa.listarFuncionarios();

        funcionario01.aumentarSalarioPorPercentual(15);
        System.out.println();
        empresa.listarFuncionarios();
        System.out.println("Sistema finalizado com sucesso!");

    }

}
