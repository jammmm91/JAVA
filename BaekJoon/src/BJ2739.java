import java.util.Scanner;

public class BJ2739 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(input + " * " + i + " = " + input*i);
		}
	}
}