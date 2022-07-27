import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		String str = sc.nextLine();
		
		try {
			int a = Integer.parseInt(str);
			
			System.out.println("The square value is: " + a*a);
			System.out.println("The work has been done successfully");
		}
		
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer");
		}

	}

}
