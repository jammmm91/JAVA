import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 10개의 성적 입력을 랜덤하게 받고, 총합/평균 출력

public class Prac4 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[] grades = new int[11];
		
		for (int i = 0; i <grades.length; i++) {
			grades[i] = r.nextInt(101);
		}
		System.out.println("##랜덤으로 생성된 점수들은 다음과 같습니다##");
		System.out.println(Arrays.toString(grades));
		
		int total = 0;
		for (int i = 0; i < grades.length; i++) {
			total = total + grades[i];
		}
		System.out.println("총점 : " + total);
		
		double avg = (double)total / grades.length;
		avg = (double)Math.round(avg * 100) / 100; 
		            //Math.round 소숫점둘째자리까지출력
		
		System.out.println("평균 : " + avg);
	}
}