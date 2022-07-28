import java.util.Iterator;
import java.util.Vector;

class Employee{
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Employee[id = " + id + ", name = " + name + ", address = " + address + ", salary =" + salary + "]";
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(101, "Shivam", "Varanasi", 40000.00));
		list.add(new Employee(102, "Rahul", "Siwan", 35000.00));
		list.add(new Employee(101, "priyanshu", "Lucknow", 38000.00));
		
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
