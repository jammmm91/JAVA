import java.util.Arrays;
import java.util.Random;

public class Project1 {
	public static void main(String[] args) {
//		int[] score = {0,0,0,0,0,0,0,0,0,0};
		int[] score = new int[10];
		
		//score에 점수를 넣어줘
		insertNumber(score);
		//확인
		System.out.println(Arrays.toString(score));
		//score의 총합을 구해줘
		calcScore(score);
		
//		int[] score2 = new int[20];
//		insertNumber(score2);
//		System.out.println(Arrays.toString(score2));
	}
	public static void insertNumber(int[] s) {
		Random r1 = new Random();
		for (int i = 0; i < s.length; i++) {
			s[i] = r1.nextInt(101);
		}
	}
	
	public static void calcScore(int[] s) {
		int total = 0;
		for (int i = 0; i < s.length; i++) {
		total = total + s[i];
		}
		System.out.println("총합 : " + total);
	}
}