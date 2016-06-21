package org.treinamento;

public class Contas {

	public static void main(String[] args) {
		Conta[] MinhasContas;
		MinhasContas = new Conta[10];
		
		Conta ContaNova = new Conta();
		ContaNova.Saldo = 3000D;
		MinhasContas[0] = ContaNova;
		
        System.out.println(ContaNova.Saldo);
	}

}
