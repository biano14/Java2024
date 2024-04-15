package br.com.banco;
import javax.swing.JOptionPane;

public class Testeconta {
	Conta conta = new Conta();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String titular = JOptionPane.showInputDialog("Digite " + "o nome do titular da conta:");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite" + "o numero da conta:"));
		String agencia = JOptionPane.showInputDialog("Digite" + "a sua agencia:");
		conta.setTitular(titular);
		conta.setNumero(numero);
		conta.setAgencia(agencia);
		
		//Deposito inicial
		doucle depositoInicial = Double.parseDouble(JOptionPane.showInputDialog(agencia))
		
		

	}

}
