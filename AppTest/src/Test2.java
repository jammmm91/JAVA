import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String userInput = s.nextLine();
		String[] arr = userInput.split(" ");
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}