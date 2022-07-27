import java.util.Scanner;

public class DivisonHandle {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int a = sc.nextInt();
	int b = sc.nextInt();
    int c = 0;
    
    try {
    	c =a/b;
    }
    
    catch(ArithmeticException e){
    	System.out.println("Arithmetic Exception");
    }
    System.out.println(c);

	}

}
