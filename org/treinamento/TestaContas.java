package org.treinamento;

public class TestaContas {
	  public static void main(String[] args) {
	    ContaPrivate cc = new ContaCorrente();
	    ContaPrivate cp = new ContaPoupanca();
	  
	    cc.deposita(1000); 
	    cp.deposita(1000);
	  
	    cc.atualiza(0.01);
	    cp.atualiza(0.01);

	    System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
	    System.out.println("Saldo da Conta Poupan�a: " + cp.getSaldo());

	  }
}
