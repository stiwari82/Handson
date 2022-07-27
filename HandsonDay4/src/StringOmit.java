import java.util.*;


public class StringOmit {

public String conCat(String abc, String xyz) {
	if(abc.length()!=0 && xyz.length()!=0 && abc.charAt(abc.length()-1) == xyz.charAt(0)) {
		return abc + xyz.substring(1);
	}
	
	return abc + xyz;
}	

	public static void main(String[] args) {
		StringOmit so = new StringOmit();
		String abc = "food";
		String xyz = "floor";
		System.out.println("The given string are; "+ abc + " and " + xyz);
		System.out.println("The string after concatination are: " + so.conCat(abc, xyz));
		
		
		

	}

}
