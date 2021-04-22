package test;

import java.util.Scanner;

public class Customer {
	String name;
	String phone;
		
	//case1 에서 사용
	Customer (String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	//case2 에서 사용
	Customer() {
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = s.nextLine();
		System.out.println("연락처를 입력하세요");
		String phone = s.nextLine();
	}
}
	