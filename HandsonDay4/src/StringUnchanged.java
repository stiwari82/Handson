import java.util.Scanner;

public class StringUnchanged {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the string");
	  String a = sc.nextLine();
	  int len = a.length();
	  if(a.charAt(0)== 'x') {
		  a = a.substring(1, len);
		  len = a.length();
	   }
	  
	  if(a.charAt(len-1)== 'x'){
		  a = a.substring(0, len-1);
	  }
	  
	  System.out.print(a);

	}

}
