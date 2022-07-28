
public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeDB empDB = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "Shivam", "shivam82@gmail.com", "Male", 45000);
		Employee emp2 = new Employee(102, "Ashutosh", "ashutosh765@gmail.com", "Male", 43000);
		Employee emp3 = new Employee(103, "Kritika", "kritika.5616@gmail.com", "Female", 40000);
		Employee emp4 = new Employee(5, "Shivangi", "shi.vangi@gmail.com","Female", 44000);
		
		
		empDB.addEmployee(emp1);
		empDB.addEmployee(emp2);
		empDB.addEmployee(emp3);
		empDB.addEmployee(emp4);
		
		
		for(Employee emp :empDB.listAll()) {
			System.out.println(emp.GetEmployeeDetails());
		}
		
		System.out.println();
		empDB.deleteEmployee(2);
		
		for(Employee emp: empDB.listAll()) {
			System.out.println(emp.GetEmployeeDetails());
		}
		
		System.out.println();
		System.out.println(empDB.showPaySlip(102));
		

	}


}
