package br.com.calculadora;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// instancia de objetos
		Scanner leia = new Scanner(System.in);
		
		//declaração de variaveis
		double x, y, result;
		int opcao;
		
		
		//faça enquanto
		do {
			
			//entrada de dados
			
			System.out.println("Informe o 1º número:");
			x = leia.nextDouble();
			System.out.println("Informe o 2º número:");
			y = leia.nextDouble();
			
			//limpeza de buffer
			
			leia.nextLine();
			
			// mostra as opções
			
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Soma.");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair");
			opcao = leia.nextInt();
			
			
			//escolha...caso
			switch (opcao) {
			case 1:
				result = x + y;
				System.out.println("O resultado da soma é "+result+".");
				break;
			case 2:
				result = x - y;
				System.out.println("O resultado da subtração é "+result+".");
				break;
			case 3:
				result = x * y;
				System.out.println("O resultado da multiplicação é "+result+".");
				break;
			case 4:
				result = x / y;
				System.out.println("O resultado da divisão é "+result+".");
				break;
			case 5:
				System.out.println("Programa encerrado.");
				break;
			default:
				System.out.println("Opção inválida");
			}
			
		} while (opcao != 5);
		//encerrar leia		
		leia.close();
	}

}
