package Questao7;

import Questao6.ConversaoDeUnidadesDeVolume;

public class ConversaoDaPiscina {
	static double volume;
	
	public ConversaoDaPiscina() {
		
	}
	public ConversaoDaPiscina(double volume) {
		ConversaoDaPiscina.volume = volume;
	}
	public static void litroEmCubico(double volume) {
		double resultado = volume*1000;
		System.out.println("Volume em cetímetros cúbicos: "+ resultado + "cm");
	}
	public static void metrosCubicoEmLitro(double volume) {
		double resultado = volume*1000;
		System.out.println("Volume em litros: "+ resultado + "L");
	}
	public static void metrosCubicosEmPes(double volume) {
		double resultado = volume*35.32;
		System.out.println("Volume em pés cúbicos: "+resultado);
	}

}
