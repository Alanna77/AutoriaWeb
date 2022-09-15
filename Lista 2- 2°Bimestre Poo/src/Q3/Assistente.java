package Q3;

public class Assistente extends Funcionario{
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void exibeDados() {
		System.out.println("Matrícula: "+getMatricula());
	}

}
