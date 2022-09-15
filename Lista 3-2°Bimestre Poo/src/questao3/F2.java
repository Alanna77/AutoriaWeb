package questao3;

import questao2.FuncionarioConcluiuEMedio;

public class F2 extends FuncionarioConcluiuEMedio{
	private double rendabasica = 1000;

	public double getRendabasica() {
		return rendabasica;
	}

	public void setRendabasica(double rendabasica) {
		this.rendabasica = rendabasica;
	}
	
	public void rendaBasica() {
		double calc = 0.50*100;
		System.out.println(this.rendabasica = rendabasica+calc);
	}
	
	public void registrarFConcluiuEMedio() {
		setEscola("Instituto Federal de Educação, Ciência e Tecnologia do RN");
		System.out.println("Escola: "+getEscola());
	}

}
