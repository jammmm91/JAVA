import java.util.Arrays;
import java.util.Scanner;

public class Test4_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("수열의 길이를 입력하세요");
		int N = s.nextInt();
		System.out.println("수가 더해지는 횟수를 입력하세요");
		int M = s.nextInt();
		System.out.println("특정 숫자가 더해지는 최대횟수를 입력하세요");
		int K = s.nextInt();
		
		System.out.println("배열에 들어갈 " + N +"개의 숫자를 입력하세요");
		int[]arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		int highNum1 = arr[N-1]; // 제일 큰 숫자
		int highNum2 = arr[N-2]; // 다음 큰 숫자
		int sum = 0; // 합산을 위한 0의값을 가진 변수
		int maxCountK = K;
		
//		System.out.println(highNum1);
//		System.out.println(highNum2);
//		System.out.println(sum);
//		System.out.println(maxCountK);
		
		for (int i = 0; i < M; i++) {
			if (maxCountK == 0) {
				sum = sum + highNum2;
				maxCountK = K;
			} else {
				sum = sum + highNum1;
				maxCountK = maxCountK - 1;
			}
		}
		System.out.println("결과값");
		System.out.println(sum);
	}
}
