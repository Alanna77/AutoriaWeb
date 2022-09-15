package questao3;

public class Teste {

	public static void main(String[] args) {
		F1 f = new F1();
		f.registrarFConcluiuEnsino();
		f.rendaBasica();
		System.out.println();
		
		F2 f2 = new F2();
		f2.registrarFConcluiuEMedio();
		f2.rendaBasica();
		System.out.println();
		
		F3 f3 = new F3();
		f3.registrarFConcluiuGraduacao();
		f3.rendaBasica();

	}

}
