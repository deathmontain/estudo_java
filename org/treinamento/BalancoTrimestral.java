package org.treinamento;

public class BalancoTrimestral {
	
	public static void main (String[] args){
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		
		int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		int mediaMensal = (gastoJaneiro + gastoFevereiro + gastoMarco)/3;
		
		System.out.println(gastoTrimestre);
		System.out.println(mediaMensal);
	}
	
	
	}

