//뼈대의 역할
public class Base {
	double areaSize = 0;
	String name;
	
	Base(String name) {
		this.name = name;
	}
	
	//빈칸으로 만들어 놓은 이유는 이름을 사용하기 위해서
	public void inputData() {
		
	}
	
	public void calcArea() {
		
	}
	
	public void printSize() {
		this.calcArea();
		System.out.println(name + "의 넓이는 " + this.areaSize);
	}
}