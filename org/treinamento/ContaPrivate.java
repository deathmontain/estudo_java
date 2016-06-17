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
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}	
}
