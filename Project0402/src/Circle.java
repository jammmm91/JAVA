import java.util.Scanner;

public class Circle extends Base { //Base class 의 상속을 받았다
	double baseLine = 0;
	double height = 0;
	double pi = 3.14;
	
	Circle(String name) {
		super(name); //상속한곳(Base)에 있는 name을 실행하라!
	}
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("원의 넓이를 구하겠습니다");
		System.out.println("반지름을 입력해주세요.");
		String inputText = scanner.nextLine();
		this.baseLine = Double.parseDouble(inputText);
	}
	
	public void calcArea() {
		this.areaSize = this.baseLine * this.baseLine * this.pi;
	}
}