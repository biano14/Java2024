package br.com.banco;

import java.util.Scanner;

public class Principal {

	public Principal() {
		Scanner leia = new Scanner(System.in);
		ContaPoupanca usuario = new ContaPoupanca();
		ContaCorrente poupador = new ContaCorrente();
		
		System.out.println("Informe o nome: ");
		usuario.nome = leia.nextLine();
		System.out.println("Informe o CPF: ");
		usuario.cpf = leia.nextLine();
	}
}