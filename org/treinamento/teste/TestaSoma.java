package org.treinamento.teste;

import org.treinamento.ProgressaoAritmetica;
import org.treinamento.teste.excpetions.ErroSomaException;

public class TestaSoma {

	private static int esperado;
	private static int obtido;
	private static ProgressaoAritmetica progressaoAritmetica;
	
	public static void testaNumeroProgressao(){
		
		esperado = -23;
		
		System.out.println("Imprmindo numero da progressao.");
		
		try{
			
			obtido = progressaoAritmetica.obtemTermo(-13);
			
			if(esperado == obtido){
				System.out.println("ok");
				System.out.println("obtido: " + obtido);
			}else{
				throw new ErroSomaException(esperado, obtido);
			}
				
		}catch(ErroSomaException e){
			System.err.println(e);
		}
	}
	
	public static void testaSomatorioProgressao(){
		
		esperado = 5;
		
		System.out.println("Imprmindo somatorio.");
		
		try{
			
			obtido = progressaoAritmetica.obtemSomatorio(1);
			
			if(esperado == obtido){
				System.out.println("ok");
				System.out.println("obtido: " + obtido);
			}else{
				throw new ErroSomaException(esperado, obtido);
			}
				
		}catch(ErroSomaException e){
			System.err.println(e);
		}catch(IllegalArgumentException e){
			System.err.println(e);
		}
	}
	
	
	public static void main(String[] args) {

		progressaoAritmetica = new ProgressaoAritmetica(5, 2);

		testaNumeroProgressao();
		testaSomatorioProgressao();		
	}

}
