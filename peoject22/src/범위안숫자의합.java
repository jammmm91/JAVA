
public class 범위안숫자의합 {
	public static void main(String[] args) {
		int total = 0;		// 변수선언
		int eventotal = 0;	// 변수선언
		int oddtotal = 0;	// 변수선언
		for (int i = 0; i < 100; i++) {
			int number = i + 1;
			//1 ... 100
			
			total = total + number; 
			
			if (number % 2 == 0) {
				eventotal = eventotal + number;
			} else {
				oddtotal = oddtotal + number;
			}
		} 
		System.out.println("1-100 까지의 합은 " + total + " 입니다");
		System.out.println("1-100 까지 짝수의 합은 " + eventotal);
		System.out.println("1-100 까지 홀수의 합은 " + oddtotal);
    }
}