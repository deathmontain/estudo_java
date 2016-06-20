package org.treinamento;

class Gerente extends Funcionario {

	  public double getBonificacao() { //@override
	    return this.salario * 1.4 + 1000;
	  }
}