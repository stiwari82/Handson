import java.util.Scanner;

public class StringShortLong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String a = sc.nextLine();
		System.out.println("Enter the secind string");
		String b = sc.nextLine();
		
		if(a.length()>b.length()) {
			System.out.println(b+a+b);
		}
		
		else{
			System.out.println(a+b+a);
		}

	}

}
