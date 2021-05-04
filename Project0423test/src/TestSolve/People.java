package TestSolve;

import java.util.Scanner;

public class People {
	String name;
	String address;
	int age;
	String favoriteParty = "";
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		this.name = scanner.nextLine();
		System.out.println("주소를 입력해주세요");
		this.address = scanner.nextLine();
		System.out.println("나이를 입력해주세요");
		String userInputString = scanner.nextLine();
		try {
			this.age = Integer.parseInt(userInputString);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public String toString() {
		String printString = this.name + " : "
				+ this.address + " (" + this.age + ") " + "선호 정당 " + this.favoriteParty;
		return printString;
	}
}
