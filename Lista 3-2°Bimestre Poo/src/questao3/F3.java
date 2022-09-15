package questao3;

import questao2.FuncionarioConcluiuG;

public class F3 extends FuncionarioConcluiuG{
	private double rendabasica = 1000;

	public double getRendabasica() {
		return rendabasica;
	}

	public void setRendabasica(double rendabasica) {
		this.rendabasica = rendabasica;
	}
	
	public void rendaBasica() {
		double calc = 0.100*100;
		System.out.println(this.rendabasica = rendabasica+calc);
	}
	
	public void registrarFConcluiuGraduacao() {
		setUniversidade("UFRN");
		System.out.println("Universidade: "+getUniversidade());
	}

}
