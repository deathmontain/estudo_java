package org.treinamento.teste;

import org.treinamento.Soma;
import org.treinamento.teste.excpetions.ErroSomaException;

public class TestaSoma {

	private final static int esperado = 10;
	private static int obtido;
	
	public static void main(String[] args) {

		Soma soma = new Soma(1, 4);
		
		soma.calculaSoma();
		obtido = soma.getTotal();
		
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
