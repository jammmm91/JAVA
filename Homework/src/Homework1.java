import java.util.Random;
import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		System.out.println("화면에 아무 숫자나 입력하세요:)" );
		
		int userInputNumber = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print(">>");
		userInputNumber = s.nextInt();
		
		System.out.println("이번엔 제가 랜덤숫자를 생성합니다:)" );
		
		int randNum;
		randNum = 0;
		
		Random r = new Random();
		randNum = r.nextInt(10);
		System.out.println(">>"+randNum);
		
		int a = userInputNumber+randNum;
		int b = userInputNumber-randNum;
		int c = userInputNumber*randNum;
		double d = (int)userInputNumber/randNum;
		int e = userInputNumber%randNum;

		
		System.out.println("지금부터 제가 사칙연산을 합니다:)" );
		System.out.println("입력된 두개의숫자 "+userInputNumber+","+randNum+" 을 더하면 "+a+" ♥"
				           +"\r입력된 두개의숫자 "+userInputNumber+","+randNum+" 을 빼면 "+b+" ♥"
				           +"\r입력된 두개의숫자 "+userInputNumber+","+randNum+" 을 곱하면 "+c+" ♥"
				           +"\r입력된 두개의숫자 "+userInputNumber+","+randNum+" 을 나누면 "+d+" ♥"
				           +"\r입력된 두개의숫자 "+userInputNumber+","+randNum+" 의 나머지는 "+e+" ♥");
			}
}