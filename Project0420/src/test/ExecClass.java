package test;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		ArrayList<Customer> visitor = new ArrayList<Customer>();
		ArrayList<Score> score = new ArrayList<Score>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 99999; i++) {
			System.out.println("원하시는 메뉴를 선택해주세요");
			System.out.println("1: 방문자 입력");
			System.out.println("2: 전체 방문자 출력");
			System.out.println("3: 별점 입력");
			System.out.println("4: 전체 별점 출력");
			System.out.println("5: 종료");
			
			String userInput = scanner.nextLine();
			
			if (userInput.equals("1")) {
				// 방문자 입력 구현
				// case 1
				System.out.println("이름을 입력해주세요");
				String name = scanner.nextLine();
				System.out.println("연락처를 입력해주세요");
				String phone = scanner.nextLine();
				visitor.add(new Customer(name, phone));
				
				// case 2
//				visitor.add(new Customer());
				
			} else if (userInput.equals("2")) {
				// 전체 출력 구현
				for (int j = 0; j < visitor.size(); j++) {
					System.out.println(visitor.get(j).name + ", 연락처 : " + visitor.get(j).phone);
				}
				
			} else if (userInput.equals("3")) {
				System.out.println("별점 입력할 연락처를 입력해주세요.");
				String phoneNumber = scanner.nextLine();
				String userName = "";
				String userPhone = "";
				for (int j = 0; j < visitor.size(); j++) {
					if (visitor.get(j).phone.equals(phoneNumber)) {
						userName = visitor.get(j).name;
						userPhone = visitor.get(j).phone;
					}
				}
				if (userName.equals("")) {
					System.out.println("입력한 번호의 고객이 없습니다.");					
				} else {
					System.out.println("별점을 입력해주세요 (1~5)");
					String scoreString = scanner.nextLine();
					try {
						int scoreNumber = Integer.parseInt(scoreString);
						score.add(new Score(userName, userPhone, scoreNumber));
					} catch (Exception e) {
				}
			}
				
			} else if (userInput.equals("4")) {
				int totalScore = 0;
				for (int j = 0; j < score.size(); j++) {
					System.out.println(score.get(j).phone + "의 별점 : " + score.get(j).score);
					totalScore = totalScore + score.get(j).score;
				}
				System.out.println("별점 총합 : " + totalScore + ", 평균 별점 : " + ((double)totalScore / score.size()));
			} else if (userInput.equals("5")) {
				break;
				
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}