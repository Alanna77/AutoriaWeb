package Q2;

public class Testes {

	public static void main(String[] args) {
		
		Ingresso i = new Ingresso();
		i.setValor(30);
		System.out.println("Valor: "+i.getValor());
		
		IngressoNormal in = new IngressoNormal();
		in.Imprime();
		in.imprimeValor();
		
		IngressoVip iv = new IngressoVip();
		iv.imprimeValor();
		
		CamaroteInferior ci = new CamaroteInferior();
		ci.setLocalizacao("Lado esquerdo");
		System.out.println("Localização:" +ci.getLocalizacao());
		
		CamaroteSuperior cs = new CamaroteSuperior();
		cs.imprimeValor();

	}

}
