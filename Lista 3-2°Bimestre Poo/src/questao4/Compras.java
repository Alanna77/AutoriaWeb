package questao4;

public class  Compras{
	public static void main(String[] args) {
		Produto carrinho[] = new Produto[3];
		
		Livro livro1 = new Livro("Livro Dom Casmurro");
		livro1.setAutor("Machado de Assis");
		carrinho[0] = livro1;
		
		Livro livro2 = new Livro("Livro O Pequeno Príncipe");
		livro2.setAutor("Antoine de Saint-Exupéry");
		carrinho[1] = livro2;
		
		Mouse mouse1 = new Mouse("Mouse Sem Fio Recarregável Wireless Led Rgb 2.4ghz 1600 DPI");
		mouse1.setTipo("Bluetooth");
		carrinho[2] = mouse1;
		
		for(int i = 0; i<carrinho.length; i++) {
			System.out.println(carrinho[i].getDescricao());
			
		}
		
		
	}

	
	

}
