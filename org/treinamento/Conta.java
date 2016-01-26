package org.treinamento;

public class Conta {
	int num;
	String nome;
	Double saldo;
	Double lim;
	
	void saca(double quantidade){
		double NovoSaldo = this.saldo - quantidade;
		this.saldo = NovoSaldo;
	}
	
	void deposita(double quantidade){
		this.saldo += quantidade;	
	}

	public static void main(String[] args) {
		Conta MinhaConta;
		MinhaConta = new Conta();
		
		MinhaConta.nome = "William";
		MinhaConta.saldo = 1000D;
		MinhaConta.lim = 2000D;
		MinhaConta.saca(200);
		MinhaConta.deposita(500);
		
		System.out.println("Saldo Atual: " + MinhaConta.saldo + "\nLimite: " 
		+ MinhaConta.lim);
	}

}
