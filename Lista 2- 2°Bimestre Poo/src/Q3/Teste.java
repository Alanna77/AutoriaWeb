package Q3;

public class Teste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Alanna");
		f1.setSalario(2000);
		f1.exibeDados();
		System.out.println();
		
		Assistente a = new Assistente();
		a.setNome("Bob");
		a.setMatricula("20201064010003");
		a.setSalario(1500);
	    System.out.println("Assistente Nome: "+a.getNome());
	    System.out.println("Matrícula: "+a.getMatricula());
	    System.out.println("Salário: "+a.getSalario());
	    System.out.println();
		
		AssistenteTecnico at = new AssistenteTecnico();
		at.setNome("Amanda");
		at.setMatricula("20241064010023");
		at.setSalario(3000);
		at.setBonussalarial(250);
	    System.out.println("Nome do Assistente Técnico: "+at.getNome());
	    System.out.println("Matrícula: "+at.getMatricula());
	    System.out.println("Salário: "+at.getSalario());
	    System.out.println("Bônus salarial: "+at.getBonussalarial());
	    System.out.println();
		
		
		AssistenteAdministrativo ad = new AssistenteAdministrativo();
		ad.setNome("Zequinha");
		ad.setMatricula("20173829393365");
		ad.setSalario(1000);
		ad.setTurnodetrabalho("Matutino");
	    System.out.println("Nome do Assistente Administrativo: "+ad.getNome());
	    System.out.println("Matrícula: "+ad.getMatricula());
	    System.out.println("Salário: "+ad.getSalario());
	    System.out.println("Turno: "+ad.getTurnodetrabalho());
	    System.out.println();
		
		
		Tecnico t = new Tecnico();
		t.ganhoAnual(2000);
		
		Administrativo a1 = new Administrativo();
		a1.ganhoAnual(1000);
		
	}

	

			
		

	

}
