import java.util.Scanner;

public class BJ14681 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input1 = s.nextInt();
		int input2 = s.nextInt();
		
		if (input1 > 0 && input2 > 0) {
			System.out.println("1");
		}
		else if (input1 < 0 && input2 > 0) {
			System.out.println("2");
		}
		else if (input1 < 0 && input2 < 0) {
			System.out.println("3");
		}
		else if (input1 > 0 && input2 < 0) {
			System.out.println("4");
		}
	}
}
