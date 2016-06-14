package org.treinamento;

public class Funcionario {
	String nome;
	String departamento;
	Double salario;
	Double salarioAnual;
	String DataEntrada;
	String rg;
	
	void recebeAumento(double aumento){
		double novoSalario = this.salario + aumento;
		this.salario = novoSalario;
	}
	
	void calculaGanhoAnual(double sal){
		double calculaSalarioAnual = this.salario * sal;
		this.salarioAnual = calculaSalarioAnual;
	}
	
	public static void main (String[] Args){
		Funcionario f1 = new Funcionario();
		   
	     f1.nome = "Hugo";
	     f1.salario = 100D;
	     f1.recebeAumento(50);
	     f1.calculaGanhoAnual(12);
	     
	     System.out.println("salario atual:" + f1.salario);
	     System.out.println("ganho anual:" + f1.salarioAnual);	
	}

}
