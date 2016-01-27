package org.treinamento;

public class ProgressaoAritmetica {

	private final int primeiroNumero;
	private final int razao;

	public ProgressaoAritmetica(int primeiroNumero, int razao) {
		this.primeiroNumero = primeiroNumero;
		this.razao = razao;
	}

	public int obtemTermo(int n) {
		return primeiroNumero + ((n - 1) * razao);
	}
	
	public int obtemSomatorio(int n) throws IllegalArgumentException {
		
		int somatorio = 0;
		
		if(n < 0){
			throw new IllegalArgumentException("O numero tem que ser maior que 0.");
		}
		
		for(int i = 1; i <= n; i++){
			somatorio += obtemTermo(i);
		}
		
		return somatorio;
	}

}