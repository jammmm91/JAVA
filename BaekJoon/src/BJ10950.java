import java.util.Scanner;

public class BJ10950 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		
		for (int i = 0; i < T; i++) {
			int input1 = s.nextInt();
			int input2 = s.nextInt();
			System.out.println(input1 + input2);
		}
	}
}