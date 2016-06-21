package org.treinamento;

public class Conta {
	int Num;
	String Nome;
	Double Saldo;
	Double Lim;
	
	void Saca(double Quantidade){
		if (Quantidade > this.Saldo + this.Lim) { 
		      System.out.println("Não posso sacar fora do limite!");
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
		MinhaConta.Lim = 2000D;
		MinhaConta.Saca(3500);
		MinhaConta.Deposita(500);
		
		System.out.println("Saldo Atual: " + MinhaConta.Saldo + "\nLimite: " 
		+ MinhaConta.Lim);
	}

}
