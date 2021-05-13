import java.util.Scanner;

public class BJ10430 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int userInput1 = s.nextInt();
		int userInput2 = s.nextInt();
		int userInput3 = s.nextInt();
		
		System.out.println((userInput1+userInput2)%userInput3);
		System.out.println(((userInput1%userInput3)+(userInput2%userInput3))%userInput3);
		System.out.println((userInput1*userInput2)%userInput3);
		System.out.println(((userInput1%userInput3)*(userInput2%userInput3))%userInput3);
	}

}
