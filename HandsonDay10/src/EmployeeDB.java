import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
	List<Employee> employeeDB = new ArrayList<>();
	
	public boolean addEmployee(Employee e) {
		return employeeDB.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = employeeDB.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			
			if(emp.getEmpId()== empId) {
			isRemoved = true;
			it.remove();
		}
    }
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id = " + empId;
		
		for(Employee e: employeeDB) {
			if(e.getEmpId() == empId) {
				paySlip = "PaySlip for employee id " +empId + " Is :" + e.getEmpSalary(); 
			}
		}
		
		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] empArray = new Employee[employeeDB.size()];
		for(int i=0; i<employeeDB.size(); i++) {
			empArray[i] = employeeDB.get(i);
		}
		
		return empArray;
	}

}
