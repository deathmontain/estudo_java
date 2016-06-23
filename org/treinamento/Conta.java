package org.treinamento;

public class Conta {
	int Num;
	String Nome;
	Double Saldo;
	Double Lim;
	
	void Saca(double Quantidade){
		if (Quantidade > this.Saldo + this.Lim) { 
		      throw new IllegalArgumentException("Saldo insuficiente!");
		} else {
			double NovoSaldo = this.Saldo - Quantidade;
			this.Saldo = NovoSaldo;
		  }
		
	}
	
	void Deposita(double Quantidade){
		if (Quantidade < 0){
			throw new IllegalArgumentException("O valor depositado não pode ser negativo!");
	    }else{
	    	this.Saldo += Quantidade;
	    }
	}	

	public static void main(String[] args) {
		Conta MinhaConta;
		MinhaConta = new Conta();
		
		MinhaConta.Nome = "William";
		MinhaConta.Saldo = 1000D;
		MinhaConta.Lim = 1000D;
		try{
		MinhaConta.Saca(2400);
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());			
		}
		try{
		MinhaConta.Deposita(500);
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Saldo Atual: " + MinhaConta.Saldo + "\nLimite: " 
		+ MinhaConta.Lim);
	}

}
