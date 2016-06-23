package org.treinamento;

public class Conta {
	int Num;
	String Nome;
	Double Saldo;
	Double Lim;
	
	boolean Saca(double Quantidade){
		if (Quantidade > this.Saldo + this.Lim) { 
		      System.out.println("Não posso sacar fora do limite!");
		      return false;
		} else {
			double NovoSaldo = this.Saldo - Quantidade;
			this.Saldo = NovoSaldo;
			return true;
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
		MinhaConta.Saca(1400);
		MinhaConta.Deposita(500);
		
		System.out.println("Saldo Atual: " + MinhaConta.Saldo + "\nLimite: " 
		+ MinhaConta.Lim);
	}

}
