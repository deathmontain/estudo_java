package org.treinamento;

abstract class Funcionario {
	String Nome;
	String Departamento;
	Double Salario;
	Double SalarioAnual;
	String DataEntrada;
	String Rg;
	int Senha;
	
	abstract double GetBonificacao();
	
	void RecebeAumento(double aumento){
		double novoSalario = this.Salario + aumento;
		this.Salario = novoSalario;
	}
	
	void CalculaGanhoAnual(double sal){
		double CalculaSalarioAnual = this.Salario * sal;
		this.SalarioAnual = CalculaSalarioAnual;
	}
	
	void MostraGerente(){
		System.out.println("Nome:" + this.Nome);
		System.out.println("Rg:" + this.Rg);
		System.out.println("Departamento:" + this.Departamento);
		System.out.println("Data de entrada:" + this.DataEntrada);
		System.out.println("Salario:" + this.Salario);
		System.out.println("SalarioAnual:" + this.SalarioAnual);
		System.out.println("Bonificações torais:" + GetBonificacao());
		System.out.println("\n");
	}
	
	void MostraDiretor(){
		System.out.println("Nome:" + this.Nome);
		System.out.println("Rg:" + this.Rg);
		System.out.println("Departamento:" + this.Departamento);
		System.out.println("Data de entrada:" + this.DataEntrada);
		System.out.println("Salario:" + this.Salario);
		System.out.println("SalarioAnual:" + this.SalarioAnual);
		System.out.println("Bonificações torais: " + GetBonificacao());
	}
	
	public static void main (String[] Args){
		Gerente f1 = new Gerente();
		Diretor f2 = new Diretor();
		
	     f1.Nome = "Hugo";
	     f1.Rg = "12345";
	     f1.Departamento = "Gerencia";
	     f1.Salario = 100D;
	     f1.RecebeAumento(50);
	     f1.CalculaGanhoAnual(12);
	     f1.GetBonificacao();
	     f1.Senha = 1234;
	     
	     f2.Nome = "Joazinho";
	     f2.Rg = "44444";
	     f2.Departamento = "Direção";
	     f2.Salario = 80D;
	     f2.RecebeAumento(50);
	     f2.CalculaGanhoAnual(12);
	     f2.GetBonificacao();
	     f2.Senha = 5555;
	     
	     f1.MostraGerente();
	     f2.MostraDiretor();
	}

}
