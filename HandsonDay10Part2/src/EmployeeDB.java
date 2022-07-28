import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDB {
	LinkedList<Employee> list = new LinkedList<>();
	
	public boolean addEmployee(Employee e) {
		return list.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = list.iterator();
		
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
		
		for(Employee e: list) {
			if(e.getEmpId() == empId) {
				paySlip = "PaySlip for employee id " +empId + " Is :" + e.getEmpSalary(); 
			}
		}
		
		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] empArray = new Employee[list.size()];
		for(int i=0; i<list.size(); i++) {
			empArray[i] = list.get(i);
		}
		
		return empArray;
	}

}