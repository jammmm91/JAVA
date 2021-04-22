import java.util.Scanner;
import java.util.regex.Pattern;

public class 저금통1_1 {
	int coins = 0;
	public void deposit2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금하실 금액을 입력해 주세요");
		String userInputString = scanner.nextLine();
		if (Pattern.matches("^[0-9]*$", userInputString)) {
			int coin = Integer.parseInt(userInputString);
			System.out.println("딸그랑");
			coins = coins + coin;
		} else {
			System.out.println("금액 입력이 잘못 되었습니다");
		}
//		try {
//			int coin = Integer.parseInt(userInputString);
//			System.out.println("딸그랑");
//			coins = coins + coin;
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
	}
}
