package org.example.acoes;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de: R$" + valor + " realizado com sucesso!");
    }
    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("VALOR INSUFICENTE!");
        } else {
            valor -= saldo;
            System.out.println("Saque de " + valor + " realizado com sucesso!");
        }
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Saldo= " + saldo;
    }
}
