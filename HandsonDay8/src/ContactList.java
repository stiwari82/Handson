import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ContactList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Shivam", 7355937);
		map.put("Snehil", 8001);
		map.put("Kritika", 5624);
		map.put("Bamlu", 78342);
		
		System.out.println(map);
		
		System.out.println("Enter the contact");
		int NumberChecked = sc.nextInt();
		
		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		boolean NumberPresent = false;
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			if(NumberChecked == entry.getValue()){
				NumberPresent = true;
			}
			
		}
				System.out.println("Does Number " + NumberChecked + " Exists: " + NumberPresent);
			
	
}

}
