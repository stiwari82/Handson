
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class CountryCapital {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		properties.setProperty(" Uttar Pradesh ", " Lucknow ");
		properties.setProperty(" Bihar ", " Patna ");
		properties.setProperty(" Maharashtra ", " Mumbai ");
		properties.setProperty(" Karnatka ", " Bangalore ");
		
		
		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> it = set.iterator();
		
		while(it.hasNext()) {
			Entry<Object, Object> empty = it.next();
			System.out.println(empty);
		}
		

	}

}
