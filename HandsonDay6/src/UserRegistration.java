
public class UserRegistration {
	
	 
	public void registerUser(String username, String userCountry) throws InvalidCountryException{
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}
		
		else {
			
			throw new InvalidCountryException("User outside India cannot be registered");
		}
	}

	public static void main(String[] args) throws Exception{
		UserRegistration ur = new UserRegistration();
		ur.registerUser("Mickey", "India");
		

	}

}

