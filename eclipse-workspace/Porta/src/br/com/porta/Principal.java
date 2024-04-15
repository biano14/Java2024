package br.com.porta;
import java.util.Scanner;
public class Principal {

	
	
	public static void main(String[] args) {
		Porta porta = new Porta();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a cor que deseja pintar sua porta: ");
		porta.setCor(leia.nextLine());
		System.out.println("Informe a largura da porta: ");
		porta.setDimensaoX(leia.nextDouble());
		System.out.println("Informe a altura da porta: ");
		porta.setDimensaoY(leia.nextDouble());
		System.out.println("Informe o comprimento da porta: ");
		porta.setDimensaoZ(leia.nextDouble());
		while (porta.getOpcao() != 4) {
		porta.menu();
		porta.setOpcao(leia.nextInt());
		
		switch(porta.getOpcao()) {
		case 1 : porta.abre();
			System.out.println();
			break;
		case 2 : porta.fecha();
			System.out.println();
			break;
		case 3 : porta.mostra(); 
			System.out.println();
			break;
		case 4 :
			break;
		default:
			System.out.println("Opção invalida");
			System.out.println();
			break;
		}
		}
		leia.close();
	}

}
