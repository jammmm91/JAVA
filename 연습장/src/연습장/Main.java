package 연습장;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<Customer>();

		for (int i = 0; i < 9999; i++) {

			System.out.println();
			System.out.println("방명록을 작성해주세요");
			System.out.println("1. 방명록작성");
			System.out.println("2. 방문자확인");
			System.out.println("3. 나가기");

			Scanner s = new Scanner(System.in);
			String userInput = s.nextLine();

			if (userInput.equals("1")) {
				System.out.println("이름과 연락처를 입력하세요");
				System.out.println("이름");
				String userInput1 = s.nextLine();
				System.out.println("연락처");
				String userInput2 = s.nextLine();
				list.add(new Customer(userInput1, userInput2));

			} else if (userInput.equals("2")) {
				System.out.println("현재까지의 방문자를 출력합니다");
				for (int j = 0; j < list.size(); j++) {
					System.out.println(list.get(j).name + " / " + list.get(j).phone);

				}
			} else if (userInput.equals("3")) {
				System.out.println("시스템을 종료합니다");
				break;
			}
		}
	}
}
