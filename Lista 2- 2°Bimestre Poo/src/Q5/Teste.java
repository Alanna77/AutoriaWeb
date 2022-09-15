package Q5;

public class Teste {

	public static void main(String[] args) {
		ImovelNovo im1 = new ImovelNovo();
		
		im1.setEndereço("Rua Dom Pedro II");
		im1.setPreco(9999);
		System.out.println("Endereço do imóvel: "+im1.getEndereço());
		im1.imprimir();
		System.out.println();
		
		ImovelUsado im2 = new ImovelUsado();
		im2.setEndereço("Av. Deodoro da Fonseca");
		im2.setPreco(9999);
		System.out.println("Endereço do imóvel: "+im2.getEndereço());
		im2.imprimir();
		

	}

}
