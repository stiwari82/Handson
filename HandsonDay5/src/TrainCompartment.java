import java.util.*;

abstract class Compartment{
	public abstract String notice();
}

class FirstClass extends Compartment{
	public String notice () {
		return "You are in First Class Compartment";
	}
}

class Ladies extends Compartment{
	public String notice() {
		return "You are in Ladies Compartment";
	}
}

class General extends Compartment{
	public String notice() {
		return "You are in General Compartment";
	}
}

class Luggage extends Compartment{
	public String notice() {
		return "You are in Luggage Compartment";
	}
}



public class TrainCompartment {

	public static void main(String[] args) {
		Compartment[] compartments = new Compartment[10];
		
		Random ran = new Random();
		for(int i=0; i<10; i++) {
			int ranNum = ran.nextInt((4-1)+1)+1;
			
			if(ranNum==1) {
				compartments[i] = new Luggage();
			}
			
			else if(ranNum==2) {
				compartments[i] = new Ladies();
			}
			
			else if(ranNum==3) {
				compartments[i] = new General();
			}
			
			else if(ranNum==4) {
				compartments[i] = new FirstClass();
			}
			
			System.out.println(compartments[i].notice());
		}

	}

}
