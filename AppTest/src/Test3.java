import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("배열사이즈입력");
		int userInputX = s.nextInt();
		int userInputY = s.nextInt();

		System.out.println((userInputX * userInputY) + "개 숫자 입력");

		int[][] arr = new int[userInputX][userInputY];

		for (int i = 0; i < userInputX; i++) {
			for (int j = 0; j < userInputY; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println("특정좌표를 입력하세요");
		int userIn1 = s.nextInt() - 1;
		int userIn2 = s.nextInt() - 1;
		int horizontal = 0;
		int vertical = 0;

		for (int j = 0; j < userInputY; j++) {
			horizontal = horizontal + arr[userIn1][j];
		}
		for (int i = 0; i < userInputX; i++) {
			vertical = vertical + arr[i][userIn2];
		}
		System.out.println(vertical + " " + horizontal);
	}
}