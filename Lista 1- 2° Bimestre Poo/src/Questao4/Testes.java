package Questao4;

public class Testes {

	public static void main(String[] args) {
	Empresa e = new Empresa();
		
		e.setNome("IFRN");
		e.setCnpj("23.432.876/0001-56");
		
		Funcionarios f1 = new Funcionarios();
		f1.setNome("Clara");
		f1.setSalario(2.500);
		f1.setDataAdmissao("13/05/2019");
		
		Funcionarios f2 = new Funcionarios();
		f2.setNome("Gisele");
		f2.setSalario(2000);
		f2.setDataAdmissao("08/06/2021");
		
		Funcionarios f3 = new Funcionarios();
		f3.setNome("Raquel");
		f3.setSalario(3000);
		f3.setDataAdmissao("21/04/2022");
		
		Departamento d1 = new Departamento();
		d1.setNome("Apoio Acadêmico");
		d1.getFuncionario() [0] = f1;
		d1.getFuncionario() [1] = f2;
		
		Departamento d2 = new Departamento();
		d2.setNome("Diretoria Acadêmica");
		d2.getFuncionario()[0] = f3;
		
		e.getDepartamentos()[0] = d1;
		e.getDepartamentos()[1] = d2;
		
		for(int i = 0; i < d1.getFuncionario().length; i++) {
			Funcionarios f = d1.getFuncionario()[i];
			
			if(f!=null) {
			System.out.println("Salário antigo: "+f.getSalario());
			
			f.setSalario(f.getSalario() + f.getSalario()*0.1);
			
			System.out.println("Novo salário: "+ f.getSalario());
			System.out.println();
			}
		}

	

	}

}
