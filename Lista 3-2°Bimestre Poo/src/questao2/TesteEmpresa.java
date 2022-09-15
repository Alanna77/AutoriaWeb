package questao2;

public class TesteEmpresa {

	public static void main(String[] args) {
		Empresa e1 = new FuncionarioNãoEstudou();
		Empresa e2 = new FuncionarioConcluiuEMedio();
		Empresa e3 = new FuncionarioConcluiuEnsino();
		Empresa e4 = new FuncionarioConcluiuG();
		
		e1.registrarFNaoEstudou();
		System.out.println();
		e2.registrarFConcluiuEMedio();
		System.out.println();
		e3.registrarFConcluiuEnsino();
		System.out.println();
		e4.registrarFConcluiuGraduacao();
		

	}

}
