package br.com.banco;

public class Conta {

	// Variaveis
	private int identificador;
	private static int proximoIdentificador;
	private int numero;
	private double saldo;
	private String titular;
	private String agencia;
	private Data dataAbertura;
	private double operador;
	private int opcao;
	private static int totalDeContas;

	Conta() {}

	Conta(int numero, double saldo, String titular, String agencia) {
		this.setTitular(titular);
		this.setAgencia(agencia);
		this.setNumero(numero);
		this.setSaldo(saldo);
		System.out.println("Construindo uma conta");
		Conta.totalDeContas = Conta.totalDeContas + 1;
		this.identificador = proximoIdentificador++;
	}

	// Metodos
	public boolean sacar(double quantidade) {
		if (quantidade > 0 && quantidade <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - quantidade);
			System.out.println("Saque efetuado com sucesso.\n");
			return true;

		} else {
			System.out.println("Seu saldo não é suficiente e/ou o valor informado é inválido\n");
			return false;
		}
	}

	public void depositar(double quantidade) {
		if (quantidade > 0)
			this.setSaldo(this.getSaldo() + quantidade);
		else
			System.out.println("Valor de deposito inválido\n");
	}

	public void calculaRendimento() {
		System.out.println("Seu redimento é: R$ " + this.getSaldo() * 0.1 + ".\n");
	}

	boolean transferePara(Conta destino, double valor) {
		boolean retirou = this.sacar(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.depositar(valor);
			return true;
		}
	}

	public void menuPrincipal() {
		System.out.println("\nBem-vindo ao Banco Senai");
		System.out.println("Selecione uma das opções a seguir:");
		System.out.println("1 - Recuperar dados para impressão.");
		System.out.println("2 - Depositar Valor.");
		System.out.println("3 - Sacar um Valor.");
		System.out.println("4 - Calcular Rendimento");
		System.out.println("5 - Sair");
	}

	// metodo sem retorno que utiliza sysout e a data de abertura como string
	/*
	 * public void recuperaDadosParaImpressao() { System.out.println("Titular: " +
	 * this.titular + "."); System.out.println("Agência: " + this.agencia + ".");
	 * System.out.println("Número da Conta: " + this.numero + ".");
	 * System.out.println("Saldo: R$" +this.saldo+".");
	 * System.out.println("Data de Abertura: " + this.dataDeAbertura+ ".\n"); }
	 */
	public String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.getTitular() + ".";
		dados += "\nAgência: " + this.getAgencia() + ".";
		dados += "\nNúmero da Conta: " + this.getNumero() + ".";
		dados += "\nSaldo: R$" + this.getSaldo() + ".";
		dados += "\nData de Abertura: " + this.getDataAbertura().formatada();
		dados += "\nIdentificador: " + this.getIdentificador() + ".";
		// linhas usada antes de modificar para a versão formatada
		/*
		 * dados +="\nDia: " + this.dataAbertura.dia+"."; dados +="\nMês: " +
		 * this.dataAbertura.mes+"."; dados +="\nAno: " + this.dataAbertura.mes+ ".\n";
		 */
		return dados;

	}

	public double getOperador() {
		return operador;
	}

	public void setOperador(double operador) {
		this.operador = operador;
	}

	public double getIdentificador() {
		return identificador;
	}

	public void setIndentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}

class Data {
	int dia;
	int mes;
	int ano;

	String formatada() {
		if(this.isDataViavel(dia, mes, ano))
		return this.dia + "/" + this.mes + "/" + this.ano + ".\n";
		else {
			return "Data inválida";
		}
	}

	void preencheData(int dia, int mes, int ano) {
		if(this.isDataViavel(dia, mes, ano)) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		}
			
	}

	private boolean isDataViavel(int dia, int mes, int ano) {
		if (ano <= 0 || mes <= 0) {
			return false;
		}
		int ultimoDiaMes = 31;
		if (mes == 4 || mes == 9 || mes == 11) {
			ultimoDiaMes = 30;
		} else if (mes == 2) {
			if (ano % 4 == 0) {
				ultimoDiaMes = 29;
			} else {
				ultimoDiaMes = 28;
			}
		}
		if (dia > ultimoDiaMes) {
			return false;
		}
		return true;
	}
}
