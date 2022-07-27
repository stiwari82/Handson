import java.util.Scanner;

public class StringEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String abc = sc.nextLine();
		String xyz = null;
		
		int slength = abc.length();
		int n = slength/2;
		
		if(slength % 2==0) {
			xyz = "";
			for(int i=0; i<n; i++) {
				xyz = xyz + abc.charAt(i);
			}
			System.out.print(xyz);
		}
		
		else {
			System.out.println(xyz);
		}
		
	
		
		
		

	}

}
