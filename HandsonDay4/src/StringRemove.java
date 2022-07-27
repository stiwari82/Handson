import java.util.Scanner;

public class StringRemove {
	
	public static String removeFirstandLast(String abc) {
		abc = abc.substring(1, abc.length()-1);
		return abc;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String abc = sc.nextLine();
		
		System.out.println(removeFirstandLast(abc));

	}

}
