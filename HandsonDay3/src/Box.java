
public class Box {
	private double width;
	private double height;
	private double depth;
	
	Box(int width, int height, int depth ){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double getvolume() {
		return width*height*depth;
	}
	

	public static void main(String[] args) {
		Box box = new Box (10, 20,30);
		System.out.println("The volume of Box is " + box.getvolume());

	}

}
