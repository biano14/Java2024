package br.com.construtor;

public class Pessoa {

	//atributos
	public String nome;
	public String cpf;
	public String cidade;
	public String profissao;
	public String genero;
	public int idade;
	public int idPessoa;
		
	public Pessoa(int idPessoa,String genero) {
		this.idPessoa = idPessoa;
		this.genero = genero;
	}

}
