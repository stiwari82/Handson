import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class KeyExist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Shivam");
		map.put(2, "How are you");
		map.put(3, "I am Fine");
		map.put(4, "Varanasi");
		
		System.out.println("HashMap " + map);
		
		System.out.println("Enter the key: ");
		int KeyChecked = sc.nextInt();
		
		System.out.println("Enter the value");
		String ValueChecked = sc.nextLine();
		
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		boolean KeyPresent = false;
		boolean ValuePresent = false;
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			
			if(KeyChecked == entry.getKey()) {
				KeyPresent = true;
			}
		}
		
		System.out.println("Does Key " + KeyChecked + " exists: " + KeyPresent);
        
		while(it.hasNext()) {
			Map.Entry<Integer, String> value = it.next();
			
			if(ValueChecked== value.setValue("Shivam")) {
				ValuePresent = true;
			}
		}
		
		System.out.println("Does Value " + ValueChecked + " Exists: " + ValuePresent);
	}
	
}
