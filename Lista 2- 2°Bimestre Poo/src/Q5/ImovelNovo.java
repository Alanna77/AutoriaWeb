package Q5;

public class ImovelNovo extends Imovel{

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		double percentual = 15.0/100.0;
		this.preco = percentual*preco;
	}
	public void imprimir() {
		System.out.println("Valor com adicional: "+getPreco());
	}

}