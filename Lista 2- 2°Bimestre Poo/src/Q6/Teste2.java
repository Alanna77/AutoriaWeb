package Q6;

import Q4.Cachorro;
import Q4.Gato;

public class Teste2 {

	public static void main(String[] args) {		
	Cachorro c = new Cachorro();
	
	c.setNome("Bob");
	c.setRaca("Pitbull");
	System.out.println("Nome do cachorro: "+c.getNome());
	System.out.println("Raça: "+c.getRaca());
	System.out.println(c.caminha());
	System.out.println(c.late());
	System.out.println();
	
	Gato g = new Gato();
	g.setNome("Fred");
	g.setRaca("Europeia");
	System.out.println("Nome do gato: "+g.getNome());
	System.out.println("Raça: "+g.getRaca());
	System.out.println(g.caminha());
	System.out.println(g.mia());

	}

}
