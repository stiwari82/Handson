import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

 class CountryCapitals {

	private HashMap<String, String> M1;
	
	public CountryCapitals() {
		M1 = new HashMap<String, String>();
	}
	
	public HashMap<String, String> saveCountryCapitals(String CountryName, String Capital){
		M1.put(CountryName, Capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> map = itr.next();
			if(map.getValue().equals(capitalName)) {
				return map.getKey();
			}
		}
		
		return null;
	}
	
	public HashMap<String, String> swapKeyValue(){
		HashMap<String , String> M2 = new HashMap<String, String>();
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String , String> map = itr.next();
		    M2.put(map.getValue(), map.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList(){
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> map = itr.next();
			list.add(map.getKey());
		}
		
		return list;
	}

}

 


public class CC {

	public static void main(String[] args) {
		CountryCapitals countryMap = new CountryCapitals();
		
		countryMap.saveCountryCapitals(" India ", " New Delhi ");
		countryMap.saveCountryCapitals(" Japan ", " Tokyo ");
		countryMap.saveCountryCapitals(" USA ", " Washington DC ");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		HashMap<String, String> M2 = countryMap.swapKeyValue();
		System.out.println(M2);

	}

}
