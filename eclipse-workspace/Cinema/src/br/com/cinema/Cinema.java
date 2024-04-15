package br.com.cinema;

import java.util.Scanner;
public class Cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Pessoa cliente = new Pessoa();
		
		System.out.println("Bem vindo ao Cinema Senai.");
		System.out.println("Por gentileza, informe seu nome:");
		cliente.nome = leia.nextLine();
		System.out.println("Informe sua idade:");
		cliente.idade = leia.nextInt();
		cliente.menuPrincipal();
		cliente.validarIdade(cliente.idade);
		leia.close();
		
	}
}