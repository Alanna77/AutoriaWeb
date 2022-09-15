package Q3;

public class Funcionario {
	protected String nome;
	protected double salario;
	
	public void addAumento(double valor) {
		this.salario = valor+salario;
	}
	public void ganhoAnual() {
		double salarioAnual = salario*12;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void exibeDados() {
		System.out.println("Nome do funcionário: "+getNome());
		System.out.println("Salário: "+getSalario());
		
	}

}
