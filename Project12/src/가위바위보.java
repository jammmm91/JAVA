import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {
	public static void main(String[] args) {
		System.out.println("가위(0), 바위(1), 보(2)중 하나를 입력하세요");
		
		Scanner s1 = new Scanner(System.in);
		int userNum = s1.nextInt();
		
		
		if(userNum < 0 || userNum > 2) {
			System.out.println("잘못 입력했잖아 새끼야");
		}
		
		
		
		if (userNum == 0) {
			System.out.println("당신은 가위를 내셨군요?");
		} else if (userNum == 1) {
			System.out.println("당신은 바위를 내셨군요?");
        } else if (userNum == 2) { 
			System.out.println("당신은 보를 내셨군요?");
        }
		
		Random r1 = new Random();
		int comNum = r1.nextInt(3);
		
		if (comNum == 0) {
			System.out.println("저는 가위를 냈습니다!"); 
		} else if (comNum == 1) {
			System.out.println("저는 바위를 냈습니다!"); 
		} else if (comNum == 2) {
			System.out.println("저는 보를 냈습니다!"); 
		}
				
	}
}
