import java.util.Scanner;

public class BJ8393 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = 0;

		for (int i = 1; i <= n; i++) {
			temp = temp + i;
		}
		System.out.println(temp);
	}
}
