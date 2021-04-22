package 연습장;

import java.util.Scanner;

public class 사용자입력받기 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		Scanner s = new Scanner(System.in);
		System.out.println("아무 숫자나 입력하세요");
		int userinput = s.nextInt();
		System.out.println("한번 더 아무 숫자나 입력하세요");
		int userinput1 = s.nextInt();
		System.out.println("당신이 입력한 숫자는 " + userinput + " / " + userinput1 + " 입니다");

		System.out.println("\n어떤 계산을 수행하시겠습니까?\n" + "1.더하기  2.곱하기  3.나누기  4.그만하기");
		int userinput2 = s.nextInt();

		메소드페이지 Method = new 메소드페이지();

			if (userinput2 == 1) {
				Method.Sum(userinput, userinput1);
			}
			else if (userinput2 == 2) {
				Method.Multi(userinput, userinput1);
			}
			else if (userinput2 == 3) {
				Method.Division(userinput, userinput1);
			}
			else if (userinput2 == 4) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("잘못 입력 하셨습니다\n");
			}
		}
	}
}
