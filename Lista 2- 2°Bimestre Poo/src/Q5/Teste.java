package Q5;

public class Teste {

	public static void main(String[] args) {
		ImovelNovo im1 = new ImovelNovo();
		
		im1.setEndere�o("Rua Dom Pedro II");
		im1.setPreco(9999);
		System.out.println("Endere�o do im�vel: "+im1.getEndere�o());
		im1.imprimir();
		System.out.println();
		
		ImovelUsado im2 = new ImovelUsado();
		im2.setEndere�o("Av. Deodoro da Fonseca");
		im2.setPreco(9999);
		System.out.println("Endere�o do im�vel: "+im2.getEndere�o());
		im2.imprimir();
		

	}

}
