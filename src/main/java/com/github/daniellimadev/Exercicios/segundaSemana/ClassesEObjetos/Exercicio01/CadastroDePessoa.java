package com.github.daniellimadev.Exercicios.segundaSemana.ClassesEObjetos.Exercicio01;

public class CadastroDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Daniel",24);
        Pessoa pessoa2 = new Pessoa("Bruno",20);

        System.out.println("Cadastrando o " + pessoa1.getNome() + " com a idade " + pessoa1.getIdade() + " anos\n");
        System.out.println("Cadastrando o " + pessoa2.getNome() + " com a idade " + pessoa2.getIdade()+ " anos\n");
        pessoa1.setIdade(25);
        System.out.println("Idade atualizada do " + pessoa1.getNome()+ " para " + pessoa1.getIdade() + " anos");

    }
}
