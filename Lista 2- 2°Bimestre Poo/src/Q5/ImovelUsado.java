package Q5;

public class ImovelUsado extends Imovel{
	
	

	public void setPreco(double preco) {
		
		this.preco=preco;
	}
	public double getPreco() {
		
		return preco-(100*0.15);
	}
	public void imprimir() {
		System.out.println("Valor com desconto: "+getPreco());
	}

}
