import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2293 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
//		Scanner s = new Scanner(System.in);
//		int N = s.nextInt();
//		int K = s.nextInt();
		
		int[] list = new int[N];
		int[] dp = new int[K+1];
		dp[0] = 1;

		for (int i = 0; i < N; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요!!");
			list[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = list[i]; j <= K; j++) {
				dp[j] = dp[j] + dp[j - list[i]];
			}
		}
		System.out.println(dp[K]);
	}
}