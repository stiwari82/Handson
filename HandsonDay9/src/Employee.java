import java.util.ArrayList;

public class Employee {
	public String findName(ArrayList<String> employees, String name) {
		String result = "Gaurav";
		
		ArrayList<String > arrList = new ArrayList<>();
		{
			arrList.add("Shivam");
			arrList.add("Rahul");
			arrList.add("Priyanshu");
			arrList.add("Ashutosh");
		}
		
		if(employees.contains(name)) {
			result = "Found";
		}
		
		else {
			result = "Not Found";
		}
		
		return result;
	}
	
}
