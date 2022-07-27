
class Employee extends Person {
	double annual_salary;
	int yoj;
	String nat_ins_num;
	
	public Employee(double annual_salary, int yoj, String nat_ins_num, String eName) {
		super(eName);
		this.annual_salary = annual_salary;
		this.yoj = yoj;
		this.nat_ins_num = nat_ins_num;
		
		
	}
	
	public double getAnnualSalary() {
		return annual_salary;
	}
	
	public int getYoj()
	{
		return yoj;
	}
	
	public String getNatInsNum() {
		return nat_ins_num;
		
	}
}
