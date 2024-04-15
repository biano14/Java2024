package br.com.casa;
import java.util.Scanner;
public class Casa {
//variaveis
	private String cor;
	private boolean porta1 = false, porta2 = false ,porta3 = false;
	private int opcao1,opcao2;
	
	
	Scanner leia = new Scanner(System.in);
	void menuPrincipal() {
		System.out.println("Bem vindo a sua casa");
		System.out.println("Escolha a opção desejada");
		System.out.println("1 - Abrir uma porta.");
		System.out.println("2 - Fechar uma porta.");
		System.out.println("3 - Pintas as portas de outra cor.");
		System.out.println("4 - Fechar programa.");
		System.out.println("5 - Verificar quantas portas estão aberta");
		System.out.println("Cor atual das portas: "+this.getCor());
	}
	void pinta(String cor) {
		System.out.println("Qual cor deseja pintar as portas:");
		this.setCor(leia.nextLine());		
	}
	
	void selecaoAbrePorta() {
		System.out.println("Selecione qual porta deseja abrir (1, 2 ou 2):");
		this.opcao1 = leia.nextInt();
		switch(this.opcao1) {
		case 1:
			if (this.porta1 == false) {
				this.porta1 = true;
				System.out.println("A porta 1 foi aberta");
				System.out.println();
			}
			else {
				System.out.println ("A porta já está aberta." );
				System.out.println();
			}
			break;
		case 2:
			if (this.porta2 == false) {
				this.porta2 = true;
				System.out.println("A porta 2 foi aberta");
				System.out.println();
			}
			else {
				System.out.println ("A porta já está aberta." );
				System.out.println();
			}
			break;
		case 3:
			if (this.porta3 == false) {
				this.porta3 = true;
				System.out.println("A porta 1 foi aberta");
				System.out.println();
			}
			else {
				System.out.println ("A porta já está aberta." );
				System.out.println();
			}
			break;
		default: System.out.println("Opção inválido");
		System.out.println();
		}
	}
	void selecaoFechaPorta() {
		System.out.println("Selecione qual porta deseja fechar (1, 2 ou 2):");
		this.opcao1 = leia.nextInt();	
		switch(this.opcao1) {
		case 1:
			if (this.porta1 == true) {
				this.porta1 = false;
				System.out.println();
			}
			else {
				System.out.println ("A porta já está fechada." );
				System.out.println();
			}
			break;
		case 2:
			if (this.porta2 == true) {
				this.porta2 = false;
				System.out.println("A porta 2 foi fechada.");
				System.out.println();
			}
			else {
				System.out.println ("A porta já está fechada." );
				System.out.println();
			}
			break;
		case 3:
			if (this.porta3 == true) {
				this.porta3 = false;
				System.out.println("A porta 1 foi fechada.");
				System.out.println();
			}
			else {
				System.out.println ("A porta já está fechada." );
				System.out.println();
			}
			break;
		default: 
			System.out.println("Opção inválido");
			System.out.println();
				
	}
		
	}
	
	public int quantasPortasEstaoAbertas() {
		int quantidade = 0;
		if(this.porta1 == true) {
			quantidade = quantidade + 1;
			}
		if(this.porta2 == true) {
			quantidade = quantidade + 1;
		}
		if(this.porta2 == true) {
			quantidade = quantidade + 1;
		}
		return quantidade;
	}
	public int getOpcao2() {
		return opcao2;
	}
	public void setOpcao2(int opcao2) {
		this.opcao2 = opcao2;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
