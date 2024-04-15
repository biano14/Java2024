package br.com.banco;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		Conta minhaConta = new Conta(4568, 1000.0, "Gustavo Fabiano", "1234-89");
		Conta minhaConta2 = new Conta(7896, 1000, "Francisco", "1234-89");
		Scanner leia = new Scanner(System.in);
		Data data = new Data();
		Data data2 = new Data();
		int total = Conta.getTotalDeContas();
		minhaConta.setDataAbertura(data);
		minhaConta2.setDataAbertura(data2);
		minhaConta.getDataAbertura().preencheData(21, 03, 2024);
		minhaConta2.getDataAbertura().preencheData(31, 03, 2023);
		// Linha antes de usar a Class Data no lugar da string
		/* minhaConta.dataAbertura = "20/03/2024"; */
		while (minhaConta.getOpcao() != 5) {
			minhaConta.menuPrincipal();
			minhaConta.setOpcao(leia.nextInt());

			switch (minhaConta.getOpcao()) {
			case 1:
				System.out.println(minhaConta.recuperaDadosParaImpressao());
				System.out.println(minhaConta2.recuperaDadosParaImpressao());
				System.out.println("O total de conta criadas é "+ total);
				break;
			case 2:
				System.out.println("Informe o valor do deposito: ");
				minhaConta.setOperador(leia.nextDouble());
				minhaConta.depositar(minhaConta.getOperador());

				break;
			case 3:
				System.out.println("Infome o valor do saque: ");
				minhaConta.setOperador(leia.nextDouble());
				minhaConta.sacar(minhaConta.getOperador());

				break;
			case 4:
				minhaConta.calculaRendimento();
			case 5:
				break;
			default:
				System.out.println("Opção Inválida. Selecione outra opção. \n");
				break;

			}
		}
		leia.close();
	}
}
