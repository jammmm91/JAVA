import java.util.ArrayList;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {

		ArrayList<Voters> voterList = new ArrayList<Voters>();
		ArrayList<Party> partyList = new ArrayList<Party>();
		
		for (int i = 0; i < 9999; i++) {
			System.out.println();
			System.out.println("==유권자 관리 프로그램==");
			System.out.println("번호를 입력해 주세요");
			System.out.println("1> 유권자정보입력");
			System.out.println("2> 입력된전체유권자");
			System.out.println("3> 전체유권자정보보기");
			System.out.println("4> 선호정당입력");
			System.out.println("5> 프로그램종료");

			Scanner s = new Scanner(System.in);
			String userInput = s.nextLine();

			//STEP1	
			if (userInput.equals("1")) {
				System.out.println("이름을 입력하세요");
				String userInput1 = s.nextLine();
				System.out.println("주소를 입력하세요");
				String userInput2 = s.nextLine();
				System.out.println("나이를 입력하세요");
				int userInput3 = s.nextInt();
				voterList.add(new Voters(userInput1, userInput2, userInput3));
			
			//STEP1
			} else if (userInput.equals("2")) {
				System.out.println("전체 유권자 정보를 출력합니다");
				for (int j = 0; j < voterList.size(); j++) {
					System.out.println((j + 1) + ") " + voterList.get(j).name + " / " + voterList.get(j).adress + " / "
							+ voterList.get(j).age);
				}
			
			//STEP2
			} else if (userInput.equals("3")) {
				int avgAge = 0;
				int temp = 0;
				int teen = 0;
				int twen = 0;
				int thir = 0;
				int four = 0;
				int fif = 0;
				int six = 0;
				int Seven = 0;

				for (int k = 0; k < voterList.size(); k++) {
					avgAge = avgAge + voterList.get(k).age;
					if (voterList.get(k).age >= 10 && voterList.get(k).age < 20) {
						voterList.get(k).age = temp + 1;
						teen = teen + voterList.get(k).age;
					} else if (voterList.get(k).age >= 20 && voterList.get(k).age < 30) {
						voterList.get(k).age = temp + 1;
						twen = twen + voterList.get(k).age;
					} else if (voterList.get(k).age >= 30 && voterList.get(k).age < 40) {
						voterList.get(k).age = temp + 1;
						thir = thir + voterList.get(k).age;
					} else if (voterList.get(k).age >= 40 && voterList.get(k).age < 50) {
						voterList.get(k).age = temp + 1;
						four = four + voterList.get(k).age;
					} else if (voterList.get(k).age >= 50 && voterList.get(k).age < 60) {
						voterList.get(k).age = temp + 1;
						fif = fif + voterList.get(k).age;
					} else if (voterList.get(k).age >= 60 && voterList.get(k).age < 70) {
						voterList.get(k).age = temp + 1;
						six = six + voterList.get(k).age;
					} else if (voterList.get(k).age >= 60 && voterList.get(k).age < 70) {
						voterList.get(k).age = temp + 1;
						Seven = Seven + voterList.get(k).age;
					}
				}
				System.out.println("10대 유권자는 " + teen + "명 입니다");
				System.out.println("20대 유권자는 " + twen + "명 입니다");
				System.out.println("30대 유권자는 " + thir + "명 입니다");
				System.out.println("40대 유권자는 " + four + "명 입니다");
				System.out.println("50대 유권자는 " + fif + "명 입니다");
				System.out.println("60대 유권자는 " + six + "명 입니다");
				System.out.println("70대 유권자는 " + Seven + "명 입니다");
				System.out.println("전체 유권자의수 : " + voterList.size() + "명 입니다");

				// 나이이기 때문에 소숫점 밑의 자리는 필요하지 않아 double로 캐스팅 하지 않았습니다
				System.out.println("유권자의 평균 나이 : " + (avgAge / voterList.size()) + "세 입니다");
				
			//STEP3 구현실패 입니다.		
			} else if (userInput.equals("4")) {
				System.out.println("이름을 입력하세요");
				String voterName = s.nextLine();
				String userName = "";
				int userAge;
				for (int j = 0; j < voterList.size(); j++) {
					if (voterList.get(j).name.equals(voterName)) {
						userName = voterList.get(j).name;
						userAge = voterList.get(j).age;
					}
				}
//				if (userName.equals("")) {
//					System.out.println("입력한 정보의 유권자가 없습니다");
//				} else {
//					System.out.println("선호 정당을 입력하세요");
//					Scanner s1 = new Scanner(System.in);
//					String userInput1 = s1.nextLine();
//					
//					if (userInput1.equals("A정당")) {
//						try {
//							partyList.add(new Party(userName, userAge, userInput1));
//						} catch (Exception e) {
//							
//						}
//					}
//				}
			} else if (userInput.equals("5")) {
				System.out.println("프로그램을 종료합니다");
				break;
			} 
		}
	}
}