import java.util.Arrays;
import java.util.Iterator;

public class 성적메인 {
	public static void main(String[] args) {
		
		성적메소드 [] s = {new 성적메소드("김재민", 72, 82),
						new 성적메소드("장준영", 91, 75),
						new 성적메소드("임시진", 53, 45),
						new 성적메소드("최성운", 70, 87),
						new 성적메소드("백두용", 55, 73),
						new 성적메소드("김승현", 83, 96),
						new 성적메소드("이지효", 71, 82),
						new 성적메소드("박성철", 83, 35),
						new 성적메소드("김정연", 35, 38),
						new 성적메소드("박준형", 25, 77) };
		
//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
//		}
				
		int totalMiddleScore = 0;
		int totalFinalScore = 0;
		int totalScore = 0;

		for (int i = 0; i < s.length; i++) {
			totalMiddleScore = totalMiddleScore + s[i].middleScore;
			totalFinalScore = totalFinalScore + s[i].finalScore;
			totalScore = totalScore + s[i].totalScore;
		}
		
		double avgMiddleScore = (double)totalMiddleScore / s.length;
		double avgFinalScore = (double)totalFinalScore / s.length;
		double avgTotalScore = (double)totalScore / s.length;
		
		System.out.println("중간고사 총점: " + totalMiddleScore + " , 중간고사 평균 : " + avgMiddleScore);
		System.out.println("기말고사 총점: " + totalFinalScore + " , 기말고사 평균 : " + avgFinalScore);
		System.out.println("전체 총점: " + totalScore + " , 젠체 평균 : " + avgTotalScore);
		
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if(s[i].totalScore < s[j].totalScore) {
					성적메소드 temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(s));
	}
}