
public class Student extends Person1 {
	int studid;
	
	public Student(String n, int byear, int id) {
		super(n, byear);
		studid = id;
	}
	
	public String toString() {
		return "Student[super= " + super.toString()+ " studentid= " + studid + "]"; 
	}

}
