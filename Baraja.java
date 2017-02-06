import java.util.Random;

public class Baraja{
    
    Carta[] cartas = new Carta[54];
    Random random = new Random();

    public Baraja(){
    	for(int i=0; i<4; i++){
    		for(int j=0; j<13; j++){
    			cartas[(i*13)+j] = new Carta(i, j+1);
    		}
    	}
    	crearJokers();
    }

	public void crearJokers(){
		cartas[52] = new Carta(4, 14);
		cartas[53] = new Carta(4, 14);
	}

	public void imprimirBaraja(){
		for(int i=0; i<cartas.length; i++){
			System.out.println(cartas[i].getNombreCarta());
		}
	}

	public void revolverBaraja(){
		for(int i=0; i<100; i++){
			int a = random.nextInt(54);
			int b = random.nextInt(54);
			Carta aux = cartas[a];
			cartas[a] = cartas[b];
			cartas[b] = aux;
		}
	}

	public Carta getCarta(int i){
		return cartas[i];
	}

}