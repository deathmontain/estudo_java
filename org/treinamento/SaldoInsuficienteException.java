package org.treinamento;

public class SaldoInsuficienteException extends RuntimeException {
	SaldoInsuficienteException(String message){
		super (message);
	}
}
