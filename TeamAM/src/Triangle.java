
public class Triangle {
	String name;
	double length;
	double height;
	double width;

	Triangle(String name, double length, double height) {
		this.name = name;
		this.length = length;
		this.height = height;
		this.width = width;

	}

	public void width() {
		double width = (double) length * height / 2;
		System.out.println("width : " + width+"\n");
	}

}
