package org.treinamento;

abstract class Funcionario {
	String nome;
	String departamento;
	Double salario;
	Double salarioAnual;
	String dataEntrada;
	String rg;
	
	abstract double getBonificacao();
	
	void recebeAumento(double aumento){
		double novoSalario = this.salario + aumento;
		this.salario = novoSalario;
	}
	
	void calculaGanhoAnual(double sal){
		double calculaSalarioAnual = this.salario * sal;
		this.salarioAnual = calculaSalarioAnual;
	}
	
	void mostraFuncionario(){
		System.out.println("Nome:" + this.nome);
		System.out.println("Rg:" + this.rg);
		System.out.println("Departamento:" + this.departamento);
		System.out.println("Data de entrada:" + this.dataEntrada);
		System.out.println("Salario:" + this.salario);
		System.out.println("SalarioAnual:" + this.salarioAnual);
	}
	
	public static void main (String[] Args){
		Funcionario f1 = new Funcionario();
		   
	     f1.nome = "Hugo";
	     f1.salario = 100D;
	     f1.recebeAumento(50);
	     f1.calculaGanhoAnual(12);
	     f1.mostraFuncionario();
	}

}
