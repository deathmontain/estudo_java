package org.treinamento;

import java.io.FileNotFoundException;

public class TestaException {
	  public static void main(String[] args){
		  try{
			  new java.io.FileInputStream("arquivo.txt");
		  }catch (FileNotFoundException e){
			  System.out.println("Arquivo n�o foi encontrado");
			  e.printStackTrace();  
		  }
	  }
}
