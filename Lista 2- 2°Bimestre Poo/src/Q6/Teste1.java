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
	    System.out.println("Nome do Assistente T�cnico: "+at.getNome());
	    System.out.println("Matr�cula: "+at.getMatricula());
	    System.out.println("Sal�rio: "+at.getSalario());
	    System.out.println("B�nus salarial: "+at.getBonussalarial());
	    System.out.println();
		
		
		AssistenteAdministrativo ad = new AssistenteAdministrativo();
		ad.setNome("Raquel");
		ad.setMatricula("20173829393365");
		ad.setSalario(1000);
		ad.setTurnodetrabalho("Matutino");
	    System.out.println("Nome do Assistente Administrativo: "+ad.getNome());
	    System.out.println("Matr�cula: "+ad.getMatricula());
	    System.out.println("Sal�rio: "+ad.getSalario());
	    System.out.println("Turno: "+ad.getTurnodetrabalho());
	    System.out.println();

	}

}
