package br.com.construtores;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//instaciando os objetos
		Scanner leia = new Scanner(System.in);
		Pessoa programador = new Pessoa();
		Pessoa usuario = new Pessoa(1, "Masculino");
		Pessoa npc = new Pessoa(2, "Leia", "999.999.999-99", "Bancaria", "Virtual", 18);
		
		//entrada de dados do usuarip
		System.out.println("Informe o nome do usuário:");
		usuario.nome = leia.nextLine();
		System.out.println("Informe o CPF do usuário:");
		usuario.cpf = leia.nextLine();
		System.out.println("Informe o profissão do usuário:");
		usuario.profissao = leia.nextLine();
		System.out.println("Informe a idade do usuário:");
		usuario.idade = leia.nextInt();
		
		
		
		//entrada de dados do programador
		System.out.println("Informe o ID do programador:");
		programador.idPessoa = leia.nextInt();
		
		//limpeza de buffer
		leia.nextLine();
		
		System.out.println("Informe o nome do programador:");
		programador.nome = leia.nextLine();
		System.out.println("Informe o CPF do programador:");
		programador.cpf = leia.nextLine();
		System.out.println("Informe o genêro do programador:");
		programador.genero = leia.nextLine();
		System.out.println("Informe o profissão do programador:");
		programador.profissao = leia.nextLine();
		programador.idade = leia.nextInt();
		
		//saida de dados do usuário
		System.out.println("Nome do usuário: " + usuario.nome + ".");
		System.out.println("ID do usuário: " + usuario.idPessoa + ".");
		System.out.println("Gênero do usuário: " + usuario.genero + ".");
		System.out.println("CPF do usuario: " + usuario.cpf  + ".");
		System.out.println("Idade do usuário: "+ usuario.idade + "." );
		System.out.println("Profissão do usuário: " + usuario.profissao + ".");
			
		//saida de dados npc
		System.out.println("Nome do NPC: " + npc.nome + ".");
		System.out.println("ID do NPC: " + npc.idPessoa + ".");
		System.out.println("Gênero do NPC: " + npc.genero + ".");
		System.out.println("CPF do NPC: " + npc.cpf  + ".");
		System.out.println("Idade do NPC: "+ npc.idade + "." );
		System.out.println("Profissão do NPC: " + npc.profissao + ".");
		
		//saida de dados do programador
		System.out.println("Nome do programador: " + programador.nome + ".");
		System.out.println("ID do programador: " + programador.idPessoa + ".");
		System.out.println("Gênero do programdor: " + programador.genero + ".");
		System.out.println("CPF do programador: " + programador.cpf  + ".");
		System.out.println("Idade do programdor: "+ programador.idade + "." );
		System.out.println("Profissão do programdor: " + programador.profissao + ".");
				
		//Encerrar leia
		leia.close();
	}

}
