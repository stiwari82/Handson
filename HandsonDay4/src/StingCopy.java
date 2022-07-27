import java.util.Scanner;

public class StingCopy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String next = "";
		System.out.println("Enter the string");
		String abc = sc.nextLine();
		int slength = abc.length();
		
		if(slength<=1) {
			next = abc;
		}
		
		else {
			for(int i=0; i<slength; i++) {
				next = next+abc.charAt(0)+abc.charAt(1);
			}
		}
		
		System.out.print(next);
		

	}

}
