
import java.util.Scanner;

public class 카우프지수 {
	
	public static void main(String[] args) {
		int height = 0;
		int weight = 0;
		카우프지수메소드 bodyprofile = new 카우프지수메소드();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해 주세요(숫자만입력)");
		System.out.println("<키의단위는 'cm' 몸무게의 단위는 'kg' 입니다>");
		String userInputText = s.nextLine();
		height = Integer.parseInt(userInputText);
		String userInputText2 = s.nextLine();
		weight = Integer.parseInt(userInputText2);
		
		System.out.println("당신의 키는"+height+"cm, 당신의몸무게는"+weight+"kg 이군요?");
		System.out.println("\n당신의 카우프 지수를 알려드리겠습니다 :)");
		
//		bodyprofile.getResult(height,weight);			
		
	}
	

}

//----------------------------------------------------------


//public class 카우프지수 {
//	public static void main(String[] args) {
//		카우프지수메소드 kaup = new 카우프지수메소드();
//		
//		kaup.userInput();
//		kaup.calcKaup();
//	}
//}