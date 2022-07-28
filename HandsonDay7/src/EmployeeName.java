import java.util.HashSet;
import java.util.Iterator;

public class EmployeeName {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		
		h.add("Shivam");
		h.add("Rahul");
		h.add("Hrithik");
		h.add("Sanskruti");
		
		Iterator<String> it = h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
