package br.com.construtores;

public class Pessoa {
	public String nome;
	public String cpf;
	public String profissao;
	public String genero;
	public int idade;
	public int idPessoa;
	
	//COntrutores
	public Pessoa() {
		//construtor sem nada
	}
	public Pessoa(int idPessoa, String genero) {
		this.idPessoa = idPessoa;
		this.genero = genero;
		
	}
	public Pessoa(int idPessoa, String nome, String cpf, String profissao, String genero, int idade) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.genero = genero;
		this.idade = idade;
		
		
	}
}
