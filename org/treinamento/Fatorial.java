package org.treinamento;

public class Fatorial {

	public static void main(String[] args) {
		int fatorial = 1;
		System.out.println("Fatorial de 0 = 1");
		for (int i = 1; i <= 10; i++){
			fatorial = fatorial * i;
			System.out.println("Fatorial de " + i + " = " + fatorial);
		}

	}

}
