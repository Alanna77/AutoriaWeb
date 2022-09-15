package Q6;

import java.util.Scanner;

import Q5.ImovelNovo;
import Q5.ImovelUsado;

public class Teste4 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe 1 se procura imóvel novo ou informe 2 para imóvel usado:");
			int imovel = sc.nextInt();
			
			if(imovel==(1)) {
			ImovelNovo im1 = new ImovelNovo();
			
			im1.setEndereço("Rua Dom Pedro II");
			im1.setPreco(9999);
			System.out.println("Endereço do imóvel: "+im1.getEndereço());
			System.out.println("Valor do imóvel: "+im1.getPreco() );
			System.out.println();
			}
			else if(imovel==(2)) {
			
			ImovelUsado im2 = new ImovelUsado();
			im2.setEndereço("Av. Deodoro da Fonseca");
			im2.setPreco(9999);
			System.out.println("Endereço do imóvel: "+im2.getEndereço());
			System.out.println("Valor do imóvel: "+im2.getPreco());
			}
			else {
				System.out.println("O número informado é inválido!");
			}
			

	}

}
