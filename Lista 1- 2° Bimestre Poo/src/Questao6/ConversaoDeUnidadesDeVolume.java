package Questao6;

public class ConversaoDeUnidadesDeVolume {
	
	static double volume;
	
	public ConversaoDeUnidadesDeVolume() {
		ConversaoDeUnidadesDeVolume.volume = volume;
	}
	public static void litroEmCubico(double volume) {
		double resultado = volume*1000;
		System.out.println("Volume em cet�metros c�bicos: "+ resultado + "cm");
	}
	public static void metrosCubicoEmLitro(double volume) {
		double resultado = volume*1000;
		System.out.println("Volume em litros: "+ resultado + "L");
	}
	public static void metrosCubicosEmPes(double volume) {
		double resultado = volume*35.32;
		System.out.println("Volume em p�s c�bicos: "+resultado);
	}
	public static void galaoAmericanoEmPolegadasCubicas(double volume) {
		double resultado = volume*231;
		System.out.println("Volume em polegadas c�bicas: "+resultado);
	}
	public static void galaoAmericanoEmLitros(double volume) {
		double resultado = volume*3.785;
		System.out.println("Volume em litros: "+ resultado + "L");
	}

}
