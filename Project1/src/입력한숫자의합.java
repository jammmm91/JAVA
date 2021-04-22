import java.util.Scanner;

public class 입력한숫자의합 {
	public static void main(String[] args) {
		System.out.println("화면에 2개의 숫자를 입력해주세요!");
		
		// 숫자입력
		int userInputNumber = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		userInputNumber = s.nextInt();		
		
		
		System.out.print("두번째 숫자 : ");
		int userInputNumber2 = s.nextInt();
				
		System.out.println("당신이 입력한 숫자 "+userInputNumber+ ", " 
		+userInputNumber2+"의 합계는"+ (userInputNumber + userInputNumber2));
	}
}