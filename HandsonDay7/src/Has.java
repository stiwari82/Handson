
public class Has {

	public static void main(String[] args) {
		Country countries = new Country();
		
		countries.saveCountryNames("India");
		countries.saveCountryNames("Australia");
		countries.saveCountryNames("New Zealand");
		countries.saveCountryNames("Russia");
		countries.saveCountryNames("United Kingdom");
		countries.saveCountryNames("U.S.A.");
		countries.saveCountryNames("South Africa");
		
		System.out.println("India: " + countries.getCountry("India"));
		System.out.println("Sri Lanka" + countries.getCountry("Sri Lanka "));
				
		

	}

}
