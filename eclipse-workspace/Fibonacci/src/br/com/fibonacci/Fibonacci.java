package br.com.fibonacci;

public class Fibonacci{
		int calculaFibonacci(int n){
			return  n <= 1 ? 1  : calculaFibonacci(n-2) + calculaFibonacci(n-1) ;
		}
						
		}
