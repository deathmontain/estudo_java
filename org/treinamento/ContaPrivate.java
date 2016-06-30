package org.treinamento;

public abstract class ContaPrivate {
	private int num;
	private String nome;
	protected double saldo;
	protected double lim;
	
	void saca(double quantidade){
		double NovoSaldo = this.saldo - quantidade;
		this.saldo = NovoSaldo;
	}
	
	abstract double deposita(double valor);
	
	public double getSaldo(){
		return this.saldo;
	}
	
	abstract double atualiza(double valor);
}
