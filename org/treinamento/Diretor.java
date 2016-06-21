package org.treinamento;

class Diretor extends Funcionario implements Autenticavel{
	  private int senha;
	    
	  public boolean autentica(int Senha) {
	    if(this.senha != Senha) {
	      return false;
	    }
	    return true;
	  }
	  public double GetBonificacao() { //@override
	    return this.Salario * 1.4 + 800;
	  }
}