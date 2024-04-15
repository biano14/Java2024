package br.com.calculadora;

public class Pessoa {
	//Atributos
	public String nome;
	public int idade;
	
	//metodo
	
	public void verificaIdade(int idade){
		if (idade < 10) {
			System.out.println("Selecione o filme que deseja assistir:");
			System.out.println("Frozen 2 - Classifição Livre");
		}
		else if(idade < 12) {
			System.out.println("Selecione o filme que deseja assistir:");
			System.out.println("Frozen 2 - Classifição Livre");
			System.out.println("Extraordinario - Classificação 12 anos");
		}
		else if(idade < 10) {
			System.out.println("Selecione o filme que deseja assistir:");
			System.out.println("Frozen 2 - Classifição Livre");
			System.out.println("Do Outro Lado - Classificação 10 anos");
			System.out.println("Extraordinario - Classificação 12 anos");
		}
		else if (idade < 16) {
			System.out.println("Selecione o filme que deseja assistir:");
			System.out.println("Frozen 2 - Classifição Livre");
			System.out.println("Extraordinario - Classificação 12 anos");
			System.out.println("Do Outro Lado - Classificação 10 anos");
			System.out.println("A Onda - Classificação 16 anos");
		}
		else {
			System.out.println("Selecione o filme que deseja assistir:");
			System.out.println("Frozen 2 - Classifição Livre");
			System.out.println("Extraordinario - Classificação 12 anos");
			System.out.println("A Onda - Classificação 16 anos");
			System.out.println("Cidade de Deus - Classificação 18 anos");
		}
	public void menu(){	
		System.out.println("Selecione o filme que deseja assistir:");
		System.out.println("Frozen 2 - Classifição Livre");
		System.out.println("Extraordinario - Classificação 12 anos");
		System.out.println("Do Outro Lado - Classificação 10 anos");
		System.out.println("A Onda - Classificação 16 anos");
		
		
	}
}
}
