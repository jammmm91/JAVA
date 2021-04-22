package 연습장;

import java.util.Arrays;
import java.util.Random;

public class 이중배열 {
	public static void main(String[] args) {

		int arr[][] = new int[5][5];

		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int randNum = r.nextInt(100);
				arr[i][j] = randNum;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}