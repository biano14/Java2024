package br.com.poo;

public class Poo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instancia de objeto é a criação e um objeto em uma classe
		//Pessoa() é o metodo construtor da classe. Toda classe tem um metódo construtor
		//ATRIBUTO DO tipo pessoa recebe novo objeto Pessoa
		Pessoa humano = new Pessoa();
		Pessoa humana = new Pessoa();
		
		//Definindo valores do objeto
		humano.nome = "Raizinho";
		humano.idade = 18;
		humano.cpf = "123.456.789.10";
		humano.rg = "122.211" ;
		humano.genero = 'm';
		humano.profissao = "Programador";
		humano.telefone = "(61) 91897-6886";
		humano.altura = 1.75;
				
		//Saída de dados
		/*System.out.println("\n:: Dados do humano :: ");
		System.out.println("Nome: "+ humano.nome + ".");
		System.out.println("Idade: " +humano.idade + ".");
		System.out.println("Genêro: " + humano.genero + ".");
		System.out.println("Altura: " + humano.altura + "." );
		System.out.println("CPF: "+ humano.cpf + ".");
		System.out.println("RG: "+ humano.rg + ".");
		System.out.println("Telefone: "+ humano.telefone + ".");
		System.out.println("Profisão: "+ humano.profissao + ".");
		*/
		
		//atribuindo valores para a Humana:
		humana.nome = "Raimundinha";
		humana.idade = 20;
		humana.cpf = "355.456.789.10";
		humana.rg = "122.277" ;
		humana.genero = 'F';
		humana.profissao = "Scrum Master";
		humana.telefone = "(61) 99897-6554";
		humana.altura = 1.62;
		
		//Saída de dados
		/*
		System.out.println("\n:: Dados do humana :: ");
		System.out.println("Nome: "+ humana.nome + ".");
		System.out.println("Idade: " +humana.idade + ".");
		System.out.println("Genêro: " + humana.genero + ".");
		System.out.println("Altura: " + humana.altura + "." );
		System.out.println("CPF: "+ humana.cpf + ".");
		System.out.println("RG: "+ humana.rg + ".");
		System.out.println("Telefone: "+ humana.telefone + ".");
		System.out.println("Profisão: "+ humana.profissao + ".");		
		*/
		
		//Saída de de dados
		humano.cumprimentar();
		humana.retribuir(humano.nome);
	}

}
