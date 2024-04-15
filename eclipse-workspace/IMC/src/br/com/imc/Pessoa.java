package br.com.imc;

public class Pessoa {
	public double altura;
	public double massa;
	public String nome;
	
	//metodos
	//calcula IMC
	
	public double calculaImc(double altura, double massa) {
		return massa/(altura*altura);
	}
	//verifica IMC
	public String verificaImc(double imc) {
		if (imc < 17) return "Olá "+this.nome+", seu IMC é "+String.format("%.2f", imc)+" , seu diagnóstico é: Muito abaixo do peso ideal";
		else if (imc <= 18.5) {
			return "Olá "+this.nome+", seu IMC é "+String.format("%.2f", imc)+", seu diagnóstico é: Abaixo do peso ideal";
		}
		else if (imc >= 18.51 && imc <= 24.99) {
			return "Olá "+this.nome+", seu IMC é: "+String.format("%.2f", imc)+", seu diagnóstico é: Peso ideal";			
		}
		else if (imc >= 25 && imc <= 29.99) {
			return "Olá "+this.nome+", seu IMC é "+String.format("%.2f", imc)+", seu diagnóstico é: Sobrepeso";					
	}
		else {
			return "Olá "+this.nome+", seu IMC é "+String.format("%.2f", imc)+", seu diagnóstico é: Obesidade ";
		}
}
}

