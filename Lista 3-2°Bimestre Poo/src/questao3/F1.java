package questao3;

import questao2.FuncionarioConcluiuEnsino;

public class F1 extends FuncionarioConcluiuEnsino{
	private double rendabasica = 1000;
	
	
	public double getRendabasica() {
		return rendabasica;
	}


	public void setRendabasica(double rendabasica) {
		this.rendabasica = rendabasica;
	}
	
	public void rendaBasica() {
		double calc = 0.10*100;
		System.out.println(this.rendabasica = rendabasica+calc);
	}


	public void registrarFConcluiuEnsino() {
		setEscola("Escola Estadual José Bezerra");
		System.out.println("Escola: "+getEscola());
	}

}
