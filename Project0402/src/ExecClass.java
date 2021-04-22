
public class ExecClass {
	public static void main(String[] args) {
		Triangle triangle = new Triangle("삼각형");
		Square square = new Square("사각형");
		Circle circle = new Circle("원");
		
		Base[] poligon = {new Triangle("삼각형"),new Square("사각형"),new Circle("원")};
		
		for (int i = 0; i < poligon.length; i++) {
			poligon[i].inputData();
			poligon[i].printSize();
		}
		
//		triangle.inputData();
//		square.inputData();
//		circle.inputData();
//		
//		triangle.printSize();
//		square.printSize();
//		circle.printSize();
	}
}
