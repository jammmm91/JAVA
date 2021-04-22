import java.util.Scanner;

public class Square extends Base { //Base class 의 상속을 받았다
	double baseLine = 0;
	double height = 0;
	
	Square(String name) {
		super(name); //상속한곳(Base)에 있는 name을 실행하라!
	}
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("사격형 넓이를 구하겠습니다");
		System.out.println("밑변을 입력해주세요.");
		String inputText = scanner.nextLine();
		this.baseLine = Double.parseDouble(inputText);
		System.out.println("높이를 입력해주세요.");
		inputText = scanner.nextLine();
		this.height = Double.parseDouble(inputText);
	}
	
	public void calcArea() {
		this.areaSize = this.baseLine * this.height;
	}
}

