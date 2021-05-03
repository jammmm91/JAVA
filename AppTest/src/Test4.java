import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) throws Exception {
		// 입력처리 방법 1
//		System.setIn(new FileInputStream("src/input4.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 배열길이 5
		int m = sc.nextInt(); // 더하기 횟수 5
		int k = sc.nextInt(); // 한 숫자 연속해서 더하기 횟수 2

		// 입력처리 방법 2
//		String[] e = sc.nextLine().split(" ");
//		int n = Integer.parseInt(e[0]);
//		int m = Integer.parseInt(e[1]);
//		int k = Integer.parseInt(e[2]);

		// 배열만들기 (배열길이가 정해져 있으므로)
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); //arr[0]=1, arr[1]=2, ~ arr[4] = 5
		}
		Arrays.sort(arr); // 오름차순으로 정렬

		// 로직구현
		int first = arr[n - 1]; // 최댓값 5
		int second = arr[n - 2]; // 최솟값 4
		int sum = 0; // 총합계산을 위한 변수
		
		int countK = k; // 한 숫자 최대 더하기 횟수 계산을 위한 변수 k=2
		// 5+5+4+5+5

		for (int i = 0; i < m; i++) { // m=5

			if (countK == 0) {
				sum += second; //+4
				countK = k;	   // 2
			} else {
				sum += first; // 5+5+5+5
				countK -= 1; //  1, 0, 1, 0
			}
		}
		System.out.println(sum);
	}
}
