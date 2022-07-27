import java.util.Scanner;

public class StringCombination {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the first string");
	     String abc = sc.nextLine();
	     System.out.println("Enter the second string");
	     String xyz = sc.nextLine();
	     String newStr = "";
	     
	     int len = abc.length();
	     
	     for(int i=0; i<len; i++) {
	    	 char ch1 = abc.charAt(i);
	    	 char ch2 = xyz.charAt(i);
	    	 newStr = newStr+ch1+ch2;
	     }
	     
	     System.out.println(newStr);

	}

}
