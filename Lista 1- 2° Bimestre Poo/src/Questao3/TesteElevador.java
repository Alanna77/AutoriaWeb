package Questao3;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador e = new Elevador();
		
		e.setAndarAtual(10);
		e.setTotalAndares(12);
		e.setQtdPessoas(3);
		e.setCapacidade(5);
		
		System.out.println("Andar atual: "+e.getAndarAtual());
		System.out.println("Total de andares: "+e.getTotalAndares());
		System.out.println("Quantidade de pessoas: "+e.getQtdPessoas());
		System.out.println("Capacidade de pessoas: "+e.getCapacidade());
		

	}

}
