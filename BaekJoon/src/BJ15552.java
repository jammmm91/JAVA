import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
				
		for (int j = 1; j <= T; j++) {
			String N = br.readLine();
			String [] arr = N.split(" ");
//			System.out.println(N);
//			System.out.println(Arrays.toString(arr));
			int [] newarr = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = Integer.parseInt(arr[i]);
			}
//			System.out.println(Arrays.toString(newarr));
			
			int A = newarr[0];
			int B = newarr[1];
			System.out.println(A + B);
		}
	}
}