package br.com.maioridade;
//importar biblioteca para entrada de dados
import java.util.Scanner;

public class Maioridade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar os objetos
		Scanner leia = new Scanner(System.in);
		Pessoa usuario = new Pessoa();
		
		//declaração de variáveis
		boolean entrada;
		
		//entrada de dados
		System.out.println("Informe o nome:");
		usuario.nome = leia.nextLine();
		System.out.println("Informe a idade:");
		usuario.idade = leia.nextInt();
		
		//verificar a idade do usuário
		
		if (usuario.idade >= 18) {
		System.out.println("Você é maior de idade, entrada liberada!");
		entrada = true;
		usuario.comemorar(entrada);
		
		} 
		else {
			System.out.println("Você é menor de idade, entrada negada!");
			entrada = false;
			usuario.brigar(entrada);
		}
		leia.close();
	}
	
}
