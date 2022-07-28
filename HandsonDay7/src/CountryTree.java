
import java.util.Iterator;
import java.util.TreeSet;

public class CountryTree {
	
		TreeSet<String> TS = new TreeSet<>();
		
		public TreeSet<String> saveCountryNames(String CountryName){
			TS.add(CountryName);
			return TS;
		}
		
		public String getCountry(String CountryName) {
			Iterator<String> it = TS.iterator() ;
			
			while(it.hasNext()) {
				if(it.next().equals(CountryName)) {
					return CountryName;
				}
			}
			
			return null;
		}

	}


