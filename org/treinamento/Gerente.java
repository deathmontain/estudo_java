package org.treinamento;

class Gerente extends Funcionario implements Autenticavel {
	  private int SenhaA;
	    
	  public boolean autentica(int Senha) {
	    if(this.SenhaA != Senha) {
	      return false;
	    }
	    return true;
	  }
	  
	  public double GetBonificacao() { //@override
	    return this.Salario * 1.4 + 800;
	  }
}