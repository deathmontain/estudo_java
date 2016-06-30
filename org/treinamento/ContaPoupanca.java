package org.treinamento;


public class ContaPoupanca extends ContaPrivate {
	@Override
	  public double atualiza(double valor) {
	    return this.saldo += this.saldo * valor;
	  }

	@Override
	double deposita(double valor) {
		return this.saldo += valor + 0.10;
	}
}
