
public class CollegeStudent extends Student {
	String collegeName;
	String year;
	
	public CollegeStudent(int id, String cName, String year) {
		super(id);
		collegeName = cName;
		this.year = year;
	}
	
	public String toString() {
		
		return "CollegeStudent[super= " + super.toString() + ", collegeName= " + cName+ ", studyingYear" +_year+ "]";
	}
}
