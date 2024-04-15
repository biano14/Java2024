package br.com.caelum.contas.modelo;


public class Conta {
	private double saldo;
	private String titular, agencia;
	private int numero;
	
	public void saca(double valor) {
		this.saldo =- valor;
	}
	public void deposita(double valor) {
		this.saldo =+ valor;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}
}
