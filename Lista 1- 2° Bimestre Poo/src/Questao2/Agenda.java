package Questao2;

import Questao1.Pessoa;

public class Agenda {
	Pessoa pessoas[] = new Pessoa[10];
	int cont = 0;
	
	public void armazenaPessoa(String nome, String datadenascimento, double altura) {
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setDataNascimento(datadenascimento);
		p.setAltura(altura);
		
		if(cont<10) {
			pessoas[cont] = p;
			cont++;
		}
	}
	public void removePessoa(String nome) {
		for(int i = 0; i<pessoas.length; i++) {
			Pessoa p = pessoas[i];
			
			if(p.getNome().equals(nome)) {
				pessoas[i] = null;
			}
		}
	}
	
	public int buscaPessoa(String nome) {
		for(int i = 0; i<pessoas.length; i++) {
			Pessoa p = pessoas[i];
			
			if(p.getNome().equals(nome)) {
				return i;
			}
		}
		return - 1;
	}
	public void imprimeAgenda() {
		for(int i = 0; i<pessoas.length; i++) {
			Pessoa p = pessoas[i]; 
			
			if(p !=null);	{
				System.out.println("Posição "+i);
				System.out.println("Nome: "+p.getNome());
				System.out.println("Data de nascimento: "+p.getDataNascimento());
				System.out.println("Altura: "+p.getAltura());
				System.out.println();
				}
			}
	}
	public void imprimePessoa(int i ) {
		Pessoa p = pessoas[i];
		
		System.out.println("Posição "+i);
		System.out.println("Nome: "+p.getNome());
		System.out.println("Data de nascimento: "+p.getDataNascimento());
		System.out.println("Altura: "+p.getAltura());
		System.out.println();
	}

}
