abstract class GeneralBank{
	abstract double getSavingInterestRate();
	abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank{
	double getSavingInterestRate() {
		return 4;
	}
	
	double getFixedDepositInterestRate() {
		return 8.5;
	}
}

class KotMBank extends GeneralBank{
	double  getSavingInterestRate() {
		return 6;
	}
	
	double getFixedDepositInterestRate() {
		return 9;
	}
}


public class Banks {

	public static void main(String[] args) {
		ICICIBank iciciBank = new ICICIBank();
		KotMBank kotMBank = new KotMBank();
		
		System.out.println("ICICI BANK" + "Fixed Rate= " + iciciBank.getFixedDepositInterestRate() + "%, " + "Saving Rate= " + iciciBank.getSavingInterestRate() + "%");
		System.out.println("KOTAK MAHINDRA BANK" + "Fixed Rate= " + kotMBank.getFixedDepositInterestRate() + "%, " + "Saving Rate" + kotMBank.getSavingInterestRate()+ "%");
		
		System.out.println("--------------------------------------------------------------------");
		
		GeneralBank gBank1 = new ICICIBank();
		GeneralBank gBank2 = new KotMBank();
		
		System.out.println("GENERAL BANK1" + "Fixed Rate= "+ gBank1.getFixedDepositInterestRate() + "%, " +"Saving Rate= "+ gBank2.getSavingInterestRate() + "%");
		
		System.out.println("GENERAL BANK2" + "Fixed Rate= "+ gBank2.getFixedDepositInterestRate() + "%, " + "Saving Rate= " + gBank2.getSavingInterestRate() + "%" );
		
		

	}

}
