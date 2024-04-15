package br.com.entrada;

//importar biblioteca para entrada de dados
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instancia os objetos
		Pessoa humano = new Pessoa();
		Pessoa npc = new Pessoa();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o nome do humano:");
		humano.nome = leia.nextLine();
		
		System.out.println("Informe a idade do humano:");
		humano.idade = leia.nextInt();
		
		//limpeza de buffer
		leia.nextLine();
		
		System.out.println("Informe a cidade do humano:");
		humano.cidade = leia.nextLine();
		
		System.out.println("Informe a profissão do humano:");
		humano.profissao = leia.nextLine();
		
		//informar os dados do npc
		npc.nome = "Nathyla Dochorn";
		npc.idade = 25;
		npc.cidade = "Alexania";
		npc.profissao = "Fantasma";
		
		//Saída de dados para testar os objetos
		
		/*System.out.println("\nNome: " + humano.nome + ".\n");
		System.out.println("Idade: " + humano.idade + ".\n");
		System.out.println("Cidade: " + humano.cidade + ".\n");
		System.out.println("Profissao: " + humano.profissao + ".");*/
		humano.apresentar();
		npc.responderCumprimento(humano.nome);
		npc.perguntarNome();
		humano.responderCumprimento(npc.nome);
		humano.perguntarIdade(npc.nome);
		npc.responderIdade();
		npc.perguntarIdade(humano.nome);
		humano.responderIdade();
		humano.perguntarCidade(npc.nome);
		npc.responderCidade();
		npc.perguntarCidade(humano.nome);
		humano.responderCidade();
		humano.perguntarProfissao(npc.nome);
		npc.responderProfissao();
		npc.perguntarProfissao(humano.nome);
		humano.responderProfissao();
		
		//encerrando o objeto Scanner
		leia.close();
		
	}

}
