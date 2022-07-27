import java.util.*;


public class MusicalInstruments {

	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[10];
		
		Random rand = new Random();
		
		for(int i=0; i<10; i++) {
			int ranNum = rand.nextInt((3-1)+1)+1;
			
			if(ranNum == 1) {
				instruments[i] = new Piano();
			}
			
			else if(ranNum == 2) {
				instruments[i] = new Flute();
			}
			
			else if (ranNum == 3) {
				instruments[i] = new Guitar();
			}
			
			instruments[i].play();
		}
		
		for(int i=0; i<10; i++) {
			if(instruments[i] instanceof Piano) {
				System.out.println("Piano is stored at index" + i);
			}
			
			else if (instruments[i] instanceof Flute) {
				System.out.println("Flute is stored at index" + i);
			}
			
			else if(instruments[i] instanceof Guitar) {
				System.out.println("Guitar is stored at index" + i);
			}
		}

	}

}
