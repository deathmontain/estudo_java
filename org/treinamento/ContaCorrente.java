package org.treinamento;

public class ContaCorrente extends ContaPrivate {
	@Override
	  public double atualiza(double valor){ 
	    return this.saldo += this.saldo * valor * 2;
	  }
	
	@Override  
	  public double deposita(double valor){ 
		  return this.saldo += valor - 0.10;
	  }
}
