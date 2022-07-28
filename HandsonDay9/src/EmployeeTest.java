import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
	
	Employee emp = new Employee();
	ArrayList<String > arrList = new ArrayList<>();
	{
		arrList.add("Shivam");
		arrList.add("Rahul");
		arrList.add("Priyanshu");
		arrList.add("Ashutosh");
	}
	
	@Test
	void testFindName() {
		System.out.println(arrList);
		String str = emp.findName(arrList, "Ashutosh");
		assertEquals("Found", str);
		System.out.println(str);

	}
	

}
