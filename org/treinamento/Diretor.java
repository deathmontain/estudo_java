package org.treinamento;

class Diretor extends Funcionario {

	  public double getBonificacao() { //@override
	    return this.salario * 1.4 + 800;
	  }
}