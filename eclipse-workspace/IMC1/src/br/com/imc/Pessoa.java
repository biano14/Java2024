package br.com.imc;


public class Pessoa {
	private double altura;
	private double massa;
	private String nome;
	
	//metodos
	//calcula IMC
	
	public double calculaImc(double altura, double massa) {
		return massa/(altura*altura);
	}
	//verifica IMC
	public String verificaImc(double imc) {
	
		
		if (imc < 17) return "Ol� "+this.nome+", seu IMC � "+String.format("%.2f", imc)+" , seu diagn�stico �: Muito abaixo do peso ideal";
		else if (imc <= 18.5) {
			return "Ol� "+this.nome+", seu IMC � "+String.format("%.2f", imc)+", seu diagn�stico �: Abaixo do peso ideal";
		}
		else if (imc >= 18.51 && imc <= 24.99) {
			return "Ol� "+this.nome+", seu IMC �: "+String.format("%.2f", imc)+", seu diagn�stico �: Peso ideal";			
		}
		else if (imc >= 25 && imc <= 29.99) {
			return "Ol� "+this.nome+", seu IMC � "+String.format("%.2f", imc)+", seu diagn�stico �: Sobrepeso";					
	}
		else {
			return "Ol� "+this.nome+", seu IMC � "+String.format("%.2f", imc)+", seu diagn�stico �: Obesidade ";
		}
}
	public double getMassa() {
		return massa;
	}
	public void setMassa(double massa) {
		this.massa = massa;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
