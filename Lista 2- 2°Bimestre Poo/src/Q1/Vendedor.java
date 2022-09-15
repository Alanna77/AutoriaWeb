package Q1;

public class Vendedor extends Funcionario{
	
	protected Gerente gerente;
	
	protected String nome;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Gerente getGerente() {
		return gerente;
	}


	public void setGerente(String nome) {
		this.gerente = gerente ;
	}


	public void imprimirDados() {
		
	
		  System.out.println("Gerente: "+getGerente());
	
		
	   System.out.println("Vendedor: "+getNome());
	 
	       
	}

}
