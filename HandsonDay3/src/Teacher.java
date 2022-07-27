public class Teacher extends Person1{
	double salary;
	String subject;
	
	public Teacher(String n, int byear, double s, String sub) {
		super(n, byear);
		salary = s;
		subject = sub;
	}
	
	public String toString() {
		return "Employee[super= "+ super.toString()+ " , salary= " + salary + ", subject= " + subject+ "]";
		
	}
}