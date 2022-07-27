
public class Patient {
	String patientName;
	double height, weight;
	
	Patient(String name, double height, double weight){
		this.patientName = name;
		this.height = height;
		this.weight = weight;
	}
	
	double computeBMI() {
		return (weight/(height*height))*703;
		}

	public static void main(String[] args) {
		Patient patient = new Patient("Shivam", 177/2.54, 59*2.2);
		System.out.println("Name " + patient.patientName + "\nBMI: " + patient.computeBMI());

	}

}
