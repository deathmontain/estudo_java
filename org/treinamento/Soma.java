package org.treinamento;

public class Soma {
	public static void main(String[] args){
		int resultado = 0;
		int ultimoValorDaSoma;
		for (int x = 0; x <= 1000; x++) {
			ultimoValorDaSoma = resultado;
			resultado += x;
			System.out.printf("%d + %d = %d\n", ultimoValorDaSoma, x, resultado);
		}
		
	}
	
}
