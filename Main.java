package org.example;

import org.example.acoes.ContaBancaria;
import org.example.entity.UsuarioDoBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("********************** Olá, seja-bem vindo ao banco Anhanguera" +
                ". *************************");
        System.out.println();
        System.out.println("Para começar, vamos precisar de alguns dados seus!");

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println("Digite seu CPF: (XXX.XXX.XXX-XX)");
        String cpf = sc.nextLine();
        UsuarioDoBanco usuario = new UsuarioDoBanco(nome, sobrenome, cpf);
        System.out.println(usuario);
        System.out.println();

        ContaBancaria c1 = new ContaBancaria(0);

        System.out.println(nome + ": SELECIONE A OPÇÃO PARA COMEÇAR: ");

        int opcao;
        do {
            System.out.println("1. Ver saldo");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Saldo atual: " + c1.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = sc.nextDouble();
                    c1.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = sc.nextDouble();
                    c1.depositar(valorDeposito);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        System.out.println();
        System.out.println("O BANCO ANHANGUERA AGRADECE!");
        sc.close();
    }
}
