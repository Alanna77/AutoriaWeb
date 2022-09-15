package Questao1;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		//Identificando pessoa:
		p1.setNome("Alanna");
		p1.setDataNascimento("05/12");
		p1.setAltura(155);
		
		//Imprimir dados da pessoa:
		p1.ImprimirDados();

	}

}
