package br.com.tremfantasma;
//importando biblioteca
import java.util.Scanner;

public class TremFantasma {

	public static void main(String[] args) {
		
		//instacia objetos
		Scanner leia = new Scanner(System.in);
		Pessoa pagante = new Pessoa();
		
		//Entrada de dados
		System.out.println("Informe o nome:");
		pagante.nome = leia.nextLine();
		System.out.println("Infome a idade:");
		pagante.idade = leia.nextInt();
		System.out.println("Informe a altura:");
		pagante.altura = leia.nextDouble();
		
		//Verifica a idade e a altura
		if (pagante.idade >= 12 && pagante.altura > 1.2) {
			//entrar nesse bloco, as duas condições precisam ser verdadeiras
			System.out.println("Pague o valor de R$ 15,00");
			pagante.dinheiro = leia.nextDouble();
			System.out.println(pagante.pagar(pagante.dinheiro));
		}
		else {
			System.out.println("Entrada proibida.");
			
		}
		//fechar a instacia leia
		leia.close();
		
	}

}
