package org.treinamento;

public class ProgressaoAritmetica {

	private final int ultimoNumero;
	private final int primeiroNumero;
	private int total = 0;

	public ProgressaoAritmetica(int primeiroNumero, int ultimoNumero) {
		this.primeiroNumero = primeiroNumero;
		this.ultimoNumero = ultimoNumero;
	}

	public void calculaSoma() {

		for (int i = primeiroNumero; i <= ultimoNumero; i++) {
			this.total += i;
		}

	}
	
	public int getTotal(){
		return total;
	}

}