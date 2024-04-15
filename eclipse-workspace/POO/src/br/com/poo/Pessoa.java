package br.com.poo;

public class Pessoa {
	//Atributos
	public String nome;
	public String cpf;
	public String rg;
	public String profissao;
	public String telefone;
	public char genero;
	public int idade;
	public double altura;

	
	//Métdos
	//Função sem retorno: é do tipo Void+
	//Sempre que for usar um atributo da prórpria classe usa-se o : this
	public void cumprimentar() {
		System.out.println("\nOlá, meu nome é " + this.nome + ".");
		System.out.println("Tenho "+ this.idade + " anos, trabalho como "+ this.profissao + " e tenho "+ this.altura +" metross de altura.");
	}
	
	public void retribuir(String nome) {
		System.out.println("\nOlá, "+nome+". Eu sou " +this.nome+ ".");
		System.out.println("É um prazer. Tenho " +this.idade+ " anos, e trabalho como "+this.profissao+ "." );
		}
	}
