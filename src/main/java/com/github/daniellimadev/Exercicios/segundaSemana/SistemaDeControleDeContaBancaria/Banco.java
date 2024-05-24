package com.github.daniellimadev.Exercicios.segundaSemana.SistemaDeControleDeContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco extends ContaBancaria {
    List<ContaBancaria> contas = new ArrayList<ContaBancaria>();



    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void buscarConta(String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                System.out.println("\nBuscando por número da conta: " + conta.getNumeroConta());
                System.out.println(conta);
            }
        }
    }

    public  void listarContas() {
        System.out.println("Lista de contas:");
        for (ContaBancaria conta : contas) {
            System.out.println(conta.toString());
        }
    }

}
