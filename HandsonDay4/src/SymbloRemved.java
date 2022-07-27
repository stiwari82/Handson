import java.util.Scanner;

public class SymbloRemved {
	
	public String excludeStar(String str) {
		int len = str.length();
		String resString = "";
		
		for(int i=0; i<len; i++) {
			if(i==0 && str.charAt(i)!='*') {
				resString += str.charAt(i);
			}
			
			if(i>0 && str.charAt(i) != '*' && str.charAt(i-1)!= '*') {
				resString += str.charAt(i);
			}
			
			if(i>0 && str.charAt(i) == '*' && str.charAt(i-1)!= '*') {
				resString = resString.substring(0, resString.length()-1);
			}
		}
		
		return resString;
	}

	public static void main(String[] args) {
		SymbloRemved sr = new SymbloRemved();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		System.out.println("The new String " + sr.excludeStar(str));
		
	}

}
