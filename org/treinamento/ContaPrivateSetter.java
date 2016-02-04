package org.treinamento;

public class ContaPrivateSetter {
	private double saldo;
	private double limite;
	private String nomeTitular;
	
	void deposita(double quantidade){
		this.saldo += quantidade;	
	}
	
	public double getsaldo(){
		return this.saldo;
	}
	
	public void setsaldo(){
		this.saldo = saldo;
	}

}
