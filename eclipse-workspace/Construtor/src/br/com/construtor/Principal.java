package br.com.construtor;
//importa biblioteca
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		//instacia os objetos
		Scanner leia = new Scanner(System.in);
		Pessoa usuario = new Pessoa(1, "Masculino");
		Pessoa npc = new Pessoa(2,"Feminino");
		
		//entrada de dados
		System.out.println("Informe o nome:");
		usuario.nome = leia.nextLine();
		System.out.println("Informe o CPF:");
		usuario.cpf = leia.nextLine();
		System.out.println("Informe a cidade:");
		usuario.cidade = leia.nextLine();
		System.out.println("Informe o profissão:");
		usuario.profissao = leia.nextLine();
		System.out.println("Informe o idade:");
		usuario.idade = leia.nextInt();
		
		//define os dados do npc
		npc.nome = "Leia";
		npc.idade = 18;
		npc.cidade = "Taguatinga";
		npc.cpf = "123.456.789-12";
		npc.profissao = "Bancária";
		
		//saida de dados do usuário
		System.out.println("Nome do usuário: " + usuario.nome + ".");
		System.out.println("ID do usuário: " + usuario.idPessoa + ".");
		System.out.println("Gênero do usuário: " + usuario.genero + ".");
		System.out.println("CPF do usuario: " + usuario.cpf  + ".");
		System.out.println("Cidade do usuário: " + usuario.cidade + ".");
		System.out.println("Idade do usuário: "+ usuario.idade + "." );
		System.out.println("Profissão do usuário: " + usuario.profissao + ".");
	
		//saida de dados npc
		System.out.println("Nome do NPC: " + npc.nome + ".");
		System.out.println("ID do NPC: " + npc.idPessoa + ".");
		System.out.println("Gênero do NPC: " + npc.genero + ".");
		System.out.println("CPF do NPC: " + npc.cpf  + ".");
		System.out.println("Cidade do NPC " + npc.cidade + ".");
		System.out.println("Idade do NPC: "+ npc.idade + "." );
		System.out.println("Profissão do NPC: " + npc.profissao + ".");
		
		//Encerrar leia
		leia.close();
	}

}
