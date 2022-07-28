
public class Employee {
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	
	 Employee(int id, String name, String mail, String gen, float sal) {
	    super();
		empId = id;
		empName = name;
		email = mail;
		gender = gen;
		salary = sal;
	
	}
	
	
	public String GetEmployeeDetails() {
		return "EmpId = " + empId + " Name = " + empName + " Email = " + email + " Gender = " + gender + " Salary = " + salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int id) {
		empId = id;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String name) {
		empName = name;
	}
	
	public String getEmpEmail() {
		return email;
	}
	
	public void setEmpEmail(String mail) {
		email = mail;
	}
	
	public String getEmpGender() {
		return gender;
	}
	
	public void setEmpGender(String gen) {
		gender = gen;
	}
	
	public float getEmpSalary() {
		return salary;
	}
	
	public void setEmpSalary(float sal) {
		salary = sal;
	}
}
