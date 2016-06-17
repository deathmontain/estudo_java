package org.treinamento;

public class ContaPoupanca extends ContaPrivate {
	  public void atualiza(double taxa) { //@override
	    this.saldo += this.saldo * taxa * 3;
	  }
}
