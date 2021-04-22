import java.util.Scanner;

public class Homework3 {
   public static void main(String[] args) {
         //클래스명(객체명/함수명) 변수명 = new 클래스명(객체명/함수명)();
	   저금통1 box1 = new 저금통1();
                        
      for (int i = 0; i < 9999999; i++) {
         System.out.println("원하시는 메뉴를 선택해주세요.");
         System.out.println("1 : 돈 입금");
         System.out.println("2 : 돈 입금 + 메세지 입력");
         System.out.println("종료를 원하시면 crash를 입력하세요.");
         
         Scanner s = new Scanner(System.in);
         String userInputString = s.nextLine();
         
         if(userInputString.equals("1")) {  			// 문자열은 equals를 이용해서 비교해야 함
            System.out.println("입금할 금액을 입력하세요 : ");
            Scanner s1 = new Scanner(System.in);
            String userInputString1 = s1.nextLine();    // 중괄호 안에서 만든 변수는 중괄호 안에서만 사용 가능
            box1.deposit(Integer.parseInt(userInputString1));
            System.out.println("당신이 입금한 금액 : "+ userInputString1 + "\n----------------------");
                       
         }else if(userInputString.equals("2")){
            System.out.println("입금할 금액을 입력하세요 : ");
            Scanner s2 = new Scanner(System.in);
            String userInputString2 = s2.nextLine();
            box1.deposit(Integer.parseInt(userInputString2));
            System.out.println("메세지를 입력하세요 : ");
            Scanner s3 = new Scanner(System.in);
            String userInputString3 = s3.nextLine();
            System.out.println("당신이 입금한 금액 : "+ userInputString2 +" 입력메세지 : "+ userInputString3 + "\n----------------------");
            
                        
         }else if(userInputString.equals("crash")) {
        	 box1.withdraw();
        	 break;
         }
         else
        	 System.out.println("잘못 입력 하셨습니다" + "\n----------------------");
      }
   }
}