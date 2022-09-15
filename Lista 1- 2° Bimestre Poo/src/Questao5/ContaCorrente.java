package Questao5;

public class ContaCorrente {
	private double saldo;
	private double quantidade = 0;
	
	
	public double getSaldo() {
		return saldo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double quantidade) {
		saldo = saldo+quantidade;
	}
	public void sacarQuantia(double quantidade) {
		double taxa = 0.005*quantidade;
		saldo = saldo-quantidade-taxa;
	}

}
