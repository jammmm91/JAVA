
import java.util.Random;

//4*4배열 만들어서 3*3 숫자 채우고 합 구하기

public class Homework2_2 {
	public static void main(String[] args) {
//		int[][] number = new int[4][4];
		int[][] number = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

		Random r = new Random();
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				number[i][j] = r.nextInt(10);
			}
		}

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[0].length-i; j++) {
				System.out.print("(" + i + ", " + j + ") : " + number[i][j] + "    ");
			}
			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				number[i][3] = number[i][3] + number[i][j]; // x축 합계
				number[3][j] = number[3][j] + number[i][j]; // y축 합계
				number[3][3] = number[3][3] + number[i][j]; // 총합계
			}
		}
//
		System.out.println("계산 결과");
//		for (int i = 0; i < number.length; i++) {
//			for (int j = 0; j < number[0].length; j++) {
//				System.out.print("(" + i + ", " + j + ") : " + number[i][j] + "    ");
//			}
//			System.out.println();
//		}
	}
}