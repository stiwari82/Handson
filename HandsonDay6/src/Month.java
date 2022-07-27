import java.util.ArrayList;

public class Month {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList();
		
	    arrList.add("January");
	    arrList.add("February");
	    arrList.add("March");
	    arrList.add("April");
	    arrList.add("May"); 
	    arrList.add("June");
	    arrList.add("July");
	    arrList.add("August");
	    arrList.add("September");
	    arrList.add("October");
	    arrList.add("November");
	    arrList.add("December");
	    
	    System.out.println("Array List Elements are: ");
	    
	    for(int i=0; i<arrList.size(); i++) {
	    	System.out.println(arrList.get(i));
	    }
	    

	}

}
