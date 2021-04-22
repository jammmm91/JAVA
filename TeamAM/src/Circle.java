import java.util.Scanner;

public class Circle {
	double r = 0;
	double pi = 3.14;

	public void Method() {
		System.out.println("원의 반지름을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String r = sc.nextLine();
		this.r = Double.parseDouble(r);

		double result = this.r * this.r* pi;
		System.out.println("원의 넓이는 " + result + "입니다.\n");
	}
	
}
