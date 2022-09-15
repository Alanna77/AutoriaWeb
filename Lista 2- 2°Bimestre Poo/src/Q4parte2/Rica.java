package Q4parte2;

public class Rica extends Pessoa{
	private double dinheiro;

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	public void fazCompras(String produto,double valor) {
		this.dinheiro = dinheiro-valor;
	}

}
