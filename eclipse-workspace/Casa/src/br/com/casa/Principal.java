package br.com.casa;
import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		Casa minhaCasa = new Casa();
		Scanner leia = new Scanner(System.in);
		minhaCasa.pinta(minhaCasa.getCor());
		while(minhaCasa.getOpcao2() != 4) {
		minhaCasa.menuPrincipal();
		minhaCasa.setOpcao2(leia.nextInt());
		switch(minhaCasa.getOpcao2()){
		case 1:
			minhaCasa.selecaoAbrePorta();
			break;
		case 2:
			minhaCasa.selecaoFechaPorta();
			break;
		case 3:
			minhaCasa.pinta(minhaCasa.getCor());
			break;
		case 4:
			break;
		case 5:
			System.out.println(minhaCasa.quantasPortasEstaoAbertas()+" estão aberta.");
			System.out.println();
			break;
		default:System.out.println("Opção Inválida");
			break;
		}
		}
		leia.close();
	}

}
