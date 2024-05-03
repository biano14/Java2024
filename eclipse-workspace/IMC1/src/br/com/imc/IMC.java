	package br.com.imc;
	import javax.swing.JOptionPane;
	//import java.util.Scanner;
	public class IMC {

		public static void main(String[] args) {
		//Scanner leia = new Scanner(System.in);//
		Pessoa paciente = new Pessoa();
		int opcao;
		do {
		String menuInicial = "Calculo de IMC\n";
		menuInicial += "1 - Calcular IMC.\n";
		menuInicial += "2 - Fechar programa\n";
		opcao = Integer.parseInt(JOptionPane.showInputDialog(menuInicial));
		if (opcao == 1) {
			//entrada de dados
			paciente.setNome(JOptionPane.showInputDialog("Informe o nome:"));
			paciente.setMassa(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso:")));
			paciente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura:")));
		
		//Calcular IMC e exibir resultado
			JOptionPane.showMessageDialog(null, paciente.verificaImc(paciente.calculaImc(paciente.getAltura(),paciente.getMassa())));
		} else if (opcao == 2) {
			JOptionPane.showMessageDialog(null, "Saúde em primeiro lugar");
		} else {
	        JOptionPane.showMessageDialog(null, "Opção inválida! Digite novamente!");
	    } 
		}while (opcao != 2);
		}
	}