package org.treinamento.teste;

import org.treinamento.ProgressaoAritmetica;
import org.treinamento.teste.excpetions.ErroSomaException;

public class TestaSoma {

	private final static int esperado = 10;
	private static int obtido;
	
	public static void main(String[] args) {

		ProgressaoAritmetica progressaoAritmetica = new ProgressaoAritmetica(1, 4);
		
		progressaoAritmetica.calculaSoma();
		obtido = progressaoAritmetica.getTotal();
		
		System.out.println("Imprmindo somatorio.");
		
		try{
			
			if(esperado == obtido){
				System.out.println("ok");
			}else{
				throw new ErroSomaException(esperado, obtido);
			}
				
		}catch(ErroSomaException e){
			System.err.println(e);
		}

	}

}
