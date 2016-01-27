package org.treinamento;

public class ProgressaoAritmetica {

	private final int primeiroNumero;
	private final int razao;

	public ProgressaoAritmetica(int primeiroNumero, int razao) {
		this.primeiroNumero = primeiroNumero;
		this.razao = razao;
	}

	public int obtemNumeroProgressao(int n) {
		return primeiroNumero + ((n - 1) * razao);
	}
	
	public int obtemSomatorio(int posicao) {
		
		int somatorio = primeiroNumero;
		
		for(int i = 1; i < posicao; i++){
			somatorio += razao;
		}
		
		return somatorio;
	}

}