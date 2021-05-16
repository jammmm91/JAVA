
import java.util.Scanner;

public class BJ2588 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int userInput1 = s.nextInt();
		int userInput2 = s.nextInt();
		
		String str = Integer.toString(userInput2);
		String [] splitStr = str.split("");
		
				
		for (int i = splitStr.length-1; i >= 0; i--) {
			System.out.println(userInput1*Integer.parseInt(splitStr[i]));
		}
		System.out.println(userInput1 * userInput2);		
	}
}