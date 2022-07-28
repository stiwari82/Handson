

public class Demo2 {
	boolean palindromeCheck(String str) {
		
		char ch[] = str.toCharArray();
		String res = "";
		
		for(int i=ch.length-1; i>=0; i--) {
			res += ch[i];
		}
		
		if(res.equals(str)) {
			return true;
		}
		
		else {
			return false;
		}
		

	}
}
