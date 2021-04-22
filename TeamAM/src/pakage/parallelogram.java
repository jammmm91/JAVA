package pakage;

import java.util.Scanner;

public class parallelogram extends baseMethod {
	double baseLine = 0;
	double height = 0;
	
	parallelogram(String name) {
		super(name);
	}
	
	public void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println(this.name + "의 넓이를 구하겠습니다");
		System.out.println("밑변의 길이를 입력해 주세요");
		String inputText = s.nextLine();
		this.baseLine = Double.parseDouble(inputText);
		System.out.println("높이의 길이를 입력해 주세요");
		String inputText2 = s.nextLine();
		this.height = Double.parseDouble(inputText2);
	}
	
	public void calcArea() {
		this.area = this.baseLine * this.height;
	}
}