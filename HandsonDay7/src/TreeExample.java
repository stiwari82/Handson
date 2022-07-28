import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeExample {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		
		ts.add("Shivam");
		ts.add("Rahul");
		ts.add("Pranjali");
		ts.add("Monis");
		
		Iterator<String> it = ts.iterator();
		String check = "hrithik";
		boolean result = false;
		
		while(it.hasNext()) {
			if(it.next().equals(check)) {
				result = true;
				break;
			}
		}
		
		if(result) {
			System.out.println(check + " Exists");
		}
		
		else {
			System.out.println(check + " Does'nt Exists");
		}
		

	}

}
