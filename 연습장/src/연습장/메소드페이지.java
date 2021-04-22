package 연습장;

import java.util.Scanner;

public class 메소드페이지 {
	public String multi(int a, int b) {
		return "곱하기 : " + (a * b);
	}

	public String sum(int a, int b) {
		return "더하기 : " + (a + b);
	}

	public String division(int a, int b) {
		return "나누기 : " + Math.round((a / (double) b) * 100) / 100.0;
	}
	public void Multi(int a, int b) {
		System.out.println("곱하기 : " + (a * b) + "\n");
	}

	public void Sum(int a, int b) {
		System.out.println("더하기 : " + (a + b) + "\n");
	}

	public void Division(int a, int b) {
		System.out.println("나누기 : " + Math.round((a / (double) b) * 100) / 100.0 + "\n");
	}

	public static void main(String[] args) {

		메소드페이지 Method = new 메소드페이지();
		String result = Method.multi(100, 15);
		String result1 = Method.sum(100, 15);
		String result2 = Method.division(100, 17);
		System.out.println(result + "  " + result1 + "  " + result2);

	}
}
