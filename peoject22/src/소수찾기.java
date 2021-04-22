import java.util.Scanner;

public class 소수찾기 {
	public static void main(String[] args) {
		System.out.println("화면에 아무 숫자나 입력하세요:)" );
		
		Scanner s = new Scanner(System.in);
		System.out.print(">>");
		int number = s.nextInt();
		
		System.out.println("입력받은 숫자는" + number +"입니다");
				
		boolean isPrime = true;
		for (int i = 0; i < number; i++) {
			if (i < 2) {
				continue;
			}
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("소수입니다");
		} else {
			System.out.println("소수가 아닙니다");
		}
	}
}