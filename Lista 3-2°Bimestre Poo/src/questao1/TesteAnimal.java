package questao1;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal animal [] = new Animal[10];
		
		Cachorro c1 = new Cachorro();
		c1.emitirSom();
		Cachorro c2 = new Cachorro();
		c2.emitirSom();
		Cachorro c3 = new Cachorro();
		c3.emitirSom();
		Cachorro c4 = new Cachorro();
		c4.emitirSom();
		
		Cavalo cv1 = new Cavalo();
		cv1.emitirSom();
		Cavalo cv2 = new Cavalo();
		cv2.emitirSom();
		Cavalo cv3 = new Cavalo();
		cv3.emitirSom();
		
		Preguiça p1 = new Preguiça();
		p1.emitirSom();
		Preguiça p2 = new Preguiça();
		p2.emitirSom();
		Preguiça p3 = new Preguiça();
		p3.emitirSom();
		
		animal[0] = c1;
		animal[1] = cv1;
		animal[2] = p1;
		animal[3] = c2;
		animal[4] = cv2;
		animal[5] = p2;
		animal[6] = c3;
		animal[7] = cv3;
		animal[8] = p3;
		animal[9] = c4;
		
		for(int i = 0; i<animal.length; i++) {
			System.out.println(animal[i]);
	
			
		}
		
		

	}

}
