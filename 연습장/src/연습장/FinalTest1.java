package 연습장;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FinalTest1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("배열사이즈입력");
		int size = s.nextInt();
		int[] arr = new int[size];
		
		System.out.println("배열안의숫자입력");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println("Divisor입력");
		int D = s.nextInt();

		int[] answer = {};
		Set<Integer> a = new TreeSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % D == 0) {
				a.add(arr[i]);
			}
		}
		
		if (a.isEmpty()) {
			a.add(-1);
		}
		
		answer = new int[a.size()];
		
		Arrays.sort(answer);
		
		System.out.println(a);
	}
}