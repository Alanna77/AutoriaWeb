package questao2;

public abstract class Empresa {
	private String nome;
	private int codigofuncional;
	private String escola;
	private String universidade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigofuncional() {
		return codigofuncional;
	}

	public void setCodigofuncional(int codigofuncional) {
		this.codigofuncional = codigofuncional;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public void registrarFNaoEstudou() {
		this.nome = nome;
		this.codigofuncional = codigofuncional;
	}
	
	public void registrarFConcluiuEnsino() {
		this.escola = escola;
	}
	public void registrarFConcluiuEMedio() {
		this.escola = escola;
	}
	public void registrarFConcluiuGraduacao() {
		this.universidade = universidade;
	}

}
