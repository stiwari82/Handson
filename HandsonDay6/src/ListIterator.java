import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Shivam");
		list.add("Varanasi");
		list.add("Uttar Pradesh");
		list.add("CM Yogi");
		list.add("Temple City");
		
		printAll(list);
	
	}
	
	public static void printAll(List<String>list) {
		Iterator<String> it = list.iterator();
		
	    while(it.hasNext())
	    	System.out.println(it.next());
	}

}
