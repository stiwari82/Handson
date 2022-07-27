import java.util.Scanner;

public class StringRepititons {

	public static void main(String[] args) {
		String c ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String abc = sc.nextLine();
		System.out.println("Enter the integer");
		int n = sc.nextInt();
		int len = abc.length();
		
		len = len - n;
		
		for(int i=0; i<len; i++) {
			c = c + abc.substring(len);
		}
		
		System.out.println(c);

	}

}
