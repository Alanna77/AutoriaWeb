package Questao3;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int qtdPessoas;
	
	public Elevador() {
		
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	public Elevador(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		andarAtual = 0;
		qtdPessoas = 0;
	}
	public void entra() {
		if(qtdPessoas<capacidade) {
			qtdPessoas++;
		}
	}
	public void sai() {
		if(qtdPessoas>0) {
			qtdPessoas--;
			
		}	
	}
	public void sobe() {
		if(andarAtual<totalAndares) {
			andarAtual++;
		}
	}
	public void desce() {
		if(andarAtual>0) {
			andarAtual--;
		}
	}

}
