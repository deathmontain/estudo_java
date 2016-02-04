package org.treinamento;

public class PercorrendoArray {

	public static void main(String[] args) {
		int [] idade = new int[10];
		
		for (int i = 0; i < 10; i++){
			idade[i] = i *10;
		}
		for (int i = 0; i < 10; i++){
			System.out.println(idade[i]);
		}

	}

}
