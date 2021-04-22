import java.util.Random;

public class 짝수홀수음수 {
	public static void main(String[] args) {
		Random r1 = new Random();
		int randNum = r1.nextInt();
		randNum = randNum % 100;
		// 1 => 1, 2 => 2 ....99 => 99, 100 => 0
		
		System.out.println(("랜덤하게 생성된 숫자:" + randNum));
		
		if (randNum % 2 == 0 && randNum > 0) {
			System.out.println("짝수");
		} else if (randNum > 0) {
			System.out.println("홀수");
		} else if (randNum < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
	}
}
