package br.com.imc;

import java.util.Scanner;
public class IMC {

	public static void main(String[] args) {
		// Crie um programa que calcula o IMC do usuário e retorna  diagnostico da saude do usuário, se 		está abaixo do peso, no peso ideal, se está acima do peso, ou se está obeso.
	Scanner leia = new Scanner(System.in);
	Pessoa paciente = new Pessoa();
	
	//entrada de dadp
	System.out.println("Informe o nome do paciente:");
	paciente.nome = leia.nextLine();
	System.out.println("Informe o peso do paciente em Kg:");
	paciente.massa = leia.nextDouble();
	System.out.println("Informe a altura do paciente em metros:");
	paciente.altura = leia.nextDouble();
	
	System.out.println(paciente.verificaImc(paciente.calculaImc(paciente.altura, paciente.massa)));
	leia.close();
	
	}

}
