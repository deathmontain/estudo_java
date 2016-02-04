package org.treinamento;

public class Contas {

	public static void main(String[] args) {
		Conta[] minhasContas;
		minhasContas = new Conta[10];
		
		Conta contaNova = new Conta();
		contaNova.saldo = 1000D;
		minhasContas[0] = contaNova;
		
        System.out.println(contaNova.saldo);
	}

}
