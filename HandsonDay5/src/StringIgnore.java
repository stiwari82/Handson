import java.util.Scanner;

public class StringIgnore {

	public static void main(String[] args) {
		String c = "";
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String [] k = s.split(" , ");
		System.out.println("Enter the first string");
		String a = sc.nextLine();
		System.out.println("Enter the second string");
		String b = sc.nextLine();
		
		for(int i=0; i<=a.length()-b.length(); i++) {
			String str = a.substring(i, b.length()+1);
			
			if(str.equalsIgnoreCase(b)) {
				if(i>=0 && i<a.length()-1) {
					c += a.charAt(i-1);
				}
				
				if(i>=0 && b.length()+i<a.length()) {
					c += a.charAt(b.length()+i);
				}
			}
		}
		
		System.out.println(c);
	

	}

}
