import java.util.Scanner;

public class BJ2884 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int M = s.nextInt();

		if (M >= 45) {
			System.out.println(H + " " + (M - 45));
		} else if (M < 45) {
			H = H - 1;
			M = M - 45 + 60;
			if (H < 0) {
				H = H + 24;
				System.out.println((H) + " " + (M));
			} else {
				System.out.println((H) + " " + (M));
			}
		}
	}
}
