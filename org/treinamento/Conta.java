package org.treinamento;

public class Conta {
	int Num;
	String Nome;
	Double Saldo;
	Double Lim;
	
	void Saca(double Quantidade){
		if (Quantidade > this.Saldo + this.Lim) { 
		      throw new IllegalArgumentException();
		} else {
			double NovoSaldo = this.Saldo - Quantidade;
			this.Saldo = NovoSaldo;
		  }
		
	}
	
	void Deposita(double Quantidade){
		this.Saldo += Quantidade;	
	}

	public static void main(String[] args) {
		Conta MinhaConta;
		MinhaConta = new Conta();
		
		MinhaConta.Nome = "William";
		MinhaConta.Saldo = 1000D;
		MinhaConta.Lim = 1000D;
		try{
		MinhaConta.Saca(1600);
		}catch (IllegalArgumentException e){
			System.out.println("Saldo insuficiente!");			
		}
		MinhaConta.Deposita(500);
		
		System.out.println("Saldo Atual: " + MinhaConta.Saldo + "\nLimite: " 
		+ MinhaConta.Lim);
	}

}
