package Q4parte2;

public class Teste {

	public static void main(String[] args) {
		Rica r = new Rica();
		r.setNome("Laura");
		r.setIdade(21);
		r.setDinheiro(10000);
		System.out.println("Nome: "+r.getNome());
		System.out.println("Idade: "+r.getIdade());
		r.fazCompras("Roupas", 500);
		System.out.println("Dinheiro: "+r.getDinheiro());
		System.out.println();
		
		Pobre p = new Pobre();
		p.setNome("Carlos");
		p.setIdade(25);
		System.out.println("Nome: "+p.getNome());
		System.out.println("Idade: "+p.getIdade());
		p.trabalha();
		System.out.println();
		
		Miseravel m = new Miseravel();
		m.setNome("Fernanda");
		m.setIdade(36);
		System.out.println("Nome: "+m.getNome());
		System.out.println("Idade: "+m.getIdade());
		m.mendiga();
		

	}

}
