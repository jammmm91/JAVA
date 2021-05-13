import java.util.Scanner;

public class BJ10869 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int userInput1 = s.nextInt();
		int userInput2 = s.nextInt();
		
		System.out.println(userInput1 + userInput2);
		System.out.println(userInput1 - userInput2);
		System.out.println(userInput1 * userInput2);
		System.out.println(userInput1 / userInput2);
		System.out.println(userInput1 % userInput2);
	}

}