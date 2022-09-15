package Q3;


public class Administrativo extends Funcionario{
	
	public void ganhoAnual(double bonus) {
		this.salario = (salario*12)*bonus;
	}

}
