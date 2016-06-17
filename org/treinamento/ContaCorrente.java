package org.treinamento;

public class ContaCorrente extends ContaPrivate {
	  public void atualiza(double taxa) { //@override
	    this.saldo += this.saldo * taxa * 2;
	  }
	  
	  public void deposita(double valor){ //@override
		  this.saldo += valor - 0.10;
	  }
}
