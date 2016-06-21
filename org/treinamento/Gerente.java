package org.treinamento;

class Gerente extends Funcionario implements Autenticavel {
	  private int senha;
	    
	  public boolean autentica(int senha) {
	    if(this.senha != senha) {
	      return false;
	    }
	    return true;
	  }
	  
	  public double GetBonificacao() { //@override
	    return this.Salario * 1.4 + 1000;
	  }
}