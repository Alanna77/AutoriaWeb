package Questao6;

public class Teste {

	public static void main(String[] args) {
		ConversaoDeUnidadesDeVolume volumeI = new ConversaoDeUnidadesDeVolume();
		volumeI.litroEmCubico(2);
		System.out.println();
		
		ConversaoDeUnidadesDeVolume volumeII = new ConversaoDeUnidadesDeVolume();
		volumeII.metrosCubicoEmLitro(3);
		System.out.println();
		
		ConversaoDeUnidadesDeVolume volumeIII = new ConversaoDeUnidadesDeVolume();
		volumeIII.metrosCubicosEmPes(2);
		System.out.println();
		
		ConversaoDeUnidadesDeVolume volumeIV = new ConversaoDeUnidadesDeVolume(); 
		volumeIV.galaoAmericanoEmPolegadasCubicas(3);
		System.out.println();
		
		ConversaoDeUnidadesDeVolume volumeV = new ConversaoDeUnidadesDeVolume();
		volumeV.galaoAmericanoEmLitros(2);
		System.out.println();

	}

}
