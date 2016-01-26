package org.treinamento.teste.excpetions;

public class ErroSomaException extends RuntimeException {

	private static final long serialVersionUID = -2469649316225841855L;
	private final String mensagem = "Erro na soma";

	private final int esperado;
	private final int obtido;
	
	public ErroSomaException(int esperado, int obtido) {
		this.esperado = esperado;
		this.obtido = obtido;
	}
	
	
	@Override
	public String getMessage() {
		String mensagem = this.mensagem;
		mensagem += "\n" + "Esperado: " + esperado + "\n";
		mensagem += "Obtido: " + obtido;
		
		return mensagem;
	}

}
