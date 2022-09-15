package Questao4;

public class Departamento {
	private String nome;
	private Funcionarios funcionario [] = new Funcionarios[100];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Funcionarios[] getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionarios[] funcionario) {
		this.funcionario = funcionario;
	}

}
