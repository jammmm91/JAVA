package 연습장;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTest2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];

		for (int i = 0; i < size; i++) {
			arr1[i] = s.nextInt();
		}
		for (int i = 0; i < size; i++) {
			arr2[i] = s.nextInt();

		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String answer = "T";
		
		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] == arr2[i]) {
				answer = "T";
			} else {
				answer = "F";
				break;
			}
		} System.out.println(answer);
	}
}