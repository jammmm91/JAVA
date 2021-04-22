import java.util.Scanner;

public class Homework3 {
   public static void main(String[] args) {
         //클래스명(객체명/함수명) 변수명 = new 클래스명(객체명/함수명)();
          저금통1 box1 = new 저금통1();
                        
      for (int i = 0; i < 999999; i++) {
         System.out.println("원하시는 메뉴를 선택해주세요.");
         System.out.println("1 : 돈 입금");
         System.out.println("2 : 돈 입금 + 메세지 입력");
         System.out.println("종료를 원하시면 crash를 입력하세요.");
         
         Scanner s = new Scanner(System.in);
         String userInputString = s.nextLine();
         
         if(userInputString.equals("1")) {
            System.out.println("입금할 금액을 입력하세요 : ");
            Scanner s1 = new Scanner(System.in);
            String userInputString1 = s1.nextLine();
            box1.deposit(Integer.parseInt(userInputString1));
            System.out.println("당신이 입금한 금액 : "+ userInputString1);
            box1.withdraw();
            
         }else if(userInputString.equals("2")){
            System.out.println("입금할 금액을 입력하세요 : ");
            Scanner s2 = new Scanner(System.in);
            String userInputString2 = s2.nextLine();
            box1.deposit(Integer.parseInt(userInputString2));
            System.out.println("메세지를 입력하세요 : ");
            Scanner s3 = new Scanner(System.in);
            String userInputString3 = s3.nextLine();
            System.out.println("당신이 입금한 금액 : "+ userInputString2 +" 메세지 : "+ userInputString3);
            //System.out.println("당신이 입금한 총금액은 ");
            box1.withdraw();
                        
         }else if(userInputString.equals("crash")) {
            break;
         }
         
         //System.out.println(userInputString);
         //int convertNumber = Integer.parseInt(userInputString);
         // "123" => 123
         // 123 => "123"      "" + 123
         }
      }
   }