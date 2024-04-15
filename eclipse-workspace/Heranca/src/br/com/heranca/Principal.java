package br.com.heranca;

//importando biblioteca
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		PessoaFisica usuario = new PessoaFisica();
		PessoaJuridica empresa = new PessoaJuridica();
		
		//entrada de dados da pessoa fisica
		System.out.println("Informe o nome: ");
		usuario.nome = leia.nextLine();
		System.out.println("Informe o CPF: ");
		usuario.cpf = leia.nextLine();
		System.out.println("Informe o endereço: ");
		usuario.endereco = leia.nextLine();
		System.out.println("Informe o telefone: ");
		usuario.telefone = leia.nextLine();
		System.out.println("Informe o email: ");
		usuario.email = leia.nextLine();
		
		//entrada de dados da pessoa juridica
		System.out.println("Informe a razão social da empresa: ");
		empresa.razaoSocial = leia.nextLine();
		System.out.println("Informe o nome fantasia: ");
		empresa.nomeFantasia = leia.nextLine();
		System.out.println("Informe o CNPJ da empresa: ");
		empresa.cnpj = leia.nextLine();
		System.out.println("Infome o endereço da empresa: ");
		empresa.endereco = leia.nextLine();
		System.out.println("Informe o telefone da empresa: ");
		empresa.telefone = leia.nextLine();
		System.out.println("Infome o email da empresa: ");
		empresa.email = leia.nextLine();
		
		//saída de dados pessoa fisica
		System.out.println("DADOS DA PESSOA FISÍCA");
		System.out.println();
		System.out.println("Nome: " + usuario.nome +".");
		System.out.println("CPF: " + usuario.cpf + "." );
		System.out.println("Endereço: " +usuario.endereco + ".");
		System.out.println("Telefone: " + usuario.telefone + ".");
		System.out.println("Email: " + usuario.email + ".");
		System.out.println();
		
		//saida de dados pessoa juridica
		System.out.println("DADOS DA PESSOA JURÍDICA");
		System.out.println();
		System.out.println("Razão social: " + empresa.razaoSocial + ".");
		System.out.println("Nome Fantasia: " + empresa.nomeFantasia +".");
		System.out.println("CNPJ: " + empresa.cnpj + ".");
		System.out.println("Endereço: " + empresa.endereco + ".");
		System.out.println("Telefone: " + empresa.telefone + ".");
		System.out.println("Email: " + empresa.email + ".");
		
		leia.close();
		

	}

}
