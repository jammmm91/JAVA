import java.util.Random;

public class 랜덤숫자 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int randNum;
		randNum = 0;
		
		Random r2 = new Random();
		randNum = r2.nextInt(10);     //0-9까지의 10개숫자 안에서 랜덤숫자를 출력
		randNum = r2.nextInt(11) + 1;   //+1을 붙이면 출력되는 값에 +1된 값을 출력
		
		System.out.println(randNum);
	}
}
