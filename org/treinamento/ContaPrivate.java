package org.treinamento;

public class ContaPrivate {
	private int num;
	private String nome;
	protected double saldo;
	protected double lim;
	
	void saca(double quantidade){
		double NovoSaldo = this.saldo - quantidade;
		this.saldo = NovoSaldo;
	}
	
	void deposita(double quantidade){
		this.saldo += quantidade;	
	}
	
	public double getsaldo(){
		return this.saldo;
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
	
	public class ContaCorrente extends Conta {
		  public void atualiza(double taxa) {
		    this.saldo += this.saldo * taxa * 2;
		  }
		  
		  public void deposita(double valor){ //@override
			  this.saldo += valor - 0.10;
		  }
	}
	
	public class ContaPoupança extends Conta {
		  public void atualiza(double taxa) {
		    this.saldo += this.saldo * taxa * 3;
		  }
		}
}
