package Questao5;

import java.util.Set;

import Questao5.ContaCorrente;

public class CCTeste {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(700);
		
		System.out.println("Saldo: R$ "+c1.getSaldo());
		
		c1.sacarQuantia(250);
		System.out.println("Novo saldo: R$ "+c1.getSaldo());
		
		ContaCorrente c2 = new ContaCorrente();
		c2.setSaldo(500);
		c2.sacarQuantia(150);
		
		
		System.out.println("Saldo da conta corrente c2: R$ "+c2.getSaldo());

	

	}

}
