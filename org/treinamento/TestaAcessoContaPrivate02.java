package org.treinamento;

public class TestaAcessoContaPrivate02 {
	public static void main(String[] args) {
		ContaPrivateSetter minhaConta = new ContaPrivateSetter();

		minhaConta.deposita(3000);
		System.out.println("Saldo: " + minhaConta.getsaldo());

	}

}
