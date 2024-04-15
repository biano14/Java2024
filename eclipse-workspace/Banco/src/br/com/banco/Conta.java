package br.com.banco;

import java.util.Scanner;

public class Conta {
	public String nome;
	public String cpf;
	public String agencia;
	public int opcao;
	
	public Conta() {
		
	}
	
	public void SelecionaConta() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Banco Senai");
		System.out.println("1 - Criar conta poupanca");
		System.out.println("2 - Criar conta Corrente");
		System.out.println("Selecione uma das opcao.");
		opcao = leia.nextInt();
		
	}
	public void MenuPrincipal() {
		System.out.println("\n::::: Banco Senai ::::: \n\n");
		System.out.println("Escolha a opcao desejada: \n");
		System.out.println("1 - Consultar dados da conta. \n");
		System.out.println("2 - Consutar saldo da conta. \n");
		System.out.println("3 - Depositar na conta. \n");
		System.out.println("4 - Sacar valor na conta. \n");
		System.out.println("5 - Sair do programa. \n");
	}
	public double DepositarValor(double valor, double saldo, int opcao) {
		if(opcao == 1) {
		return saldo = valor*1.1 + saldo;
		}
		else
		return saldo += valor;	
			
	}
	public void DadosDaConta(String conta) {
		System.out.println("Nome: " +this.nome+ ".");
		System.out.println("CPF: " +this.agencia+ ".");
		System.out.println("Agencia: " +this.agencia+ ".");
		System.out.println("Conta: " +conta+ ".");
	}
	public void Saldo(double saldo) {
		System.out.println("Seu saldo é: R$ "+saldo+".");
	}
	public double SacarValor(double valor, double saldo) {
		if (saldo >= 0) {
			System.out.println("Seu saldo é insulficente.");
		}
		else
			return 1.0;
		return 0.0;
		
	}
	
}
