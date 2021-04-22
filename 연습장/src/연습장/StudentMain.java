package 연습장;

import java.util.Arrays;
import java.util.Random;

public class StudentMain {

	public static void main(String[] args) {
		Student [] arr = {
				new Student("1"),
				new Student("2"),
				new Student("3"),
				new Student("4"),
				new Student("5")
		};
		
		Random r = new Random();
		int totalScore = 0;
		double avgScore;
		for (int i = 0; i < arr.length; i++) {
			arr[i].middleScore = r.nextInt(101);
			arr[i].finalScore = r.nextInt(101);
			arr[i].sumSocre();	
					
//			System.out.println(arr[i] + "의 중간점수 : " + arr[i].middleScore + " 기말점수 : " + arr[i].finalScore
//					+ " 총점 : " + arr[i].totalScore +" 평균 : " + arr[i].avgScore);
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j].totalScore < arr[j+1].totalScore) { 
					Student temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}
			}
			System.out.println(arr[i] + "의 중간점수 : " + arr[i].middleScore + " 기말점수 : " + arr[i].finalScore
					+ " 총점 : " + arr[i].totalScore +" 평균 : " + arr[i].avgScore);
		}
	}
}