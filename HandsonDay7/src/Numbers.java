import java.util.*;
class Numeric{
	private int num;
	private double d;
	
	Numeric(int n, double d){
		num = n;
		this.d = d;
	}
	
	public String toString() {
		return + num + "\n" + d;
	}
}

public class Numbers{
	public static void main(String[] args) {
		ArrayList<Numeric> arr = new ArrayList<Numeric>();
		arr.add(new Numeric(2, 4.5F ));
		arr.add(new Numeric(23, 34.5096D));
		arr.add(new Numeric(225, 4.5632D));
		
		for(Numeric element:arr) {
			System.out.println(element + "\n");
		}
		
	}
}

