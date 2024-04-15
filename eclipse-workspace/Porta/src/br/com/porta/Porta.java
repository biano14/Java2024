package br.com.porta;

public class Porta {
	//variaveis
	private boolean aberta = false;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	private int opcao;

	//metodos
	public boolean abre() {
		if ( this.aberta == false ) {
			return this.aberta = true;
		}
		else {
			System.out.println ("A porta já está aberta." );
			return true;
		}
	}

	public boolean fecha() {
		if (this.aberta == true) {
			return this.aberta = false;
		}
		else {
			System.out.println ( "A porta já está fechada." );
			return false;
		}
	}

	public void verificaPorta() {
			System.out.println ( this.aberta == false ? "fechada" : "aberta" );
		}
	

	public void pinta(String c) {
		this.setCor(c);
		System.out.println ( "A porta foi pintada de " + this.getCor() );
	}

	public void mostra() {
		System.out.print ( "A porta " + this.getCor() + " de tamanho: " + this.getDimensaoX() + " x " + this.getDimensaoY() + " x " + this.getDimensaoZ() + " esta " ); this.verificaPorta();
	}
	
	public void menu() {
		System.out.println("1 - Abrir porta.");
		System.out.println("2 - Fechar porta.");
		System.out.println("3 - Verificar estado da porta");
		System.out.println("4 - Encerrar Programa");
		}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
}
