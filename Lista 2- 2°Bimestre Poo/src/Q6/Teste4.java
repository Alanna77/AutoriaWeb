package Q6;

import java.util.Scanner;

import Q5.ImovelNovo;
import Q5.ImovelUsado;

public class Teste4 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe 1 se procura im�vel novo ou informe 2 para im�vel usado:");
			int imovel = sc.nextInt();
			
			if(imovel==(1)) {
			ImovelNovo im1 = new ImovelNovo();
			
			im1.setEndere�o("Rua Dom Pedro II");
			im1.setPreco(9999);
			System.out.println("Endere�o do im�vel: "+im1.getEndere�o());
			System.out.println("Valor do im�vel: "+im1.getPreco() );
			System.out.println();
			}
			else if(imovel==(2)) {
			
			ImovelUsado im2 = new ImovelUsado();
			im2.setEndere�o("Av. Deodoro da Fonseca");
			im2.setPreco(9999);
			System.out.println("Endere�o do im�vel: "+im2.getEndere�o());
			System.out.println("Valor do im�vel: "+im2.getPreco());
			}
			else {
				System.out.println("O n�mero informado � inv�lido!");
			}
			

	}

}
