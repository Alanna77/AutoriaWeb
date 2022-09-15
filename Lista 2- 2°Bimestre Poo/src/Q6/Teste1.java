package Q6;

import Q3.AssistenteAdministrativo;
import Q3.AssistenteTecnico;

public class Teste1 {

	public static void main(String[] args) {
		AssistenteTecnico at = new AssistenteTecnico();
		at.setNome("Jullya");
		at.setMatricula("20241064010023");
		at.setSalario(3000);
		at.setBonussalarial(250);
	    System.out.println("Nome do Assistente Técnico: "+at.getNome());
	    System.out.println("Matrícula: "+at.getMatricula());
	    System.out.println("Salário: "+at.getSalario());
	    System.out.println("Bônus salarial: "+at.getBonussalarial());
	    System.out.println();
		
		
		AssistenteAdministrativo ad = new AssistenteAdministrativo();
		ad.setNome("Raquel");
		ad.setMatricula("20173829393365");
		ad.setSalario(1000);
		ad.setTurnodetrabalho("Matutino");
	    System.out.println("Nome do Assistente Administrativo: "+ad.getNome());
	    System.out.println("Matrícula: "+ad.getMatricula());
	    System.out.println("Salário: "+ad.getSalario());
	    System.out.println("Turno: "+ad.getTurnodetrabalho());
	    System.out.println();

	}

}
