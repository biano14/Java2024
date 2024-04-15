package br.com.fibonacci;

public class Principal {
	public static void main(String args[]) {
		Fibonacci fibonacci = new Fibonacci();
		for(int i = 1; i <= 6; i++){			
				System.out.print(fibonacci.calculaFibonacci(i) +" ");
			}

	}
}
