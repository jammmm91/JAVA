import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String userInput = s.nextLine();
		String[] arr = userInput.split("");
		
//		System.err.println(Arrays.toString(arr));
//		System.out.println(arr.length);

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals("A")) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}
}
