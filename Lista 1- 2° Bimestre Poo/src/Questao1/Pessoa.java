package Questao1;

public class Pessoa {
	private String nome;
	private String datadenascimento;
	private double altura;
	
	public Pessoa() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	
	}
	public String getNome() {
		return nome;
	}
	
	public void setDataNascimento(String datadenascimento) {
	    this.datadenascimento = datadenascimento;
	
	}
	public String getDataNascimento() {
		return datadenascimento;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	
	}
	public double getAltura() {
		return altura/100;
	}
	
	public void ImprimirDados() {
		System.out.println("Nome: "+ getNome());
		System.out.println("Data de nascimento: "+getDataNascimento());
		System.out.println("Altura: "+getAltura());
	}


}
