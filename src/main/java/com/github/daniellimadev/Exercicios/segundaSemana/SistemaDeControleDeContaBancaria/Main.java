package com.github.daniellimadev.Exercicios.segundaSemana.SistemaDeControleDeContaBancaria;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        ContaBancaria conta1 = new ContaBancaria("Daniel", "12345-6", 1000.00);
        ContaBancaria conta2 = new ContaBancaria("Bruna", "79682-3", 5000.00);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        banco.listarContas();

        System.out.println("\nDepositando na conta: " + conta1.getNumeroConta());
        conta2.depositar(150.00);

        System.out.println("\nTransferindo da conta " + conta2.getTitular() + " para conta do " + conta1.getTitular());
        conta2.transferir(500.00, conta1);


        System.out.println("\nSacando da conta " + conta1.getTitular());
        conta1.sacar(20.00);

        banco.buscarConta("79682-3");

    }
}
