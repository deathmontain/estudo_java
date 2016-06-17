package org.treinamento;

public class TestaContas {
	  public static void main(String[] args) {
		ContaPrivate c = new ContaPrivate();
	    ContaPrivate cc = new ContaCorrente();
	    ContaPrivate cp = new ContaPoupanca();
	  
	    c.deposita(1000); 
	    cc.deposita(1000); 
	    cp.deposita(1000);
	  
	    c.atualiza(0.01);
	    cc.atualiza(0.01);
	    cp.atualiza(0.01);

	    System.out.println(c.getSaldo());
	    System.out.println(cc.getSaldo());
	    System.out.println(cp.getSaldo());

	  }
}
