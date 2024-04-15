package br.com.cinema;

import java.util.Scanner;
public class Pessoa {
	public int idade;
	public String nome;
	public int opcao;
	
	Scanner leia = new Scanner(System.in);
	
	
	public int menuPrincipal() {
		System.out.println("Esses são os filmes em cartaz:");
		System.out.println("1 - Os sem floresta - Classificação Livre | Sala 10");
		System.out.println("2 - O outro lado - Classificação 10 anos | Sala 12");
		System.out.println("3 - As Vantagens de Ser Invisível - Classificação 12 anos | Sala 15");
		System.out.println("4 - A Cor Púrpura - Classificação 14 anos | Sala 18");
		System.out.println("5 - A Onda - Classificação 16 anos | Sala 1");
		System.out.println("Digite a opção desejada");
		return opcao =leia.nextInt();
	}
	public void validarIdade(int idade) {
		switch(opcao) {
		case 1:
			System.out.println("Ingresso emitido. Bom filme, "+this.nome+".");
			break;
		case 2:
			if(idade < 10) {
				System.out.println("Você não tem a idade minima, escolha outro filme");
				menuPrincipal();
				validarIdade(idade);
			}
			else {
				System.out.println("Ingresso emitido. Bom filme, "+this.nome+".");
			}
			break;
		case 3:
			if(idade < 12) {
				System.out.println("Você não tem a idade minima, escolha outro filme");
				menuPrincipal();
				validarIdade(idade);
			}
			else {
				System.out.println("Ingresso emitido. Bom filme, "+this.nome+".");
			}
			break;
		case 4:
			if(idade < 14) {
				System.out.println("Você não tem a idade minima, escolha outro filme");
				menuPrincipal();
				validarIdade(idade);
			}
			else {
				System.out.println("Ingresso emitido. Bom filme, "+this.nome+".");
			}
			break;
		case 5:
			if(idade < 16) {
				System.out.println("Você não tem a idade minima, escolha outro filme");
				menuPrincipal();
				validarIdade(idade);
			}
			else {
				System.out.println("Ingresso emitido. Bom filme, "+this.nome+".");
			}
			break;
		default:
			System.out.println("Opção inválida");
			menuPrincipal();
			validarIdade(idade);
			break;
	}
		
		}
	}
	