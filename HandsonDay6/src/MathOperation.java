import java.util.InputMismatchException;
public class MathOperation {

	public static void main(String[] args) {
		int n = args.length;
		
		for(int i=0; i<n; i++) {
			if(args[i].charAt(args[i].length()-1) == ',') {
				args[i] = args[i].replace(",", ",");
			}
		}
		
		int arr[] = new int[n];
		int sum = 0;
		double avg = 0;
		
		try {
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(args[i]);
			}
			
			for(int i=0; i<n; i++) {
				sum += arr[i];
			}
			
			avg = sum/n;
		}
		
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		
		catch(InputMismatchException e) {
			System.out.println("InputMisMatchException");
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
	 
	}

}
