package com.github.daniellimadev.Exercicios.segundaSemana.SistemaDeControleDeContaBancaria;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {

    }
    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public boolean sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            System.out.println("No Valor de R$ " + valor);
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("No Valor de R$ " + valor);
        System.out.println("Operação bem-sucedida");
    }

    public boolean transferir(double valor, ContaBancaria destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;

            destino.depositar(valor);
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }

    @Override
    public String toString() {
        return "Titular: " + this.titular + " | Número da Conta: "
                + this.numeroConta
                + " | Saldo da conta: " + this.saldo;
    }
}
