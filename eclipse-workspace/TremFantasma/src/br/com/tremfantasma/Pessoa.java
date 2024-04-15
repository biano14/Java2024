package br.com.tremfantasma;

public class Pessoa {
	//atributos
	public String nome;
	public int idade;
	public double altura;
	public double dinheiro;
	
	//metodo String
	public String pagar(double valor) {
		// verificar pagamento
		
		if(valor == 15) {
			 return "Entrada liberada.";
		}
		else if (valor > 15) {
			return "Entrada liberada após troco.";					
		}
		else {
			return "Dinheiro insuficiente para pagar a entrada.";
		}
	}
}
